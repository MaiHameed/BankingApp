
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

public class ManagerPageController {

    @FXML
    private Button logoutButton;

    Window owner = logoutButton.getScene().getWindow();

    @FXML
    protected void handleAddCustomerButton(ActionEvent actionEvent) {
    }

    @FXML
    protected void handleDeleteCustomerButton(ActionEvent actionEvent) {
    }

    @FXML
    protected void handleLogoutButton(ActionEvent actionEvent) {

    }
}
