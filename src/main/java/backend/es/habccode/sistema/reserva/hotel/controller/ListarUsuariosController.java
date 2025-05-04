package backend.es.habccode.sistema.reserva.hotel.controller;
import java.util.ArrayList;
import backend.es.habccode.sistema.reserva.hotel.Main;
import backend.es.habccode.sistema.reserva.hotel.controller.abstractas.AbstractController;
import backend.es.habccode.sistema.reserva.hotel.model.UsersEntity;
import javafx.fxml.FXML;
import javafx.fxml.FXMLLoader;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.control.ListView;
import javafx.stage.Stage;
/**
 * @author: habccode
 * @version: 1.0.0
 */
public class ListarUsuariosController extends AbstractController {
     @FXML Button atrasButton;
    @FXML ListView listViewUsuarios;

    @FXML
    public void initialize(){
        ArrayList<UsersEntity> usuarios = new ArrayList<>();
        usuarios = new ArrayList<>(getUserServiceModel().obtenerTodosLosUsuarios());
        listViewUsuarios.getItems().addAll(usuarios);
    }
    @FXML
    public void atrasOnClick(){
        try {
            Stage stage = (Stage) atrasButton.getScene().getWindow();
            FXMLLoader fxmlLoader = new FXMLLoader(Main.class.getResource("view/login.fxml"));
            Scene scene = new Scene(fxmlLoader.load(), 820, 640);
            stage.setTitle("Pantalla Recuperar Contraseña");
            stage.setScene(scene);
            stage.show();
        } catch (Exception e) {
            e.printStackTrace();
        }
    }
}
