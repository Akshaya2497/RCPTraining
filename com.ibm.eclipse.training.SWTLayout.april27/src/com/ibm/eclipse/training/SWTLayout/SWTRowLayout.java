package com.ibm.eclipse.training.SWTLayout;

import org.eclipse.swt.SWT;
import org.eclipse.swt.layout.FillLayout;
import org.eclipse.swt.layout.RowLayout;
import org.eclipse.swt.widgets.Button;
import org.eclipse.swt.widgets.Display;
import org.eclipse.swt.widgets.Shell;

public class SWTRowLayout {
	
	private static void createAnShell(){
		//Display - Connection between application and OS		
		Display display = new Display();
		
		//Shell - Shell is a container Widget.class It contain other widgets
		Shell shell = new Shell();
		{
		//FillLayout fills the complete window area
		RowLayout rowLayout = new RowLayout();
		rowLayout.type=SWT.VERTICAL;
		rowLayout.marginTop=10;
		rowLayout.marginBottom=10;
		rowLayout.marginLeft=10;
		rowLayout.marginRight=10;
		rowLayout.spacing=20;
		
		shell.setLayout(rowLayout);
		}
		{
			//Buttons are added on top of the Shell widgets
			
			Button button01 =  new Button(shell, SWT.PUSH);
			button01.setText("Button01");
			Button button02 =  new Button(shell, SWT.PUSH);
			button02.setText("Button02");
			Button button03 =  new Button(shell, SWT.PUSH);
			button03.setText("Button03");
			
		}
		
		
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
