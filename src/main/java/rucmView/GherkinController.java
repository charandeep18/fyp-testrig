package rucmView;

import java.awt.Desktop;
import java.io.BufferedReader;
import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.util.logging.Level;
import java.util.logging.Logger;

import Controller.openFile;
import Controller.saveFile;
import View.GUIMenuBar;
import javafx.application.Platform;
import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.scene.control.MenuItem;
import javafx.scene.control.TextArea;
import javafx.scene.control.Button;
import javafx.scene.control.MenuBar;
import javafx.scene.layout.AnchorPane;
import javafx.scene.layout.GridPane;
import javafx.stage.FileChooser;
import javafx.stage.Stage;

public class GherkinController {

	private Desktop desktop = Desktop.getDesktop();
    private final FileChooser fileChooser = new FileChooser();
    
    @FXML
    private Button loadButton;    
    
    @FXML
    private AnchorPane MainStage;
    
    @FXML
    private MenuBar MenuBar;
	
    @FXML
    private MenuItem exit;
    
    @FXML
    private MenuItem loadFile;
    
    @FXML
    private GridPane GridPane;
    
    @FXML
    private Button closeButton;

    @FXML
    private TextArea readTextArea;
    
    @FXML
    private MenuItem saveContents;
   
    @FXML
    public void OpenFile(ActionEvent event) {
    	// Setting the filter to show only text files
    	FileChooser.ExtensionFilter filter = new FileChooser.ExtensionFilter("TXT Files (*.txt)","*.txt");
    	
    	FileChooser filechooser = new FileChooser();
    	filechooser.getExtensionFilters().add(filter);
    	filechooser.setTitle("Open File");
   	
    	File file = filechooser.showOpenDialog(MainStage.getScene().getWindow());
    	if(file != null){
    		readTextArea.setText(openFile.readFile(file));
    	}
    }
    
    @FXML
    public void SaveFile(ActionEvent event) {
    	FileChooser fileChooser = new FileChooser();
		File file = fileChooser.showSaveDialog(MainStage.getScene().getWindow());
		fileChooser.setTitle("Save File");
		if (file != null) {
			saveFile.savetext(file,"");
		}
    }
    
    @FXML
    public void ExitApplication(ActionEvent event) {
		Platform.exit();
		System.exit(0);
		System.out.println("Program has closed successfully");
    }
}
