package model;

import java.io.BufferedWriter;
import java.io.File;
import java.io.FileWriter;
import java.io.IOException;
import java.util.Iterator;
import java.util.logging.Level;
import java.util.logging.Logger;

import View.GUIMenuBar;
import javafx.collections.ObservableList;

import presenter.GherkinPresenter;

public class saveFile {

public static void savetext(File file, String content){	
	
ObservableList<CharSequence> paragraph = GherkinPresenter.readTextArea.getParagraphs();
Iterator<CharSequence> iterator = paragraph.iterator();

try {
	BufferedWriter bufferedwriter = new BufferedWriter(new FileWriter(file));
	while(iterator.hasNext())
	{
		CharSequence charactersequence = iterator.next();
		bufferedwriter.append(charactersequence);
		bufferedwriter.newLine();
	}
} catch (IOException e) {
	// TODO Auto-generated catch block
	e.printStackTrace();
}


}
//
//	public static void savetext(File file, String content) {
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
//		
//	}
	



}