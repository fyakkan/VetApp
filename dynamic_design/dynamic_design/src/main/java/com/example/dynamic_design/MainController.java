package com.example.dynamic_design;

import javafx.fxml.FXML;
import javafx.fxml.FXMLLoader;
import javafx.fxml.Initializable;
import javafx.scene.layout.AnchorPane;

import java.io.IOException;
import java.net.URL;
import java.util.ResourceBundle;

public class MainController implements Initializable {
    @FXML
    AnchorPane homePagePanel,changingPanel;

    @Override
    public void initialize(URL url, ResourceBundle resourceBundle) {

    }
    @FXML
    protected void goToPetPage() throws IOException {
        AnchorPane petPane = FXMLLoader.load(getClass().getResource("petPage.fxml"));
        changingPanel.getChildren().setAll(petPane);
    }

    @FXML
    protected void goToVetPage() throws IOException {
        AnchorPane petPane = FXMLLoader.load(getClass().getResource("vetPage.fxml"));
        changingPanel.getChildren().setAll(petPane);

    }
}
