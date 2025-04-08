package backend.es.habccode.sistema.reserva.hotel.controller;
import javafx.fxml.FXML;
import javafx.scene.control.Label;

public class HelloController {
    @FXML
    private Label welcomeText;

    @FXML
    protected void onHelloButtonClick() {
        welcomeText.setText("¡Bienvenidos al mundo de la programación!");
    }
}

