package backend.es.habccode.sistema.reserva.hotel.model;

import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.HashSet;

import backend.es.habccode.sistema.reserva.hotel.model.conexion.Conexion;

public class UserServiceModel extends Conexion {

    private HashSet<UsersEntity> usuarios;

    public UserServiceModel() {
        super();
    }

    public UserServiceModel(String pathBD) {
        super(pathBD);
        usuarios = new HashSet<>();
    }

    /**
     * leer usuarios de la base de datos
     * @param sqlSentencia para obtener usuarios
     * @return una lista de usuarios
     */
    public HashSet<UsersEntity> loadUser(String sqlSentencia) {
        HashSet<UsersEntity> usuarioEntities = new HashSet<>();
        try {

            PreparedStatement sentencia = conectar().prepareStatement(sqlSentencia);
            ResultSet resultado = sentencia.executeQuery();
            while (resultado.next()) {
                String usersStr = resultado.getString("usuario");
                String contraseniaStr = resultado.getString("contraseña");
                String emailStr = resultado.getString("email");
                UsersEntity usuario = new UsersEntity(usersStr, contraseniaStr, emailStr);
                usuarioEntities.add(usuario);
            }
            return usuarioEntities;
        } catch (SQLException e) {
            e.printStackTrace();
        } finally{
            cerrarConexion();
        }
                return usuarios;
    }


    public boolean escribirUser(String sqlSentencia ,UsersEntity user){
        try {
            PreparedStatement sentecia = conectar().prepareStatement(sqlSentencia);
            sentecia.setString(1, user.getusuario());
            sentecia.setString(2, user.getContrasenia());
            sentecia.setString(3, user.getEmail());
            sentecia.executeUpdate();
            return true;
        } catch (Exception e) {
            return false;
        } finally {
            cerrarConexion();
        }

    }
    
    public boolean agregarUser(UsersEntity user){
        if (user == null) {
            return false;
        }
        String sqlSentencia = "insert into usuario (usuario,contraseña,email) values (?,?,?)";
        return escribirUser(sqlSentencia, user);
        
    }

}
