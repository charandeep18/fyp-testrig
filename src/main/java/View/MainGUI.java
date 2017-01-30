package View;

import javafx.application.Application;
import javafx.event.ActionEvent;
import javafx.event.EventHandler;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.layout.StackPane;
import javafx.scene.layout.VBox;
import javafx.stage.Stage;


public class MainGUI extends Application {

	public static void main(String[] args){
		launch(args);
	}
	
	
	@Override
	public void start(Stage mainstage) throws Exception {
		Button button = new Button("Click");
		Button exit = new Button("Exit Application");
		
		VBox root = new VBox();
		
		root.getChildren().addAll(button, exit);
		
		Scene scene = new Scene(root,500,500);
		mainstage.setScene(scene);
		mainstage.setTitle("BDD Requirements Reader");
		mainstage.show();
		
		button.setOnAction(new EventHandler<ActionEvent>(){		
		public void handle(ActionEvent event) {
				System.out.println("hello world");	
			}
		});
		
		exit.setOnAction(new EventHandler<ActionEvent>(){
			public void handle(ActionEvent event) {
				System.out.println("Exit This Applicaton");
				System.exit(0);	
			}
		});
		}
			
	}


