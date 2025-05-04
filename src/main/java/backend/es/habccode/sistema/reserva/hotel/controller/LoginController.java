package backend.es.habccode.sistema.reserva.hotel.controller;
import java.util.ArrayList;
import java.util.List;

import backend.es.habccode.sistema.reserva.hotel.Main;
import backend.es.habccode.sistema.reserva.hotel.controller.abstractas.AbstractController;
import javafx.fxml.FXML;
import javafx.fxml.FXMLLoader;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.control.ComboBox;
import javafx.scene.control.PasswordField;
import javafx.scene.control.TextField;
import javafx.scene.text.Text;
import javafx.stage.Stage;

/**
 * @author: habccode
 * @version: 1.0.0
 */
public class LoginController extends AbstractController {
    
    private final String usuario = "primer usuario";
    private final String contrasenia = "primer usuario";


    //text usuario
    @FXML
    private Text textUsuario;

    //textfoeld usuario
    
    @FXML
    private TextField textFieldUsuario;
    
    //text contrasenia
    @FXML
    private Text textContrasenia;

    //passwordfield contrasenia
    @FXML
    private PasswordField passwordFieldContrasenia;

    //text iniciar sesion
    @FXML
    private Text textIniciarSesion;

    //boton iniciar sesion
    @FXML
    private Button buttonIniciarSesion;


    //text recuperar contrasenia
    @FXML
    private Text textRecuperarContrasenia;

    //textfield recuperar contrasenia
    @FXML
    private Button buttonRecuperarContrasenia;


    //text registrarse
    @FXML
    private Text textRegistrarse;

    //button de registrarse
    @FXML
    private Button buttonRegister;


    // boton de idioma
    @FXML
    private ComboBox comboIdioma;

  
    @FXML
    public void initialize(){
        List<String> idiomas = new ArrayList<>();
        idiomas.add("en");
        idiomas.add("es");
        comboIdioma.getItems().addAll(idiomas);
    }

    @FXML
    protected void cambiarIdioma() {
        setPropertiesIdioma(loadIdioma("idioma", comboIdioma.getValue().toString()));
        textUsuario.setText(getPropertiesIdioma().getProperty("textUsuario"));
        textContrasenia.setText(getPropertiesIdioma().getProperty("textContrasenia"));
        textIniciarSesion.setText(getPropertiesIdioma().getProperty("textIniciarSesion"));
        buttonIniciarSesion.setText(getPropertiesIdioma().getProperty("buttonIniciarSesion"));
        textRecuperarContrasenia.setText(getPropertiesIdioma().getProperty("textRecuperarContrasenia"));
        buttonRecuperarContrasenia.setText(getPropertiesIdioma().getProperty("buttonRecuperarContrasenia"));
        textRegistrarse.setText(getPropertiesIdioma().getProperty("textRegistrarse"));
        buttonRegister.setText(getPropertiesIdioma().getProperty("buttonRegister"));
    }




    @FXML
    protected void onClickButtonIniciarSesion(){
        if (textFieldUsuario== null || textFieldUsuario.getText().isEmpty() || 
            passwordFieldContrasenia == null || passwordFieldContrasenia.getText().isEmpty() ) {
                textIniciarSesion.setText("Credenciales null o vacias");
                return;
        }

        if (!textFieldUsuario.getText().equals(usuario) || !textIniciarSesion.getText().equals(contrasenia)) {
            textIniciarSesion.setText("Credenciales invalidas");
            return;
        } 

        textIniciarSesion.setText("Usuario validado correctamente");
    }

    @FXML
    protected void openClickButtonRegister(){
        try {
            Stage stage = (Stage) buttonRegister.getScene().getWindow();
            FXMLLoader fxmlLoader = new FXMLLoader(Main.class.getResource("/view/register.fxml"));
            Scene scene = new Scene(fxmlLoader.load());
            stage.setTitle("Pantalla Registro");
            stage.setScene(scene);
            stage.show();
        } catch (Exception e) {
            e.printStackTrace();
        }
    }

    @FXML
    protected void onClickButtonRecuperarContrasenia(){
       try {
        Stage stage = (Stage) buttonRegister.getScene().getWindow();
        FXMLLoader fxmlLoader = new FXMLLoader(Main.class.getResource("/view/recoveryPassword.fxml"));
        Scene scene = new Scene(fxmlLoader.load());
            stage.setTitle("Pantalla Recuperar Contraseña");
            stage.setScene(scene);
            stage.show();
       } catch (Exception e) {
        e.printStackTrace();    
       } 
    }
    
}
