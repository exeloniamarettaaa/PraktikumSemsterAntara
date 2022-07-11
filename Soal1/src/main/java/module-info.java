module com.exel.pertemuan1 {
    requires javafx.controls;
    requires javafx.fxml;


    opens com.exel.pertemuan1 to javafx.fxml;
    exports com.exel.pertemuan1;
}