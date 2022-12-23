package com.example.progettosoftware;

import java.io.IOException;
import java.sql.*;
import java.util.NoSuchElementException;

import javafx.beans.NamedArg;
import javafx.event.ActionEvent;
import javafx.event.Event;
import javafx.fxml.FXML;
import javafx.scene.control.Button;
import javafx.scene.control.Label;
import javafx.scene.control.TextField;
import javafx.scene.layout.AnchorPane;



public class ControlLogin {

    private String URL = "jdbc:mysql://localhost:3306/Azienda";
    private String username = "root";
    private String password = "Root122452";

    private Errore errore = new Errore();

private String mail1, password1;
private SchermataPrincipale schermataPrincipale = new SchermataPrincipale();

public void inserisciCred(String mail,String pass){
this.mail1 = mail;
this.password1 = pass;
}

public void clicklogin(ActionEvent e) throws IOException
{


//devo fare i vari controlli:
try {
    System.out.println("UOAAA "+ mail1);
    Connection conn = DriverManager.getConnection(URL,username,password);
    /*Statement stm = conn.createStatement();
    //String sql = "SELECT * FROM Amministratore WHERE email = '" + mail1 + "'";
    String sql = "SELECT * FROM Amministratore WHERE email = 'giovanna.bertolini@azienda.it'";
    ResultSet rs = stm.executeQuery(sql);*/
    String sql = "SELECT * FROM Amministratore WHERE email = ?";
    PreparedStatement pstm = conn.prepareStatement(sql);
    pstm.setString(1, mail1);
    ResultSet rs = pstm.executeQuery();

    if(!rs.next()){
      errore.show("Errore in fase di Login");
    }
    else{
    schermataPrincipale.show(e);
}

}
catch (SQLException a){
    System.out.println("Errore comunicazione DBMS");
}

    }



}







