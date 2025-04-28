package backend.es.habccode.sistema.reserva.hotel.model.conexion;

import java.io.File;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
/**
 * @author: habccode
 * @version: 1.0.0
 */
public class Conexion {
    // declarar la conexion
    private Connection conexion;
    private String ruta;

    /**
     * Constructor vacio
     */
    public Conexion() {

    }

    /**
     * constructor con la ruta
     * @param pathDB la ruta de la base de datos
     */
    public Conexion(String pathDB) {
        try {
            if (pathDB == null || pathDB.isEmpty()) {
                throw new SQLException("el path no existe o es nulo: " + pathDB);
            }
            File file = new File(pathDB);
            if (!file.exists()) {
                throw new SQLException("no existes la base de datos: " + pathDB);
            }
            ruta = pathDB;
        } catch (SQLException e) {
            e.printStackTrace();
        }
    }

    //regresa la ruta
    public String getRuta(){
        return ruta;
    }

    /**
     * metodo para conectar a base de datps
     * @return
     */
    public Connection conectar(){
        try {
            if (conexion == null) {
                conexion = DriverManager.getConnection(ruta);
            }
        } catch (SQLException e) {
            e.printStackTrace();
        }
        return conexion;
    }

    /**
     * metodo para cerrar
     * la conexion de la base de datos
     */
    public void cerrarConexion(){
       try {
         if (conexion == null) {
            return;
         }
         conexion.close();
         conexion = null;
       } catch (SQLException e) {
            e.printStackTrace();
       }
    }

}
