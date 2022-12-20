module com.example.progettosoftware {
    requires javafx.controls;
    requires javafx.fxml;


    opens com.example.progettosoftware to javafx.fxml;
    exports com.example.progettosoftware;
}