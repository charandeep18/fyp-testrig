package View;

import javafx.application.Application;
import javafx.event.ActionEvent;
import javafx.event.Event;
import javafx.event.EventHandler;
import javafx.scene.Scene;
import javafx.scene.control.Menu;
import javafx.scene.control.MenuBar;
import javafx.scene.control.MenuItem;
import javafx.scene.layout.StackPane;
import javafx.stage.Stage;

public class GUIMenuBar extends Application implements EventHandler {
	
	static StackPane mainpane = new StackPane();

	public static void main(String[] args) {
		launch(args);
	}	
	
	@Override
	public void start(Stage primaryStage) throws Exception {
	final Menu fileMenu = new Menu ("File");
	MenuItem open = new MenuItem("Open text file");
	MenuItem save = new MenuItem("Save text file");
	MenuItem close = new MenuItem("Close Program");
	fileMenu.getItems().addAll(open,save,close);
	
//	fileMenu.getItems().add(new MenuItem("Open text file"));
//	fileMenu.getItems().add(new MenuItem("Save text file"));
//	fileMenu.getItems().add(new MenuItem("Close Program"));
	
	final Menu viewMenu = new Menu ("View");
	MenuItem gherkinRUCM = new MenuItem("Gherkin/RUCM");
	MenuItem selenium = new MenuItem("Selenium");
	viewMenu.getItems().addAll(gherkinRUCM,selenium);
	
//	viewMenu.getItems().add(new MenuItem("Gherkin/RUCM"));
//	viewMenu.getItems().add(new MenuItem("Selenium"));	
	
	
	final Menu runMenu = new Menu ("Run"); 
	MenuItem chrome = new MenuItem("Open Chrome");
	MenuItem firefox = new MenuItem("Open Firefox");
	runMenu.getItems().addAll(chrome,firefox);
//	seleniumMenu.getItems().add(new MenuItem("Open Chrome"));
//	seleniumMenu.getItems().add(new MenuItem("Open Firefox"));
	
	final Menu helpMenu = new Menu ("Helpmenu");
	helpMenu.setOnAction(this);
	
	MenuBar menuBar = new MenuBar();
	menuBar.getMenus().addAll(fileMenu,viewMenu,runMenu,helpMenu);
	

	mainpane.getChildren().add(menuBar);
	
	Scene scene = new Scene(mainpane, 500, 400);
	
	primaryStage.setScene(scene);
	primaryStage.show();
	}

	@Override
	public void handle(Event event) {
		// TODO Auto-generated method stub
		
	}

}
