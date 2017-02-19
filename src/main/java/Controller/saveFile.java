package Controller;

import java.io.File;
import java.io.FileWriter;
import java.io.IOException;
import java.util.logging.Level;
import java.util.logging.Logger;

import View.GUIMenuBar;

public class saveFile {

	public static void savetext(File file, String content) {
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
		
	}}