package backend.es.habccode.sistema.reserva.hotel.model;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;

import backend.es.habccode.sistema.reserva.hotel.model.conexion.Conexion;
/**
 * @author: habccode
 * @version: 1.0.0
 */
public class UserServiceModel extends Conexion {

    private ArrayList<UsersEntity> usuarios;

    public UserServiceModel() {
        super();
    }

    public UserServiceModel(String pathBD) {
        super(pathBD);
        usuarios = new ArrayList<>();
    }

    /**
     * leer usuarios de la base de datos
     * @param sqlSentencia para obtener usuarios
     * @return una lista de usuarios
     */
    public ArrayList<UsersEntity> loadUser(String sqlSentencia) {
        ArrayList<UsersEntity> usuarioEntities = new ArrayList<>();
        try {

            PreparedStatement sentencia = conectar().prepareStatement(sqlSentencia);
            ResultSet resultado = sentencia.executeQuery();

            while (resultado.next()) {
                String userStr = resultado.getString("usuario");
                String contraseniaStr = resultado.getString("contraseña");
                String emailStr = resultado.getString("email");
                UsersEntity usuario = new UsersEntity(userStr, contraseniaStr, emailStr);
                usuarioEntities.add(usuario);
            }
        } catch (SQLException e) {
            e.printStackTrace();
        } finally{
            cerrarConexion();
        }
                return usuarioEntities;
    }


    public boolean escribirUser(String sqlSentencia ,UsersEntity user){
        try {
            PreparedStatement sentecia = conectar().prepareStatement(sqlSentencia);
            sentecia.setString(1, user.getUsuario());
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
        String sqlSentencia = "INSERT INTO usuario (usuario, contraseña, email) VALUES (?, ?, ?)";
        return escribirUser(sqlSentencia, user);
        
    }

   
      /**
     * Metodo para obtener los datos de un usuario por el email
     * @param email email del usuario buscado
     * @return usuario buscado
   
    public UsersEntity obtenerUsuariosPorEmail(String email){
        String sql = "SELECT * FROM usuarios WHERE email = '" + email + "'";
        ArrayList<UsersEntity> usuarios = loadUser(sql);
        if (usuarios.isEmpty()) {
            return null;
        }
        return usuarios.get(0);
    }   
          */

    public UsersEntity obtenerUsuariosPorEmail(String email) {
        String sql = "SELECT * FROM usuario WHERE email = ?";
        try {
            PreparedStatement stmt = conectar().prepareStatement(sql);
            stmt.setString(1, email);
            ResultSet rs = stmt.executeQuery();
            if (rs.next()) {
                return new UsersEntity(
                    rs.getString("usuario"),
                    rs.getString("contraseña"),
                    rs.getString("email")
                );
            }
        } catch (SQLException e) {
            e.printStackTrace();
        } finally {
            cerrarConexion();
        }
        return null;
    }

    /**
     * Funcion que te devuleve todos los usuarios de la base de datos
     * @return lista de usuarios
     */
    public ArrayList<UsersEntity> obtenerTodosLosUsuarios(){
        String sql = "SELECT * FROM usuario";
        return loadUser(sql);
    }

}
