module com.example.dynamic_design {
    requires javafx.controls;
    requires javafx.fxml;


    opens com.example.dynamic_design to javafx.fxml;
    exports com.example.dynamic_design;
}