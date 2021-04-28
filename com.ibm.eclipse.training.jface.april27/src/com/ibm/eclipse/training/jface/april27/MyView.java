package com.ibm.eclipse.training.jface.april27;

import org.eclipse.swt.SWT;
import org.eclipse.swt.layout.GridLayout;
import org.eclipse.swt.widgets.Button;
import org.eclipse.swt.widgets.Composite;
import org.eclipse.ui.part.ViewPart;

public class MyView extends ViewPart {

	@Override
	public void createPartControl(Composite parent) {
		// TODO Auto-generated method stub
		//Default layout=FillLayout
		Composite composite = new Composite(parent, SWT.None);
		composite.setLayout(new GridLayout(2, false));
		
		Button button01 =  new Button(composite, SWT.PUSH);
		button01.setText("Button01");
		Button button02 =  new Button(composite, SWT.PUSH);
		button02.setText("Button02");
		Button button03 =  new Button(composite, SWT.PUSH);
		button03.setText("Button03");

	}

	@Override
	public void setFocus() {
		// TODO Auto-generated method stub

	}

}
