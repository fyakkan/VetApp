package com.example.dynamic_design;

import javafx.fxml.FXML;
import javafx.fxml.FXMLLoader;
import javafx.fxml.Initializable;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.control.Label;
import javafx.scene.layout.AnchorPane;
import javafx.scene.layout.HBox;
import javafx.scene.layout.VBox;
import javafx.stage.Stage;

import java.io.IOException;
import java.net.URL;
import java.util.ResourceBundle;

public class PetItemController implements Initializable {

    @FXML
    Label name;
    @FXML
    Button petStatusButton,petRemoveButton;
    @FXML HBox petItemBox;

    AnchorPane pane;


    public void setData(Pet pet){
        name.setText(pet.getName());
    }
//    @FXML
//    protected void showPetStatus(){
//        FXMLLoader loader = new FXMLLoader();
//        loader.setLocation(getClass().getResource("petStatusPage.fxml"));
//        StatusPageController statusPageController = loader.getController();
//        statusPageController.setPetData(pet,type);
//        Stage stage = new Stage();
//        AnchorPane anchorPane = FXMLLoader.load(getClass().getResource("petStatusPage.fxml"));
//        Scene scene = new Scene(anchorPane);
//        stage.setTitle("Pet Status");
//        stage.setScene(scene);
//        stage.showAndWait();
//    }
//    @FXML
//    protected void removePet(){
//        FXMLLoader loader = new FXMLLoader();
//        loader.setLocation(getClass().getResource("petPage.fxml"));
//        Controller conn = loader.getController();
//        VBox vbox = conn.getPetBox();
//        vbox.getChildren().remove(petItemBox);
//    }

    public void showPetStatusPage(Pet pet, String type) throws IOException {
        FXMLLoader loader = new FXMLLoader();
        loader.setLocation(getClass().getResource("petStatusPage.fxml"));
        loader.load();
        StatusPageController statusPageController = loader.getController();
        statusPageController.setData(pet,type);
        Stage stage = new Stage();
        pane = FXMLLoader.load(getClass().getResource("petStatusPage.fxml"));
        Scene scene = new Scene(pane);
        stage.setTitle("Pet Status");
        stage.setScene(scene);
        stage.showAndWait();
    }

    @Override
    public void initialize(URL url, ResourceBundle resourceBundle) {}
}
