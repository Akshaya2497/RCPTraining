package com.ibm.eclipse.training.SWTLayout;

import org.eclipse.jface.dialogs.MessageDialog;
import org.eclipse.jface.layout.RowLayoutFactory;
import org.eclipse.swt.SWT;
import org.eclipse.swt.events.SelectionAdapter;
import org.eclipse.swt.events.SelectionEvent;
import org.eclipse.swt.graphics.Point;
import org.eclipse.swt.layout.FillLayout;
import org.eclipse.swt.layout.RowLayout;
import org.eclipse.swt.widgets.Button;
import org.eclipse.swt.widgets.Display;
import org.eclipse.swt.widgets.Shell;

public class SWTWidgetWithListeners {
	
	private static void createAnShell(){		
		Display display = new Display();		
		Shell shell = new Shell();
		{		
		RowLayoutFactory.fillDefaults()
		.margins(50,100)
		.margins(new Point(10, 10))
		.applyTo(shell);
		}
		{
			Button button01 =  new Button(shell, SWT.PUSH);
			button01.setText("Button01");
			button01.addSelectionListener(new SelectionAdapter() {				
				@Override
				public void widgetSelected(SelectionEvent e) {
					Shell shell = Display.getDefault().getActiveShell();
					MessageDialog.openInformation(shell, 
							"Greeting Dialog", //Title
							"Hello, You have clicked on Button01 :)"//Message
							);
				}
			
			});
			
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
