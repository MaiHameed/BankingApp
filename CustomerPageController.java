import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.scene.control.Label;

public class CustomerPageController {
    @FXML
    private Label header;
    @FXML
    private Label balanceLabel;
    private static Customer c;

    //Declares the currently logged in customer, in order to get all information.
    public static void setCustomer(Customer x){
        c = x;
    }

    @FXML
    public void initialize(){
        header.setText("Welcome "+c.getUsername()+"!");
        balanceLabel.setText("Balance: $"+c.getBalance());
    }

    @FXML
    public void handleWithdrawButton(ActionEvent actionEvent) {
        //TODO withdraw
    }

    @FXML
    public void handleDepositButton(ActionEvent actionEvent) {
        //TODO deposit
    }

    @FXML
    public void handlePurchaseButton(ActionEvent actionEvent) {
        //TODO purchase
    }

    @FXML
    public void handleLogoutButton(ActionEvent actionEvent) {
        VistaNavigator.loadVista(VistaNavigator.LOGIN_PAGE);
    }
}
