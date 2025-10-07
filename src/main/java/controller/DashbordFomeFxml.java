package controller;

import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.fxml.FXMLLoader;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.stage.Stage;

import java.io.IOException;

public class DashbordFomeFxml {

    @FXML
    private Button btnAddNew;

    @FXML
    private Button btnHome;

    @FXML
    private Button btnProfile;

    @FXML
    private Button btnSettings;

    @FXML
    void actionAddNew(ActionEvent event) {

    }

    @FXML
    void actionProfile(ActionEvent event) {

    }

    @FXML
    void actionSettings(ActionEvent event) {

    }

    @FXML
    void homeAction(ActionEvent event) {
        Stage stage = new Stage();
        try {
            stage.setScene(new Scene(FXMLLoader.load(getClass().getResource("/view/home_fome_fxml.fxml"))));
        } catch (IOException e) {
            throw new RuntimeException(e);
        }
        stage.show();

    }

}