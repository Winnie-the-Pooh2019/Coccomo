module com.example.coccomo {
    requires javafx.controls;
    requires javafx.fxml;
    requires kotlin.stdlib;


    opens com.example.coccomo to javafx.fxml;
    exports com.example.coccomo;
}