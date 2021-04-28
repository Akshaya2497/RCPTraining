package com.ibm.eclipse.training.SWTLayout.data;

import org.eclipse.jface.layout.GridDataFactory;
import org.eclipse.jface.layout.GridLayoutFactory;
import org.eclipse.jface.layout.RowDataFactory;
import org.eclipse.swt.SWT;
import org.eclipse.swt.layout.FillLayout;
import org.eclipse.swt.layout.GridData;
import org.eclipse.swt.layout.GridLayout;
import org.eclipse.swt.layout.RowData;
import org.eclipse.swt.layout.RowLayout;
import org.eclipse.swt.widgets.Button;
import org.eclipse.swt.widgets.Display;
import org.eclipse.swt.widgets.Shell;

public class SWTGridLayoutData {
	
	private static void createAnShell(){
			
		Display display = new Display();
		Shell shell = new Shell();
		{
		GridLayoutFactory.fillDefaults()
		.margins(20,20)
		.numColumns(2)
		.spacing(20,20)		
		.applyTo(shell);
		
		
		}
		{		
			Button button01 =  new Button(shell, SWT.PUSH);
			button01.setText("Button01");
			GridData gridData = new GridData();
			gridData.grabExcessHorizontalSpace=true;
			gridData.grabExcessVerticalSpace=false;
			gridData.horizontalAlignment=SWT.FILL;
			gridData.horizontalSpan=2;
			button01.setLayoutData(gridData);
			
			Button button02 =  new Button(shell, SWT.PUSH);
			button02.setText("Button02");
			GridDataFactory.fillDefaults()
			.grab(false, true)
			.span(2, 0)
			.align(SWT.BEGINNING, SWT.FILL)
			.applyTo(button02);
			
			
			Button button03 =  new Button(shell, SWT.PUSH);
			button03.setText("Button03");
		
			
		}
		
		shell.open();
	
		while(!shell.isDisposed()){
			if(!display.readAndDispatch())
				display.sleep();
		}
	
	}


	public static void main(String[] args) {
		// TODO Auto-generated method stub
		createAnShell();

	}

}
