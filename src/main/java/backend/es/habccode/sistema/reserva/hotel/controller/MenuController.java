package backend.es.habccode.sistema.reserva.hotel.controller;
import javafx.fxml.FXML;
import javafx.scene.control.Button;
import javafx.scene.control.CheckBox;
import javafx.scene.text.Text;
/**
 * @author: habccode
 * @version: 1.0.0
 */
public class MenuController {
    

    // button de ir atras
    @FXML
    private Button buttonAtras;

    // texto del nombre del hotel
    @FXML
    private  Text texthotel;

    //texto de Menu
    @FXML
    private Text textMenu;


    // checkbox de habitacion individual
    @FXML
    private CheckBox individual;

    // button de seleccionar la habitacion
    @FXML
    private Button buttonSelecciona;


    // checkbox matrimonial
    @FXML
    private CheckBox matrimonial;

    // CheckBox de suit
    @FXML
    private CheckBox suits;

    // CheckBox de suit
    @FXML
    private CheckBox doble;

    // button del perfil
    @FXML
    private Button buttonPerfil;

}
