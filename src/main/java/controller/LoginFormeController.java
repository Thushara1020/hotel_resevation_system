package controller;

import javafx.fxml.FXML;
import javafx.fxml.FXMLLoader;
import javafx.scene.Scene;
import javafx.scene.control.TextField;
import javafx.scene.control.PasswordField;
import javafx.scene.control.Button;
import javafx.stage.Stage;

import java.io.IOException;

public class LoginFormeController {
    @FXML
    Stage stage = new Stage();
     public void onLoginAction() {
        String username = txtUsername.getText();
        System.out.println("Entered Username: " + username);

        try {
            stage.setScene(new Scene(FXMLLoader.load(getClass().getResource("/view/customer_dashboard.fxml"))));
            stage.show();
        } catch (IOException e) {
            throw new RuntimeException(e);
        }

    }
    @FXML
   TextField txtUsername;

    @FXML
   PasswordField txtPassword;

    @FXML
    Button btnLogin;

    @FXML
    Button btnCancel;

    // Login button action


    // Cancel button action
    @FXML
    public void onCancelAction() {
        System.out.println("Login cancelled!");
        txtUsername.clear();
        txtPassword.clear();
    }
}
