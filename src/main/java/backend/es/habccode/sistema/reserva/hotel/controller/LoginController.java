package backend.es.habccode.sistema.reserva.hotel.controller;

import javafx.fxml.FXML;
import javafx.fxml.FXMLLoader;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.control.PasswordField;
import javafx.scene.control.TextField;
import javafx.scene.text.Text;
import javafx.stage.Stage;


public class LoginController {
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
    private Button buttonRegistarse;



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
    protected void onClickButtonRegistarse(){}

    @FXML
    protected void onClickButtonRecuperarContrasenia(){}
    
}
