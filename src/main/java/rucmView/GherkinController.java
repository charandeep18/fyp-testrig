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
import javafx.stage.FileChooser;

public class GherkinController {

	private Desktop desktop = Desktop.getDesktop();
	private final FileChooser fileChooser = new FileChooser();
	
    @FXML
    private MenuItem exit;
    
    @FXML
    private MenuItem loadFile;

    @FXML
    public void ExitApplication(ActionEvent event) {
		Platform.exit();
		System.exit(0);
		System.out.println("Program has closed successfully");
    }
    
    @FXML
    public void openFile(File file) {
        try {
            desktop.open(file);
        } catch (IOException ex) {
            Logger.getLogger(
                GUIMenuBar.class.getName()).log(
                    Level.SEVERE, null, ex
                );
        }
    }
    
    @FXML
    public void saveFile(File file, String content) {
    	try {
    		FileWriter fileWriter = null;
    		fileWriter = new FileWriter(file);
    		fileWriter.write(content);
    		fileWriter.close();
    	} catch (IOException ex) {
    		Logger.getLogger(
    				GUIMenuBar.class.getName()).log(
    						Level.SEVERE, null, ex);
    	}
    }

}
