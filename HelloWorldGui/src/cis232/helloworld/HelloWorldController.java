package cis232.helloworld;
import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.scene.control.Button;
import javafx.scene.control.Label;

public class HelloWorldController {

    @FXML
    private Button button;

    @FXML
    private Label label;

    @FXML
    void buttonClickListener(ActionEvent event) {
    	label.setVisible(true);
    }

}
