import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.fxml.FXMLLoader;
import javafx.scene.Scene;
import javafx.scene.control.Alert;
import javafx.scene.control.Button;
import javafx.scene.control.TextField;
import javafx.scene.layout.Pane;
import javafx.stage.Stage;
import javafx.stage.Window;

import java.io.IOException;

/**
 * Controller class for the first vista.
 */
public class LoginPageController {

    @FXML
    private TextField passwordTextField;
    @FXML
    private TextField usernameTextField;
    @FXML
    private Button submitButton;

    @FXML
    protected void handleSubmitButton(ActionEvent actionEvent) throws IOException {
        Window owner = submitButton.getScene().getWindow();
        Stage currentStage = (Stage) owner;

        //Displays an error window if username is not provided
        if(usernameTextField.getText().isEmpty()) {
            AlertHelper.showAlert(Alert.AlertType.ERROR, owner, "Login Error", "Please enter your username");
            return;
        }

        //Displays an error window if password is not provided
        if(passwordTextField.getText().isEmpty()) {
            AlertHelper.showAlert(Alert.AlertType.ERROR, owner, "Login Error", "Please enter your password");
            return;
        }

        if(usernameTextField.getText().toLowerCase().equals("admin")){
            if(passwordTextField.getText().toLowerCase().equals("admin")) {
                VistaNavigator.loadVista(VistaNavigator.MANAGER_PAGE);
            }else{
                AlertHelper.showAlert(Alert.AlertType.ERROR, owner, "Login Error", "Invalid username or password");
            }
        }
    }
}