package com.example.progettosoftware;

import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.scene.control.Button;
import javafx.scene.control.Control;
import javafx.scene.control.TextField;
import javafx.scene.layout.AnchorPane;

import java.io.IOException;
import java.sql.SQLException;

public class BoundaryLogin {
    ControlLogin controlLogin = new ControlLogin();
    @FXML
    private Button bottoneLogin;

    @FXML
    private TextField mail;

    @FXML
    private TextField password;

    @FXML
    private AnchorPane rettangolo;

    @FXML
    private AnchorPane sfondo;

    @FXML
  public  void login(ActionEvent event) throws IOException {

        controlLogin.clicklogin(event);
        System.out.println("La mail è "+mail.getText());
    }
    @FXML
    public void inserisciCred(){
        controlLogin.inserisciCred(mail.getText(),password.getText());

    }

}
