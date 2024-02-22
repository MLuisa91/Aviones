package com.example.aviones.controlador;

import com.example.aviones.modelo.Avion;
import com.example.aviones.modelo.Vuelo;
import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.scene.control.TableColumn;
import javafx.scene.control.TableView;

public class VuelosController {

    @FXML
    private TableColumn<Vuelo, Avion> avionColumn;

    @FXML
    private TableColumn<Vuelo, String> destinoColumn;

    @FXML
    private TableColumn<Vuelo, String> fechaSalidaColumn;

    @FXML
    private TableColumn<Vuelo, String> horaLlegadaColumn;

    @FXML
    private TableColumn<Vuelo, String> horaSalidaColumn;

    @FXML
    private TableColumn<Vuelo, String> origenColumn;

    @FXML
    private TableView<Vuelo> tableViewVuelos;
    private CRUD_VUELOS crudVuelos;

    public void altaVuelo(ActionEvent actionEvent) {
    }

    public void buscarVuelos(ActionEvent actionEvent) {
    }
}
