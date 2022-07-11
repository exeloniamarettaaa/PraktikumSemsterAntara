module com.example.soal3 {
    requires javafx.controls;
    requires javafx.fxml;


    opens com.example.soal3 to javafx.fxml;
    exports com.example.soal3;
}