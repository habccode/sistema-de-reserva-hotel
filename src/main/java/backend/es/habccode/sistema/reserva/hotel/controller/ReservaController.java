package backend.es.habccode.sistema.reserva.hotel.controller;

import backend.es.habccode.sistema.reserva.hotel.controller.abstractas.AbstractController;
import javafx.fxml.FXML;
import javafx.scene.control.Button;
import javafx.scene.control.DatePicker;
import javafx.scene.control.PasswordField;
import javafx.scene.control.TextField;
import javafx.scene.text.Text;

public class ReservaController extends AbstractController{

    // button atras
    @FXML
    private Button buttonAtras;


    // texto del hotel
    private Text texthotel;


    // texto de la fecha
    private Text textReserva;


    // button reserva
    private Button buttonReserva;


    //button de perfil
    private Button buttonPerfil;


    // date picker de fecha
    private DatePicker idFecha;


    // TextField nombre y apellido
    private TextField texFieldNombreApellido;

    // textField Nie
    private TextField textFieldNie;

    // Text idNombreApellido
    private Text textNie;

    // text textTarjet de tarjeta
    private Text textTarjet;

    // PasswordField la contrasenia
    private PasswordField paswwordFieldTarjet;

    // TextField caducidad
    private Text textCaducidad;


    // textFieldCaducidad
    private TextField textFieldCaducidad;


    // buttton cancelar
    private Button buttonCancelar;
    

    //button de atras
    public void openClickButtonAtras(){}

    // button de reserva
    public void onClickbuttonReserva(){}


    // button de perfil
    public void openClickButtonPerfil(){}


    // button de cancelar
    public void onClickbuttonCancelar(){}






}
