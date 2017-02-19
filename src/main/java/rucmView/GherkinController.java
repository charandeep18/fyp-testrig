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
    public void OpenFile(ActionEvent event) {
    	// Setting the filter to show only text files
    	FileChooser.ExtensionFilter filter = new FileChooser.ExtensionFilter("TXT Files (*.txt)","*.txt");
    	
    	FileChooser filechooser = new FileChooser();
    	filechooser.getExtensionFilters().add(filter);
   	
    	File file = filechooser.showOpenDialog(MainStage.getScene().getWindow());
    	if(file != null){
    		readTextArea.setText(readFile(file));
    	}
    	
    	
    	//    	System.out.println("Loading FileChooser");
//        FileChooser filechooser = new FileChooser();
//        filechooser.setTitle("Open File");
//        File file = filechooser.showOpenDialog(MainStage.getScene().getWindow());
//      if (file != null) {
//    	try {
//    		desktop.open(file);
//    	} catch (IOException exception) {
//    		Logger.getLogger(
//    				MainGUI.class.getName()).log(Level.SEVERE, null, exception);
//    	}
//    	}
//    }
    }
    
    @FXML
    public void ExitApplication(ActionEvent event) {
		Platform.exit();
		System.exit(0);
		System.out.println("Program has closed successfully");
    }
    
    private String readFile(File file){
    	//Brings in the BufferedReader IO Library from Java
    	BufferedReader bufferedReader = null;
    	//Brings in the StringBuilder Library from Java
    	StringBuilder stringBuffer = new StringBuilder();
    	
    	try {
    		bufferedReader = new BufferedReader(new FileReader(file));
    		String inputtext;
    		while((inputtext = bufferedReader.readLine()) !=null){
    			stringBuffer.append(inputtext);
    		}
    	} catch (FileNotFoundException fileexception) {
    		Logger.getLogger(
    				GherkinController.class.getName()).log(Level.SEVERE, null, fileexception);
    	} catch (IOException inputexception) {
    		Logger.getLogger(
    				GherkinController.class.getName()).log(Level.SEVERE, null, inputexception);
    	} finally {
    		try {
    			bufferedReader.close();
    		} catch (IOException inputexception) {
        		Logger.getLogger(
        				GherkinController.class.getName()).log(Level.SEVERE, null, inputexception);
    		}
    	}    	
    	return stringBuffer.toString();
    }

}
