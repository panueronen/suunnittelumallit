module com.example.flywheeldemo {
    requires javafx.controls;
    requires javafx.fxml;


    opens com.example.flywheeldemo to javafx.fxml;
    exports com.example.flywheeldemo;
}