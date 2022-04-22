package com.example.dynamic_design;

import javafx.fxml.FXML;
import javafx.fxml.FXMLLoader;
import javafx.fxml.Initializable;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.control.Label;
import javafx.scene.image.Image;
import javafx.scene.image.ImageView;
import javafx.scene.layout.AnchorPane;
import javafx.scene.layout.HBox;
import javafx.scene.layout.Pane;
import javafx.stage.Modality;
import javafx.stage.Stage;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.net.URL;
import java.util.ResourceBundle;

public class StatusPageController implements Initializable {
    @FXML
    private Label statusPageTitle;

    @FXML
    private HBox statusPageTitleBox;

    @FXML
    private Label statusPetAge;

    @FXML
    private Label statusPetName;

    @FXML
    private Label statusPetSex;

    @FXML
    private Label statusPetType;

    @FXML
    private Label statusPetVaccinationStatus;

    @FXML
    ImageView petImage;
    @FXML
    Button closeWindow;
    @FXML
    AnchorPane statusPanel;

    public Label getStatusPageTitle() {
        return statusPageTitle;
    }

    public void setStatusPageTitle(Label statusPageTitle) {
        this.statusPageTitle = statusPageTitle;
    }

    public HBox getStatusPageTitleBox() {
        return statusPageTitleBox;
    }

    public void setStatusPageTitleBox(HBox statusPageTitleBox) {
        this.statusPageTitleBox = statusPageTitleBox;
    }

    public Label getStatusPetAge() {
        return statusPetAge;
    }

    public void setStatusPetAge(Label statusPetAge) {
        this.statusPetAge = statusPetAge;
    }

    public Label getStatusPetName() {
        return statusPetName;
    }

    public void setStatusPetName(Label statusPetName) {
        this.statusPetName = statusPetName;
    }

    public Label getStatusPetSex() {
        return statusPetSex;
    }

    public void setStatusPetSex(Label statusPetSex) {
        this.statusPetSex = statusPetSex;
    }

    public Label getStatusPetType() {
        return statusPetType;
    }

    public void setStatusPetType(Label statusPetType) {
        this.statusPetType = statusPetType;
    }

    public Label getStatusPetVaccinationStatus() {
        return statusPetVaccinationStatus;
    }

    public void setStatusPetVaccinationStatus(Label statusPetVaccinationStatus) {
        this.statusPetVaccinationStatus = statusPetVaccinationStatus;
    }

//    public ImageView getImage(String petType) throws FileNotFoundException {
//        if (petType == "Dog"){
//             petImage.setImage(new Image(new FileInputStream("C:\\Users\\suley\\Desktop\\dog.jpg")));
//        }else if (petType == "Cat"){
//            petImage.setImage(new Image(new FileInputStream("C:\\Users\\suley\\Desktop\\cat.jpg")));
//        }else{
//            System.out.println("wrong pet type");
//        }
//        return petImage;
//    }

    public void setData(Pet pet,String petType){
        getStatusPetName().setText(pet.getName());
        getStatusPetAge().setText(pet.getAge());
        getStatusPetType().setText(petType);
//        statusPetSex.setText(pet.getSex());
    }

    @FXML
    protected void closeWindow(){
        Stage stage = (Stage) statusPanel.getScene().getWindow();
        stage.close();
    }


    @Override
    public void initialize(URL url, ResourceBundle resourceBundle) {}
}
