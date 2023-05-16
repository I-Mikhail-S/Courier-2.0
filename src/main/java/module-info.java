module com.example.demo {
    requires javafx.controls;
    requires javafx.fxml;


    opens org.example.ui to javafx.fxml;
    exports org.example.ui;
}