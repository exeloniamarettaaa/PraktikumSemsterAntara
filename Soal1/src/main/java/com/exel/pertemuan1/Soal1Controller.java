package com.exel.pertemuan1;

import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.scene.control.Button;
import javafx.scene.control.Label;
import javafx.scene.control.TextField;

public class Soal1Controller {

    @FXML
    private Button ButtonBagi;

    @FXML
    private Button ButtonKali;

    @FXML
    private Button ButtonKurang;

    @FXML
    private Button ButtonTambah;

    @FXML
    private TextField InputBilangan1;

    @FXML
    private TextField InputBilangan2;

    @FXML
    private TextField InputHasil;

    @FXML
    private Label hasilBilangan;

    @FXML
    private Label labelBilangan1;

    @FXML
    private Label labelBilangan2;


    @FXML
    public void Tambah(ActionEvent actionEvent) {

        int angka1 = (int) Double.parseDouble(InputBilangan1.getText());
        int angka2 = (int) Double.parseDouble(InputBilangan1.getText());

    }
}
