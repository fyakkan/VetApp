package com.example.dynamic_design;


import java.io.IOException;
import javafx.fxml.FXML;
import javafx.fxml.FXMLLoader;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.layout.AnchorPane;
import javafx.stage.Stage;

public class VetPageController {
    @FXML
    Button addAnAppointment1;
    @FXML
    Button addAnAppointment2;
    @FXML
    Button addAnAppointment3;
    @FXML
    Button showAppointments;

    public VetPageController() {
    }

    public void showAppointments() throws IOException {
        try {
            new FXMLLoader();
            AnchorPane pane = (AnchorPane)FXMLLoader.load(this.getClass().getResource("AppointmentStatusPage.fxml"));
            Stage stage = new Stage();
            Scene scene = new Scene(pane, 600.0D, 400.0D);
            stage.setTitle("Appointments");
            stage.setScene(scene);
            stage.show();
        } catch (IOException var5) {
        }

    }

    public void addAnAppointment() throws IOException {

            AnchorPane pane = FXMLLoader.load(getClass().getResource("addAppointmentPage.fxml"));
            Stage stage = new Stage();
            Scene scene = new Scene(pane);
            stage.setTitle("Add An Appointment");
            stage.setScene(scene);
            stage.show();

    }
}
