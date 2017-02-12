package View;

import javafx.application.Application;
import javafx.scene.Scene;
import javafx.scene.control.Menu;
import javafx.scene.control.MenuBar;
import javafx.scene.control.MenuItem;
import javafx.scene.layout.StackPane;
import javafx.stage.Stage;

public class GUIMenuBar extends Application {

	public static void main(String[] args) {
		launch(args);
	}	
	@Override
	public void start(Stage primaryStage) throws Exception {
	final Menu fileMenu = new Menu ("File");
	fileMenu.getItems().add(new MenuItem("Open text file"));
	fileMenu.getItems().add(new MenuItem("Save text file"));
	fileMenu.getItems().add(new MenuItem("Close Program"));
	
	final Menu viewMenu = new Menu ("View");
	viewMenu.getItems().add(new MenuItem("Open text file"));
	viewMenu.getItems().add(new MenuItem("Save text file"));
	viewMenu.getItems().add(new MenuItem("Close Program"));
	
	final Menu seleniumMenu = new Menu ("Selenium"); 
	seleniumMenu.getItems().add(new MenuItem("Open Chrome"));
	seleniumMenu.getItems().add(new MenuItem("Open Firefox"));
	
	final Menu helpMenu = new Menu ("Helpmenu");
	
	MenuBar menuBar = new MenuBar();
	menuBar.getMenus().addAll(fileMenu,viewMenu,seleniumMenu,helpMenu);
	
	StackPane mainpane = new StackPane();
	mainpane.getChildren().add(menuBar);
	
	Scene scene = new Scene(mainpane, 500, 400);
	
	primaryStage.setScene(scene);
	primaryStage.show();
	}

}
