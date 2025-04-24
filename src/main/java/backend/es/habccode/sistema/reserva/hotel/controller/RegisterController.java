package backend.es.habccode.sistema.reserva.hotel.controller;
import backend.es.habccode.sistema.reserva.hotel.Main;
import javafx.fxml.FXML;
import javafx.fxml.FXMLLoader;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.control.TextField;
import javafx.scene.text.Text;
import javafx.stage.Stage;

public class RegisterController {
    
    @FXML  Text textUsuario;

    @FXML TextField TextFieldUsuario;

    @FXML Text textUsuario1;

    @FXML TextField textFieldUsuario1;

    @FXML Text textEmail;

    @FXML TextField textFieldEmail;

    @FXML Text textEmail1;

    @FXML TextField textFieldEmail1;

    @FXML Text textPassword;

    @FXML TextField textFieldPassword;

    @FXML Text textPassword1;

    @FXML TextField textFieldPassword1;

    @FXML Button buttonBack;

    @FXML Button buttonRegister;

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
