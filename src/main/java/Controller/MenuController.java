package Controller;

import javafx.application.Platform;

public interface MenuController {

    public default void closeProgram(){
		Platform.exit();
		System.exit(0);
		System.out.println("Program has closed successfully");
	
}
}