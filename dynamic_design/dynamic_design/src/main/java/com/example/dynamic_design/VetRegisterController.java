package com.example.dynamic_design;

import com.example.dynamic_design.AccountBrain;
import com.example.dynamic_design.Application;
import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.scene.control.*;


import java.io.IOException;

public class VetRegisterController {

    public VetRegisterController(){

    }

    @FXML
    private Button vRegisterBackButton;
    @FXML
    private Button vRegisterSignInButton;
    @FXML
    private Label vRegisterWrongMessage;
    @FXML
    private TextField vRName;
    @FXML
    private TextField vRSurname;
    @FXML
    private TextField vRPhoneNumber;
    @FXML
    private TextField vRMailAddress;
    @FXML
    private TextField vRUsername;
    @FXML
    private TextField vRPassword;
    @FXML
    private TextArea vRAddress;



    @FXML
    public void goWelcomePage(ActionEvent actionEvent) throws IOException {
        Application m= new Application();
        m.changeScene("welcomePage.fxml");
    }

    public void vetSignIn(ActionEvent actionEvent) throws IOException{
        Application m = new Application();
        AccountBrain accountBrain= new AccountBrain();
        if (vRName.getText().isEmpty() || vRSurname.getText().isEmpty() ||
                vRPhoneNumber.getText().isEmpty() || vRUsername.getText().isEmpty() ||
                vRPassword.getText().isEmpty() || vRMailAddress.getText().isEmpty() ){
            vRegisterWrongMessage.setText("Please fill all field.");
        }
        else {
            accountBrain.Register(vRName.getText(),vRSurname.getText()
                    ,vRPhoneNumber.getText(),vRUsername.getText(),
                    vRPassword.getText(),vRMailAddress.getText(),vRAddress.getText());
            m.changeScene("loginPage.fxml");
        }

    }
}
