package cis232.helloworld;
import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.scene.control.Button;
import javafx.scene.control.Label;
import javafx.scene.input.KeyEvent;

public class HelloWorldController {

    @FXML
    private Button button;

    @FXML
    private Label label;

    @FXML
    void buttonClickListener(ActionEvent event) {
    	label.setVisible(true);
    }
    
    @FXML
    void keyReleasedListener(KeyEvent event) {
    	label.setText(event.getText());
    }

}
