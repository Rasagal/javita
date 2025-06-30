package com.carlos;

import javafx.application.Application;
import javafx.scene.Scene;
import javafx.scene.control.Label;
import javafx.stage.Stage;

public class App extends Application {

    @Override
    public void start(Stage primaryStage) {
        Label label = new Label("¡Hola, JavaFX con Maven!");
        Scene scene = new Scene(label, 400, 200);
        primaryStage.setScene(scene);
        primaryStage.setTitle("Mi primera ventana JavaFX");
        primaryStage.show();
    }

    public static void main(String[] args) {
        launch(args);
    }
}

