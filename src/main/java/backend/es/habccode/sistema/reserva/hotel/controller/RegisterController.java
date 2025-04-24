package backend.es.habccode.sistema.reserva.hotel.controller;
import backend.es.habccode.sistema.reserva.hotel.Main;
import javafx.fxml.FXML;
import javafx.fxml.FXMLLoader;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.control.TextField;
import javafx.scene.text.Text;
import javafx.stage.Stage;
/**
 * @author: habccode
 * @version: 1.0.0
 */
public class RegisterController {
    
    //texto de usuario
    @FXML  Text textUsuario;

    // texto de usuario1
    @FXML Text textUsuario1;

    //text fiel de repetir usuario
    @FXML TextField textFieldUsuario1;


    // text email 
    @FXML Text textEmail;


    // textfiel del email
    @FXML TextField textFieldEmail;

    // text de recuperar email
    @FXML Text textEmail1;

    // textfield de recuperar el email
    @FXML TextField textFieldEmail1;

    // text de la contraseña
    @FXML Text textPassword;

    //textfoel de la contraseña
    @FXML TextField textFieldPassword;

    // text de la contraseña
    @FXML Text textPassword1;

    // textField de la confirmacion de la contraseña
    @FXML TextField textFieldPassword1;


    // boton de atras
    @FXML Button buttonBack;


    // boton registrar
    @FXML Button buttonRegister;


    // metodo de enlace a otra interface
     @FXML
    protected void openClikButtonBack(){
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
