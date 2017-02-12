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
	
	//FileMenu and FileMenu Items
	private Menu fileMenu = new Menu("File");
	private MenuItem open = new MenuItem("Open text file");
	private MenuItem save = new MenuItem("Save text file");
	private MenuItem close = new MenuItem("Close Program");
	
	//

	public static void main(String[] args) {
		launch(args);
	}	
	
	@Override
	public void start(Stage menuStage) throws Exception {

	fileMenu.getItems().addAll(open,save,close);
	
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
	
	final Menu helpMenu = new Menu ("Help");
	helpMenu.setOnAction(this);
	
	MenuBar menuBar = new MenuBar();
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
