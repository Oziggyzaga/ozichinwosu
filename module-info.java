module com.example.start {
    requires javafx.controls;
    requires javafx.fxml;


    opens com.example.start to javafx.fxml;
    exports com.example.start;
    exports com.example.multiplebounceball;
    opens com.example.multiplebounceball to javafx.fxml;
}