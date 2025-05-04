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
public class RecoveryPassword {
    
    // button de ir a la interface anterior
    @FXML Button buttonAtras;
    
    //text de email
    @FXML Text textEmail1;
    
    // tex de email
    @FXML Text textEmail;
    
    //text textField del formulario
    @FXML TextField textFielEmail;
    
    //text email
    @FXML Text textEmail11;
    
    //Boton de enviar el formulario
    @FXML Button buttonSend;


    @FXML
    protected void openClickButtonAtras(){
       try {
        Stage stage = (Stage) buttonAtras.getScene().getWindow();
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
