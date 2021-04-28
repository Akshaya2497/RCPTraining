package com.ibm.eclipse.training.SWTLayout;

import org.eclipse.jface.layout.GridLayoutFactory;
import org.eclipse.jface.layout.RowLayoutFactory;
import org.eclipse.swt.SWT;
import org.eclipse.swt.graphics.Point;
import org.eclipse.swt.layout.FillLayout;
import org.eclipse.swt.layout.RowLayout;
import org.eclipse.swt.widgets.Button;
import org.eclipse.swt.widgets.Display;
import org.eclipse.swt.widgets.Shell;

public class SWTGridLayoutUsingFactory {
	
	private static void createAnShell(){		
		Display display = new Display();		
		Shell shell = new Shell();
		{		
		/*GridLayoutFactory.fillDefaults()
		.margins(20, 20)
		.numColumns(2)
		.spacing(20, 20)
		.applyTo(shell);*/
		
		GridLayoutFactory.swtDefaults()
		.margins(20, 20)
		.numColumns(2)
		.spacing(20,20)
		.applyTo(shell);
		
		}
		{
			Button button01 =  new Button(shell, SWT.PUSH);
			button01.setText("Button01");
			Button button02 =  new Button(shell, SWT.PUSH);
			button02.setText("Button02");
			Button button03 =  new Button(shell, SWT.PUSH);
			button03.setText("Button03");
			
		}
		shell.open();
		
		while(!shell.isDisposed()){
			if(!display.readAndDispatch())
				display.sleep();
		}		
		display.dispose();
	}


	public static void main(String[] args) {
		// TODO Auto-generated method stub
		createAnShell();

	}

}
