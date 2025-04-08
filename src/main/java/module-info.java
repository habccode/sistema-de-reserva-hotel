module backend.es.habccode.sistema.reserva.hotel {
    requires javafx.controls;
    requires javafx.fxml;

    requires org.controlsfx.controls;
    requires javafx.graphics;
    requires java.xml;
    requires com.fasterxml.jackson.databind;
    requires com.fasterxml.jackson.core;
    requires java.sql;

    opens backend.es.habccode.sistema.reserva.hotel to javafx.fxml;
    exports backend.es.habccode.sistema.reserva.hotel;
    exports backend.es.habccode.sistema.reserva.hotel.controller;
    exports backend.es.habccode.sistema.reserva.hotel.model;
    opens   backend.es.habccode.sistema.reserva.hotel.controller to javafx.fxml;

    
}
