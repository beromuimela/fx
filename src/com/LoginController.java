/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com;

import java.net.URL;
import java.util.ResourceBundle;
import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.fxml.Initializable;
import javafx.scene.control.Label;
import javafx.scene.control.PasswordField;
import javafx.scene.control.TextField;

/**
 * FXML Controller class
 *
 * @author Lucinda
 */
public class LoginController implements Initializable { 
    @FXML
    private Label lblMessage;
    @FXML
    private TextField txtUsername;
    @FXML
    private PasswordField txtPassword;
    
    @FXML 
    private void btnConfirmarAction(ActionEvent event){
        if(txtUsername.getText().equals("teste")&&(txtPassword.getText().equals("teste"))){
            lblMessage.setText("Bem Vindo : "+txtUsername.getText());
        }else{
            lblMessage.setText("Username or Password invalido!");
        }
        
    }
    

    /**
     * Initializes the controller class.
     */
    @Override
    public void initialize(URL url, ResourceBundle rb) {
        // TODO
    }    
    
}
