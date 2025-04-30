package backend.es.habccode.sistema.reserva.hotel.controller;

import java.util.ArrayList;

import backend.es.habccode.sistema.reserva.hotel.Main;
import backend.es.habccode.sistema.reserva.hotel.controller.abstractas.AbstractController;
import backend.es.habccode.sistema.reserva.hotel.model.UsersEntity;
import javafx.fxml.FXML;
import javafx.fxml.FXMLLoader;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.control.PasswordField;
import javafx.scene.control.TextField;
import javafx.scene.text.Text;
import javafx.stage.Stage;

/**
 * @author: habccode
 * @version: 1.0.0
 */
public class RegisterController extends AbstractController {

    // texto de usuario
    @FXML
    Text textUsuario;

    // textField
    @FXML
    TextField TextFieldUsuario;

    // texto de usuario1
    @FXML
    Text textUsuario1;

    // text fiel de repetir usuario
    @FXML
    TextField textFieldUsuarioRepetir;

    // text email
    @FXML
    Text textEmail;

    // textfiel del email
    @FXML
    TextField textFieldEmail;

    // text de recuperar email
    @FXML
    Text textEmail1;

    // textfield de repetir el email
    @FXML
    TextField textFieldEmailRepetir;

    // text de la contraseña
    @FXML
    Text textPassword;

    // textfoel de la contraseña
    @FXML
    PasswordField textFieldPassword;

    // text de la contraseña
    @FXML
    Text textPassword1;

    // textField de la confirmacion de la contraseña
    @FXML
    PasswordField textFieldPasswordRepetir;

    // boton de atras
    @FXML
    Button buttonBack;

    // boton registrar
    @FXML
    Button buttonRegister;

    // error de texto por comprobacion
    @FXML
    Text errorText;

    /**
     * 
     */
    @FXML
    protected void onclickRegistrar() {
        if (!comprobarRegistrar()) {
            return;
        }
        UsersEntity nuevoUsuario = new UsersEntity(
                TextFieldUsuario.getText(),
                textFieldPassword.getText(),
                textFieldEmail.getText());
        ArrayList<UsersEntity> usuarioEntityList;
        usuarioEntityList = getUserServiceModel().obtenerTodosLosUsuarios();
        if (usuarioEntityList.contains(nuevoUsuario)) {
            errorText.setText("Ya hay una cuenta registrada con ese correo");
            return;
        }
        if (getUserServiceModel().obtenerUsuariosPorEmail(textFieldEmail.getText()) != null) {
            errorText.setText("Ya hay una cuenta registrada con ese usuario");
            return;
        }
        getUserServiceModel().agregarUser(nuevoUsuario);
    }

    /**
     * comprobar que el registro se hizo de manera correcta
     * 
     * @return
     */
    private boolean comprobarRegistrar() {
        if (!comprobarTextField(TextFieldUsuario)) {
            errorText.setText("Usuario no puede estar vacio");
            return false;
        }
        if (!comprobarTextField(textFieldUsuarioRepetir)) {
            errorText.setText("Usuario no puede estar vacio");
            return false;
        }
        if (!TextFieldUsuario.getText().equals(textFieldUsuarioRepetir)) {
            errorText.setText("el usuario no coincide");
        }
        if (!comprobarTextField(textFieldPassword)) {
            errorText.setText("Contraseña no puede estar vacia");
            return false;
        }
        if (!comprobarTextField(textFieldPasswordRepetir)) {
            errorText.setText("Repewtir contraseña no puede estar vacio");
            return false;
        }
        if (!textFieldPassword.getText().equals(textFieldPasswordRepetir)) {
            errorText.setText("las contraseñas no coinciden");
        }
        if (!comprobarTextField(textFieldEmail)) {
            errorText.setText("El correo no puede estar vacio");
        }
        if (!comprobarTextField(textFieldEmailRepetir)) {
            errorText.setText("El correo no puede estar vacio");
            return false;
        }
        if (!textFieldEmail.getText().equals(textFieldEmailRepetir)) {
            errorText.setText("los correos deben coincidir");
            return false;
        }
        return true;
    }

    // metodo de enlace a otra interface
    @FXML
    protected void openClikButtonBack() {
        try {
            Stage stage = (Stage) buttonRegister.getScene().getWindow();
            FXMLLoader fxmlLoader = new FXMLLoader(Main.class.getResource("/view/login.fxml"));
            Scene scene = new Scene(fxmlLoader.load());
            stage.setTitle("Pantalla Recuperar Contraseña");
            stage.setScene(scene);
            stage.show();
        } catch (Exception e) {
            e.printStackTrace();
        }
    }

}
