package com.ibm.eclipse.training.jface.jobs.view.impl;

import org.eclipse.core.runtime.IProgressMonitor;
import org.eclipse.core.runtime.IStatus;
import org.eclipse.core.runtime.Status;
import org.eclipse.core.runtime.jobs.Job;

public class HelloWorldJob extends Job {

	public HelloWorldJob() {
		super("Hello world Job");
		
	}

	@Override
	protected IStatus run(IProgressMonitor monitor) {
		System.out.println("Hellow world Job runs");
		System.out.println("Async thred.."+Thread.currentThread());
		return Status.OK_STATUS;
	}

}
