package com.ibm.eclipse.training.jface.jobs.view;


import org.eclipse.swt.SWT;
import org.eclipse.swt.events.SelectionAdapter;
import org.eclipse.swt.events.SelectionEvent;
import org.eclipse.swt.layout.GridLayout;
import org.eclipse.swt.widgets.Button;
import org.eclipse.swt.widgets.Composite;
import org.eclipse.swt.widgets.Label;
import org.eclipse.ui.part.ViewPart;

import com.ibm.eclipse.training.jface.jobs.view.impl.HelloWorldJob;
import com.ibm.eclipse.training.jface.jobs.view.impl.HelloWorldJobWithProgress;



public class JobsView extends ViewPart {

	private void addHelloWorldJobsControlsr(Composite composite) {
		new Label(composite,SWT.WRAP).setText("Hello world Job!");
		Button button = new Button(composite, SWT.PUSH);
		button.setText("Shedule...");
		button.addSelectionListener(new SelectionAdapter() {
			@Override
			public void widgetSelected(SelectionEvent e) {
				//Schedule the job from here
				HelloWorldJob job = new HelloWorldJob();
				job.schedule();
				
			}
		});
		

	}
	
	
	private void addHelloWorldJobsWithProgressControl(Composite composite) {
		new Label(composite,SWT.WRAP).setText("Hello world Job with progress controll!");
		Button button = new Button(composite, SWT.PUSH);
		button.setText("Shedule...");
		button.addSelectionListener(new SelectionAdapter() {
			@Override
			public void widgetSelected(SelectionEvent e) {
				//Schedule the job from here
				HelloWorldJobWithProgress jobWithProgress = new HelloWorldJobWithProgress();
				jobWithProgress.schedule();
				
			}
		});

	}
	
	@Override
	public void createPartControl(Composite parent) {
		
		Composite composite = new Composite(parent,SWT.None);
		composite.setLayout(new GridLayout(2,false));
		//Hello world Job
		addHelloWorldJobsControlsr(composite);
		//
		addHelloWorldJobsWithProgressControl(composite);
	}

	@Override
	public void setFocus() {
		// TODO Auto-generated method stub

	}

}
