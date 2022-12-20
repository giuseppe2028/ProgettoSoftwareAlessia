package com.example.progettosoftware;

import javafx.beans.NamedArg;
import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.scene.control.Button;
import javafx.scene.control.Label;
import javafx.scene.control.TextField;

public class ControlLogin {
@FXML
    TextField mail = new TextField();

@FXML
TextField password = new TextField();
@FXML
    Button bottoneLogin = new Button();


private String mail1, password1;
public void compila(){

    mail1 = mail.getText();
    password1 = password.getText();
}

public void login(ActionEvent e){
System.out.println("Suca");
System.out.println("La mail inserita è: " + mail1 + " la password inserita è: " + password1);

}
}