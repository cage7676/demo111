module com.example.demo111 {
    requires javafx.controls;
    requires javafx.fxml;


    opens com.example.demo111 to javafx.fxml;
    exports com.example.demo111;
}