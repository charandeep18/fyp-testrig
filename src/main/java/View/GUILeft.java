package View;

import javafx.application.Application;
import javafx.geometry.Insets;
import javafx.scene.Scene;
import javafx.scene.layout.GridPane;
import javafx.stage.Stage;

public class GUILeft extends Application {

	public static void main(String[] args) {
		launch(args);
	}
	
	@Override
	public void start(Stage primaryStage) throws Exception {
		
	GridPane grid = new GridPane();
	grid.setPadding(new Insets(10,10,10,10));
	grid.setVgap(10);
	grid.setHgap(10);
	grid.setGridLinesVisible(true);	
	
	
	
	Scene scene = new Scene(grid, 500, 400);
	primaryStage.setScene(scene);
	primaryStage.show();
	}

}
