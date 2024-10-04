module com.example.habueloscachondos {
    requires javafx.controls;
    requires javafx.fxml;


    opens com.example.habueloscachondos to javafx.fxml;
    exports com.example.habueloscachondos;
}