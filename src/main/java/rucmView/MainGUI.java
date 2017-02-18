package rucmView;

import javafx.application.Application;
import javafx.fxml.FXMLLoader;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.stage.Stage;

public class MainGUI extends Application {

	@Override
	public void start(Stage mainStage) throws Exception {
		Parent root = FXMLLoader.load(getClass().getResource("MainView.fxml"));
		mainStage.setTitle("RUCM Application");
		mainStage.setScene(new Scene(root, 800, 500));
		mainStage.show();
	}
	
	public static void main(String[] args) {
		launch(args);
	}
	
}
