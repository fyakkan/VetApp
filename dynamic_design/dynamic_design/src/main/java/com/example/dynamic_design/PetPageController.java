package com.example.dynamic_design;

import javafx.collections.FXCollections;
import javafx.collections.ObservableList;
import javafx.fxml.FXML;
import javafx.fxml.FXMLLoader;
import javafx.fxml.Initializable;
import javafx.scene.Scene;
import javafx.scene.control.Alert;
import javafx.scene.control.ButtonType;
import javafx.scene.control.ChoiceBox;
import javafx.scene.control.TextField;
import javafx.scene.image.Image;
import javafx.scene.image.ImageView;
import javafx.scene.layout.AnchorPane;
import javafx.scene.layout.HBox;
import javafx.scene.layout.VBox;
import javafx.stage.Stage;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.net.URL;
import java.util.Optional;
import java.util.ResourceBundle;

public class PetPageController implements Initializable {
    ObservableList list = FXCollections.observableArrayList();
    @FXML
    private VBox petAttributesBox;
    @FXML VBox petBox;
    @FXML
    TextField petName,petAge;
    @FXML
    ChoiceBox<String> petType;
    @FXML
    AnchorPane petPagePanel;


    @Override
    public void initialize(URL url, ResourceBundle resourceBundle) {
        petType.setValue("Choose your pet type");
        petType.getItems().add("Dog");
        petType.getItems().add("Cat");
//        List<Pet> pets = new ArrayList<>(pets());
//        for (int i = 0 ; i< pets.size(); i++){
//            FXMLLoader fxmlLoader = new FXMLLoader();
//            fxmlLoader.setLocation(getClass().getResource("pet_item.fxml"));
//
//            try {
//                HBox hBox = fxmlLoader.load();
//                PetItemController petItemController = fxmlLoader.getController();
//                petItemController.setData(pets.get(i));
//                petBox.getChildren().add(hBox);
//            }catch (IOException e){
//                e.printStackTrace();
//            }
//        }
    }
//    private List<Pet> pets(){
//        List<Pet> ls = new ArrayList<>();
//        Pet dog1 = new Pet();
//        dog1.setName("Citir");
//        ls.add(dog1);
//
//        dog1.setName("Citir");
//        ls.add(dog1);
//
//        return ls;
//    }
    @FXML
    protected void addPet(){

        String name = petName.getText();
        String type = choosePetType();
        String age = petAge.getText();
        FXMLLoader fxmlLoader = new FXMLLoader();
        fxmlLoader.setLocation(getClass().getResource("pet_item.fxml"));

        try {
            Pet pet = new Pet();
            if (name != "" && type != "Choose your pet type" && age != ""){
                pet.setName(name);
                HBox hBox = fxmlLoader.load();
                PetItemController petItemController = fxmlLoader.getController();
                petItemController.setData(pet);

                petBox.getChildren().add(hBox);

                petItemController.petRemoveButton.setOnAction(event -> {
                    Alert alert = new Alert(Alert.AlertType.CONFIRMATION);
                    alert.setTitle("Warning");
//                    try {
//                        alert.setGraphic(new ImageView(new Image(new FileInputStream("src/main/java/images/remove.png"))));
//                    } catch (FileNotFoundException e) {
//                        e.printStackTrace();
//                    }
                    alert.setHeaderText("Are you sure want to remove this Pet?");
                    Optional<ButtonType> option = alert.showAndWait();

                    if (option.get() == null) {
                        System.out.println("No Selectin !");
                    } else if (option.get() == ButtonType.OK) {
                        petBox.getChildren().remove(hBox);

                }
                });
                petItemController.petStatusButton.setOnAction(event -> {
//                    try {
//                        petItemController.showPetStatusPage(pet,type);
//                    } catch (IOException e) {
//                        e.printStackTrace();
//                    }
                    try {
                        FXMLLoader loader = new FXMLLoader();
                        loader.setLocation(getClass().getResource("petStatusPage.fxml"));
                        AnchorPane pane = loader.load();
                        StatusPageController statusPageController = loader.getController();
                        statusPageController.setData(pet,type);
//                        if (type == "Dog"){
//                            statusPageController.petImage.setImage(new Image(new FileInputStream("src/main/java/images/dog.jpg")));
//                        }else if (type == "Cat"){
//                            statusPageController.petImage.setImage(new Image(new FileInputStream("src/main/java/images/cat.jpg")));
//                        }else{
//                            System.out.println("wrong pet type");}

                        Stage stage = new Stage();
                        Scene scene = new Scene(pane);
                        stage.setTitle("Pet Status");
                        stage.setScene(scene);
                        stage.showAndWait();
                    } catch (IOException e) {
                        e.printStackTrace();
                    }

                });
            }else{
                System.out.println("error");
            }

        }catch (IOException e){
            e.printStackTrace();
        }
    }

    @FXML
    protected String choosePetType(){
        String typeOfPet = petType.getValue();
        return typeOfPet;
    }


}