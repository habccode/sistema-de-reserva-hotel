package backend.es.habccode.sistema.reserva.hotel.controller.abstractas;
import java.io.File;
import java.io.FileInputStream;
import java.io.InputStreamReader;
import java.util.Properties;
import backend.es.habccode.sistema.reserva.hotel.model.UserServiceModel;
import backend.es.habccode.sistema.reserva.hotel.model.UsersEntity;
import javafx.fxml.FXML;
import javafx.scene.control.TextField;
/**
 * @author: habccode
 * @version: 1.0.0
 */
public abstract class AbstractController {

    private String direccion = "";
    private String pathBD = ("src/main/resources/usuariosHotel.db");
    private UserServiceModel userServiceModel;
    private Properties propertiesIdioma;
    static UsersEntity usuarioActual;

    /**
     * Funcion para obtener la direccion guardada
     * 
     * @return direccion guardada
     */
    

     /**
      * Constructor
      */
    public AbstractController() {
        userServiceModel = new UserServiceModel(pathBD);
    }   


    /**
     * retorna el usuarioservicemodel para poder trabajar con el
     * @return UsuarioServiceModel
     */
    public UserServiceModel getUserServiceModel() {
        return this.userServiceModel;
    }


     /**
     * setea al usuario actual
     * @param usuario a ser el actual
     */
    public void setUsuarioActual(UsersEntity usuario){
        this.usuarioActual = usuario;
    }

    
    /**
     * 
     * @return
     */
    public String getDireccion() {
        return this.direccion;
    }

    /**
     * Metodo para modificar la direccion guardada
     * 
     * @param direccion nueva direccion
     */
    public void setDireccion(String direccion) {
        this.direccion = direccion;
    }




    /**
     * 
     * @param properties
     */
    public void setPropertiesIdioma(Properties properties) {
        propertiesIdioma = properties;
    }


    /**
     * 
     * @return
     */
    public Properties getPropertiesIdioma() {
        return propertiesIdioma;
    }


    /**
     * 
     * @param nombreFichero
     * @param idioma
     * @return
     */
    public Properties loadIdioma(String nombreFichero, String idioma) {
        Properties properties = new Properties();

        if (nombreFichero == null || idioma == null) {
            return properties;
        }

        String path = "src/main/resources/" + nombreFichero + "-" + idioma + ".properties";

        File file = new File(path);

        if (!file.exists() || !file.isFile()) {
            System.out.println("Path:" + file.getAbsolutePath());
            return properties;
        }

        try {
            FileInputStream input = new FileInputStream(path);
            InputStreamReader isr = new InputStreamReader(input, "UtF-8");
            properties.load(isr);
        } catch (Exception e) {
            e.printStackTrace();
        }
        return properties;
    }

    /**
     * comprueba que los textField sean correctos
     * @param campo
     * @return true/false
     */
    @FXML
    public boolean comprobarTextField( TextField campo){
        if (campo.getText() == null || campo.getText().isEmpty()) {
            return false;
        }
        return true;
    }

}
