module org.example.laba1TFLK {
    requires javafx.controls;
    requires javafx.fxml;
    requires javafx.graphics;



    opens org.example.laba1TFLK to javafx.fxml;
    exports org.example.laba1TFLK;
}