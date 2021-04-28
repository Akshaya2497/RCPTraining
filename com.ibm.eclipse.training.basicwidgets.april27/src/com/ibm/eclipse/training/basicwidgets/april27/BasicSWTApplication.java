package com.ibm.eclipse.training.basicwidgets.april27;

import org.eclipse.swt.widgets.Display;
import org.eclipse.swt.widgets.Shell;
import org.eclipse.swt.widgets.Widget;

public class BasicSWTApplication {
	
	private static void createAnShell(){
		//Display - Connection between application and OS		
		Display display = new Display();
		
		//Shell - Shell is a container Widget.class It contain other widgets
		Shell shell = new Shell();
		//Opening a shell
		shell.open();
		
		/*Check if the user has closed the shell then read the os even queue for any
		events Put the display thread to sleep if there are no events in the event queue
		*/
		
		while(!shell.isDisposed()){
			if(!display.readAndDispatch())
				display.sleep();
		}
		//Display all the OS resource
		display.dispose();
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		createAnShell();

	}

}
