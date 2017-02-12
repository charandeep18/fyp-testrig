package View;

import javafx.application.Application;
import javafx.application.Platform;
import javafx.event.ActionEvent;
import javafx.event.Event;
import javafx.event.EventHandler;
import javafx.scene.Scene;
import javafx.scene.control.Menu;
import javafx.scene.control.MenuBar;
import javafx.scene.control.MenuItem;
import javafx.scene.layout.StackPane;
import javafx.stage.Stage;

public class GUIMenuBar extends Application implements EventHandler<ActionEvent> {
	
	//Main Pane and Menu Stage
	static StackPane mainpane = new StackPane();
	static public Stage menuStage = new Stage();
	
	//MenuBar
	MenuBar menuBar = new MenuBar();
	
	//fileMenu and fileMenu Items
	private Menu fileMenu = new Menu("File");
	private MenuItem open = new MenuItem("Open text file");
	private MenuItem save = new MenuItem("Save text file");
	private MenuItem close = new MenuItem("Close Program");
	
	//viewMenu and viewMenu Items
	private Menu viewMenu = new Menu("View");
	private MenuItem gherkinRUCM = new MenuItem("Gherkin/RUCM");
	private MenuItem selenium = new MenuItem("Selenium");
	
	//runMenu and runMenu Items
	private Menu runMenu = new Menu("Run Options");
	private MenuItem chrome = new MenuItem("Open Chrome");
	private MenuItem firefox = new MenuItem("Open FireFox");
	
	//helpMenu
	private Menu helpMenu = new Menu("Help");
	
	//Menu

	public static void main(String[] args) {
		launch(args);
	}	
	
	@Override
	public void start(Stage menuStage) throws Exception {

	fileMenu.getItems().addAll(open,save,close);
	viewMenu.getItems().addAll(gherkinRUCM,selenium);
	runMenu.getItems().addAll(chrome,firefox);
	menuBar.getMenus().addAll(fileMenu,viewMenu,runMenu,helpMenu);
	

	mainpane.getChildren().add(menuBar);	
	Scene scene = new Scene(mainpane, 500, 400);
	
	menuStage.setScene(scene);
	menuStage.show();
	
	close.setOnAction(e -> {
		Platform.exit();
		System.exit(0);
		});
	}
	
	
	
		@Override
	public void handle(ActionEvent event) {

	}
		

}
