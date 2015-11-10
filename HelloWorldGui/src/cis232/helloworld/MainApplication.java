package cis232.helloworld;

import javafx.application.Application;
import javafx.fxml.FXMLLoader;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.stage.Stage;

public class MainApplication extends Application {

	@Override
	public void start(Stage stage) throws Exception {
		//Load the FXML file
		Parent parent = FXMLLoader.load(getClass().getResource("HelloWorld.fxml"));
		
		//Set up a scene using the FXML file
		Scene scene = new Scene(parent);
		
        //Stage Setup
		//Set up our stage using the scene
		stage.setScene(scene);
		stage.show();
	}

	public static void main(String[] args) {
		launch(args);
	}

}
