package com.example.progettosoftware;

import javafx.scene.control.Alert;

public class Errore {

    Alert messaggio = new Alert(Alert.AlertType.ERROR);
    public void show(String message){
        messaggio.setContentText(message);
        messaggio.show();
    }

}
