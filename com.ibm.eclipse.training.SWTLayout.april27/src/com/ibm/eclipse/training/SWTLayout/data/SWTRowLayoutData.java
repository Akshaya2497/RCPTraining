package com.ibm.eclipse.training.SWTLayout.data;

import org.eclipse.jface.layout.RowDataFactory;
import org.eclipse.swt.SWT;
import org.eclipse.swt.layout.FillLayout;
import org.eclipse.swt.layout.RowData;
import org.eclipse.swt.layout.RowLayout;
import org.eclipse.swt.widgets.Button;
import org.eclipse.swt.widgets.Display;
import org.eclipse.swt.widgets.Shell;

public class SWTRowLayoutData {
	
	private static void createAnShell(){
			
		Display display = new Display();
		Shell shell = new Shell();
		{
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
			Button button01 =  new Button(shell, SWT.PUSH);
			button01.setText("Button01");
			RowData rowData1 = new 	RowData();
			rowData1.height=20;
			rowData1.width=20;
			button01.setLayoutData(rowData1);
			
			Button button02 =  new Button(shell, SWT.PUSH);
			button02.setText("Button02");
			RowDataFactory.swtDefaults().hint(40, 40).applyTo(button02);
			
			
			Button button03 =  new Button(shell, SWT.PUSH);
			button03.setText("Button03");
			RowData rowData3 = new 	RowData();
			rowData3.height=60;
			rowData3.width=60;
			button03.setLayoutData(rowData3);
			
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
