package rucmView;

import java.awt.Desktop;
import java.io.File;
import java.io.FileWriter;
import java.io.IOException;
import java.util.logging.Level;
import java.util.logging.Logger;

import View.GUIMenuBar;
import javafx.application.Platform;
import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.scene.control.MenuItem;
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
    public void OpenFile(ActionEvent event) {
    	FileChooser filechooser = new FileChooser();
    	filechooser.showOpenDialog(MainStage.getScene().getWindow());
    	File file = filechooser.get
    	File filename = file.getAbsoluteFile();
    	
    	
    	
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
    

    	
    	
    	//            File file = fileChooser.showOpenDialog(new Stage());
//            fileChooser.setTitle("Open Gherkin File");
//            if (file != null) {
//            	try {
//            		desktop.open(file);
//            	} catch (IOException exception) {
//            		Logger.getLogger(
//            				MainGUI.class.getName()).log(Level.SEVERE, null, exception);
//            	}
//            	}
//            }
//    

//    @FXML
//    public void saveFile(File file, String content) {
//    	try {
//    		FileWriter fileWriter = null;
//    		fileWriter = new FileWriter(file);
//    		fileWriter.write(content);
//    		fileWriter.close();
//    	} catch (IOException ex) {
//    		Logger.getLogger(
//    				GUIMenuBar.class.getName()).log(
//    						Level.SEVERE, null, ex);
//    	}
//    }

}
