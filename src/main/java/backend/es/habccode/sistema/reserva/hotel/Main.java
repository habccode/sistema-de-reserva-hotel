package backend.es.habccode.sistema.reserva.hotel;

import java.io.IOException;

import javafx.application.Application;
import javafx.fxml.FXMLLoader;
import javafx.scene.Scene;
import javafx.stage.Stage;
/**
 * @author: habccode
 * @version: 1.0.0
 */
public class Main extends Application {
      @Override
    public void start(Stage stage) throws IOException {
        FXMLLoader fxmlLoader = new FXMLLoader(Main.class.getResource("/view/SuitRoom.fxml"));
        Scene scene = new Scene(fxmlLoader.load());
        stage.setTitle("Pantalla Principal");
        stage.setScene(scene);
        stage.show();
    }

    
    public static void main(String[] args) {
        launch();
    }
}