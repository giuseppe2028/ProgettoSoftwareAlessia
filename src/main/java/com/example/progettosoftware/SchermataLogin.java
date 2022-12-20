package com.example.progettosoftware;

import javafx.application.Application;
import javafx.fxml.FXMLLoader;
import javafx.scene.Scene;
import javafx.stage.Stage;

import java.io.IOException;

public class SchermataLogin extends Application {
    @Override
    public void start(Stage stage) throws IOException {
        FXMLLoader fxmlLoader = new FXMLLoader(SchermataLogin.class.getResource("/com/example/progettosoftware/Login.fxml"));
        Scene scene = new Scene(fxmlLoader.load(), 700, 700);
        stage.setTitle("Hello!");
        stage.setScene(scene);
        stage.show();
        scene.getStylesheets().add(getClass().getResource("/com/example/progettosoftware/Login.css").toExternalForm());

    }

    public static void main(String[] args) {
        launch();
    }
}