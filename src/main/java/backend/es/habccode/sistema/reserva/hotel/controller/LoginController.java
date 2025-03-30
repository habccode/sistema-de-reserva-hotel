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
    Text textUsuario;

    //textfoeld usuario
    
    @FXML
    TextField textFieldUsuario;
    
    //text contrasenia
    @FXML
    Text textContrasenia;

    //passwordfield contrasenia
    @FXML
    PasswordField passwordFieldContrasenia;

    //text iniciar sesion
    @FXML
    Text textIniciarSesion;

    //boton iniciar sesion
    @FXML
    Button buttonIniciarSesion;


    //text recuperar contrasenia
    @FXML
    Text textRecuperarContrasenia;

    //textfield recuperar contrasenia
    @FXML
    Button buttonRecuperarContrasenia;


    //text registrarse
    @FXML
    Text textRegistrarse;

    //button de registrarse
    @FXML
    Button buttonRegistarse;



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







}
