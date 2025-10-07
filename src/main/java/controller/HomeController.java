package controller;

import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.fxml.FXMLLoader;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.stage.Stage;

import java.io.IOException;

public class HomeController {

    Stage stage = new Stage();

    public Button btnTableView;

    @FXML
    void actionTableView(ActionEvent event) {
        try {
            stage.setScene(new Scene(FXMLLoader.load(getClass().getResource("/view/table_view_form_fxml.fxml"))));
        } catch (IOException e) {
            throw new RuntimeException(e);
        }
        stage.show();

    }

}
