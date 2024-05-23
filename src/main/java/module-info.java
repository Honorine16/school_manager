module org.example.schoolmanager {
    requires javafx.controls;
    requires javafx.fxml;
    requires java.sql;


    opens org.example.schoolmanager to javafx.fxml;
    exports org.example.schoolmanager;
    exports org.example.schoolmanager.models;
    opens org.example.schoolmanager.models to javafx.fxml;
    opens org.example.schoolmanager.controller to javafx.fxml;
    exports org.example.schoolmanager.controller;
}