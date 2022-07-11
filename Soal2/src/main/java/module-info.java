module com.example.soal2 {
    requires javafx.controls;
    requires javafx.fxml;


    opens com.example.soal2 to javafx.fxml;
    exports com.example.soal2;
}