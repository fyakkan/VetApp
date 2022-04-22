package com.example.dynamic_design;

import com.example.dynamic_design.AccountBrain;
import com.example.dynamic_design.Application;
import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.fxml.FXMLLoader;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.control.CheckBox;
import javafx.scene.control.Label;
import javafx.scene.control.TextField;
import javafx.scene.layout.AnchorPane;
import javafx.scene.layout.BorderPane;
import javafx.stage.Stage;


import java.io.IOException;

public class LoginPageController {

    public LoginPageController(){

    }
    @FXML
    BorderPane loginPanel;
    @FXML
    private Button loginBackButton;
    @FXML
    private Button loginLoginButton;
    @FXML
    private CheckBox loginIamvetCBox;
    @FXML
    private TextField loginUsername;
    @FXML
    private TextField loginPassword;
    @FXML
    private Label loginWrongMessage;

    private boolean isVet=false;

    AccountBrain accountBrain = new AccountBrain();

    public void goWelcomePage(ActionEvent actionEvent) throws IOException {
        Application m= new Application();
        m.changeScene("welcomePage.fxml");
    }

    public void goAfterLogin(ActionEvent actionEvent)throws IOException {
        Stage stg = (Stage) loginPanel.getScene().getWindow();
        stg.close();
        FXMLLoader loader = new FXMLLoader();
        AnchorPane pane = loader.load(getClass().getResource("homePage.fxml"));
        Stage stage = new Stage();
        Scene scene = new Scene(pane);
        stage.setTitle("VetPet");
        stage.setScene(scene);
        stage.show();
/*
        //go to vet customer after login page
        if (loginUsername.getText().isEmpty() || loginPassword.getText().isEmpty()) {
            loginWrongMessage.setText("Please enter your all information");
        }
        else {
            //go to vet or customer after login page

            accountBrain.LogIn(loginUsername.getText(),loginPassword.getText(),isVet);
            loginWrongMessage.setText("Wrong password or username!");
        } */


    }

    public void changeUserStatus(ActionEvent actionEvent) {
        if (loginIamvetCBox.isSelected()) isVet=true;
    }
}
