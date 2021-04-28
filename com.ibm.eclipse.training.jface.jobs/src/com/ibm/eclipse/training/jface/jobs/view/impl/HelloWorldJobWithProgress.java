package com.ibm.eclipse.training.jface.jobs.view.impl;

import org.eclipse.core.runtime.IProgressMonitor;
import org.eclipse.core.runtime.IStatus;
import org.eclipse.core.runtime.Status;
import org.eclipse.core.runtime.jobs.Job;

public class HelloWorldJobWithProgress extends Job {

	public HelloWorldJobWithProgress() {
		super("Hello world Job");
		
	}

	@Override
	protected IStatus run(IProgressMonitor monitor) {
		int unitsOfWork = 1000;
		try {
		monitor.beginTask("Starting hellow world long running process", unitsOfWork);
		for(int i=0; i< unitsOfWork;i++) {
			// Check if the monitor is cancelled by the user
			if(monitor.isCanceled())
				return Status.CANCEL_STATUS;
			try {
				// This will be replaced by your original business code
				Thread.sleep(10);
			} catch (InterruptedException e) {				
				e.printStackTrace();
			}
			// This will increment the job by 1 units everytime the loop is run
			monitor.worked(1);
		
			
		}
		}finally{
			monitor.done();
		}
		
			
		return Status.OK_STATUS;
	}

}
