import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.scene.control.TextField;

import java.io.*;

public class AddCustomerController {
    @FXML
    private TextField passwordTextField;
    @FXML
    private TextField usernameTextField;

    @FXML
    public void handleBackButton(ActionEvent actionEvent) {
        VistaNavigator.loadVista(VistaNavigator.MANAGER_PAGE);
    }

    /*
    Checks if a customer already exists with the username, if so, display an error box,
    if not, creates a file named after the username, with a String representing the password.
     */
    @FXML
    public void handleSubmitButton(ActionEvent actionEvent) {
        String username = new String(usernameTextField.getText());
        String fileName = username + ".txt";
        File parentDir = new File("data");
        File file = new File(parentDir, fileName);
        if(file.exists() && !file.isDirectory()) {
            System.out.print("Exists");
            /* TODO
            Add an error box
             */
        }else{
            /*
            final File parentDir = new File("crawl_html");
            parentDir.mkdir();
            final String hash = "abc";
            final String fileName = hash + ".txt";
            final File file = new File(parentDir, fileName);
            file.createNewFile(); // Creates file crawl_html/abc.txt
             */
            System.out.print("Doesn't Exist");
        }
    }
}
