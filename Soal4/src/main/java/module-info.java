module com.example.soal4 {
    requires javafx.controls;
    requires javafx.fxml;


    opens com.example.soal4 to javafx.fxml;
    exports com.example.soal4;
}