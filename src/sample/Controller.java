package sample;

import javafx.fxml.FXML;
import javafx.scene.control.TextField;

public class Controller {

    @FXML
    private TextField nameTextField;

    public Controller() {
    }

    @FXML
    void initilize() {
    };

    @FXML
    public void clickEvent() {
        nameTextField.setText("");
    }
}
