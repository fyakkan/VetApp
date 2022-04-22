package com.example.dynamic_design;

import com.example.dynamic_design.AccountBrain;
import com.example.dynamic_design.Application;
import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.scene.control.Button;
import javafx.scene.control.Label;
import javafx.scene.control.TextField;

import java.io.IOException;

public class CustomerRegisterController {

    public CustomerRegisterController(){

    }

    @FXML
    private Button cRegisterBackButton;
    @FXML
    private Button cRegisterSignInButton;
    @FXML
    private Label cRegisterWrongMessage;
    @FXML
    private TextField cRName;
    @FXML
    private TextField cRSurname;
    @FXML
    private TextField cRPhoneNumber;
    @FXML
    private TextField cRMailAddress;
    @FXML
    private TextField cRUsername;
    @FXML
    private TextField cRPassword;



    @FXML
    public void goWelcomePage(ActionEvent actionEvent) throws IOException {
        Application m= new Application();
        m.changeScene("welcomePage.fxml");
    }

    public void customerSignIn(ActionEvent actionEvent) throws IOException{
        Application m = new Application();
        AccountBrain accountBrain= new AccountBrain();
        if (cRName.getText().isEmpty() || cRSurname.getText().isEmpty() ||
                 cRPhoneNumber.getText().isEmpty() || cRUsername.getText().isEmpty() ||
                cRPassword.getText().isEmpty() || cRMailAddress.getText().isEmpty() ){
            cRegisterWrongMessage.setText("Please fill all field.");
        }
        else {
            accountBrain.Register(cRName.getText(),cRSurname.getText()
                    ,cRPhoneNumber.getText(),cRUsername.getText(),cRPassword.getText(),cRMailAddress.getText());
            m.changeScene("loginPage.fxml");
        }

    }
}
