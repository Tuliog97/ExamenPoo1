package sample;


import javafx.event.ActionEvent;
import javafx.fxml.FXMLLoader;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.scene.control.PasswordField;
import javafx.scene.text.Text;
import javafx.stage.Stage;

import java.awt.*;


public class Controller {

    public Text mensaje;

    public TextField user;

    public PasswordField password;

    public Button boto;


    public void signIn(ActionEvent evento) throws Exception {
        if (user.getText() == "admin" || password.getText() == "123456") {
            mensaje.setText("Bienvenido");

        }
    }
}