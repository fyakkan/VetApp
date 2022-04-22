package com.example.dynamic_design;

import com.example.dynamic_design.Application;
import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.scene.control.Button;


import java.io.IOException;

public class WelcomePageController {

    public WelcomePageController(){

    }

    @FXML
    private Button welcomePageVetRegisterButton;
    @FXML
    private Button welcomePageCustomerRegisterButton;
    @FXML
    private Button welcomePageLoginButton;

    @FXML
    private void goLoginPage()throws IOException{
        Application m = new Application();
        m.changeScene("loginPage.fxml");


    }
    @FXML
    private void goCustomerRegisterPage()throws IOException{
        Application m = new Application();
        m.changeScene("customerRegisterPage.fxml");


    }
    @FXML
    public void goVetRegisterPage(ActionEvent actionEvent) throws IOException {
        Application m = new Application();
        m.changeScene("vetRegisterPage.fxml");
    }
}
