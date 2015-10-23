package cis232.helloworld;
import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.scene.control.Button;
import javafx.scene.control.Label;
import javafx.scene.image.Image;
import javafx.scene.image.ImageView;

public class HelloWorldController {

    @FXML
    private Button button;

    @FXML
    private Label label;
    
    @FXML
    private ImageView image;

    @FXML
    void buttonClickListener(ActionEvent event) {
    	label.setVisible(true);
    	Image coin = new Image(getClass().getResourceAsStream("coin.jpg"));
    	//You could use a URL!
    	//Image coin = new Image("https://upload.wikimedia.org/wikipedia/commons/0/0a/George_Washington_Presidential_$1_Coin_obverse.png");
    	image.setImage(coin);
    }

}
