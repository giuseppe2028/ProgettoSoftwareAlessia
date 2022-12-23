module com.example.progettosoftware {
    requires javafx.controls;
    requires javafx.fxml;
    requires java.sql;

    opens com.example.progettosoftware to javafx.fxml;
    exports com.example.progettosoftware;
}