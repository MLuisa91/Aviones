module com.example.aviones {
    requires javafx.controls;
    requires javafx.fxml;
    requires java.sql;


    opens com.example.aviones to javafx.fxml;
    exports com.example.aviones;
    exports com.example.aviones.controlador;
    opens com.example.aviones.controlador to javafx.fxml;
}