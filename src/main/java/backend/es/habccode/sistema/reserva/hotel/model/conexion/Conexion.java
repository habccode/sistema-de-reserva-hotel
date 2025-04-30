package backend.es.habccode.sistema.reserva.hotel.model.conexion;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

/**
 * Clase base para manejar la conexión a una base de datos SQLite.
 * @author habccode
 * @version 1.0.0
 */
public class Conexion {
    private Connection conexion;
    private String ruta;

    // Constructor vacío
    public Conexion() {}

    // Constructor con la ruta de la base de datos
    public Conexion(String pathDB) {
        if (pathDB == null || pathDB.isEmpty()) {
            throw new IllegalArgumentException("El path de la base de datos es nulo o vacío.");
        }
        this.ruta = pathDB;
    }

    // Obtener ruta
    public String getRuta() {
        return ruta;
    }

    /**
     * Conecta a la base de datos SQLite.
     * @return conexión activa
     */
    public Connection conectar() {
        try {
            if (conexion == null || conexion.isClosed()) {
                String url = ruta.startsWith("jdbc:sqlite:") ? ruta : "jdbc:sqlite:" + ruta;
                conexion = DriverManager.getConnection(url);
            }
        } catch (SQLException e) {
            e.printStackTrace();
        }
        return conexion;
    }

    /**
     * Cierra la conexión con la base de datos.
     */
    public void cerrarConexion() {
        try {
            if (conexion != null && !conexion.isClosed()) {
                conexion.close();
                conexion = null;
            }
        } catch (SQLException e) {
            e.printStackTrace();
        }
    }
}
