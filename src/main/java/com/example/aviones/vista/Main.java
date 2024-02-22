package com.example.aviones.vista;

import javafx.application.Application;
import javafx.fxml.FXMLLoader;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.stage.Stage;

public class Main extends Application {

    @Override
    public void start(Stage stage) throws Exception {
        Parent root = FXMLLoader.load(getClass().getResource("/com/example/aviones/vista/login.fxml"));
        Scene escena = new Scene(root);
        stage.setScene(escena);
        stage.show();
    }

    public static void main(String[] args) {
        launch(Main.class);
    }


}
