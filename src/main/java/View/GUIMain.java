package View;

import javafx.application.Application;
import javafx.scene.Scene;
import javafx.scene.layout.StackPane;
import javafx.stage.Stage;

public class GUIMain extends Application {

	public static void main(String[] args) {
		launch(args);
	}

	@Override
	public void start(Stage primaryStage) throws Exception {
		primaryStage.setTitle("RUCM - Use Case Creator");
		
		StackPane mainpane = new StackPane();	
		
		Scene scene = new Scene(mainpane, 500, 400);
		primaryStage.setScene(scene);
		primaryStage.show();
}
}