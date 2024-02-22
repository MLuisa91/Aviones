package com.example.aviones.controlador;

import com.example.aviones.modelo.Avion;
import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.scene.control.ComboBox;
import javafx.scene.control.DatePicker;
import javafx.scene.control.TextField;

public class GestionVuelosController {

    @FXML
    private ComboBox<Avion> comboAvion;

    @FXML
    private DatePicker pickerFechaSalida;

    @FXML
    private TextField txtDestino;

    @FXML
    private TextField txtHoraLlegada;

    @FXML
    private TextField txtHoraSalida;

    @FXML
    private TextField txtId;

    @FXML
    private TextField txtOrigen;

    private CRUD_VUELOS crudVuelos;

    @FXML
    void aceptar(ActionEvent event) {

    }
    public void altaVuelo(ActionEvent actionEvent) {
    }

    public void buscarVuelos(ActionEvent actionEvent) {
    }
}
