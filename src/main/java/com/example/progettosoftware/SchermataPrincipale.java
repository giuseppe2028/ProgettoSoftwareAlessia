package com.example.progettosoftware;

import javafx.event.ActionEvent;
import javafx.fxml.FXMLLoader;
import javafx.scene.Node;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.stage.Stage;

import java.io.IOException;

public class SchermataPrincipale {
    private Stage stage;
    private Scene scene;
    private Parent root;

    //Questo metodo che poi sarà il costruttore, rappresenta il punto in cui io costruisco il tutto
    public void show(ActionEvent e) throws IOException {

    Parent root = FXMLLoader.load(getClass().getResource("/com/example/progettosoftware/Home.fxml"));
    stage = (Stage) ((Node) e.getSource()).getScene().getWindow();
        scene = new Scene(root);
        stage.setScene(scene);
        stage.show();
    }

}
