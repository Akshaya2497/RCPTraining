package com.ibm.eclipse.training.jface.viewers.april27;

import java.net.URL;

import org.eclipse.core.runtime.FileLocator;
import org.eclipse.core.runtime.Path;
import org.eclipse.jface.resource.ImageDescriptor;
import org.eclipse.jface.resource.JFaceResources;
//import org.eclipse.jface.resource.JFaceResources;
import org.eclipse.jface.resource.LocalResourceManager;
//import org.eclipse.jface.resource.LocalResourceManager;
import org.eclipse.jface.resource.ResourceManager;
import org.eclipse.jface.viewers.ColumnLabelProvider;
//import org.eclipse.jface.resource.ResourceManager;
import org.eclipse.jface.viewers.IStructuredContentProvider;
import org.eclipse.jface.viewers.ITreeContentProvider;
import org.eclipse.jface.viewers.LabelProvider;
import org.eclipse.jface.viewers.ListViewer;
import org.eclipse.jface.viewers.TableViewer;
import org.eclipse.jface.viewers.TableViewerColumn;
import org.eclipse.jface.viewers.TreeViewer;
import org.eclipse.swt.SWT;
import org.eclipse.swt.graphics.Image;
import org.eclipse.swt.widgets.Composite;
import org.eclipse.ui.part.ViewPart;
import org.osgi.framework.Bundle;
import org.osgi.framework.FrameworkUtil;

import com.ibm.eclipse.training.jface.model.april27.Product;
import com.ibm.eclipse.training.jface.model.april27.ProductBundle;

/**
 * ListViewer can not have icon or lines
 *
 */
public class MyTableViewerWithColumns extends ViewPart {
	

	private class  TableViewerContentProvider implements IStructuredContentProvider {

		@Override
		public Object[] getElements(Object inputElement) {
			return ((ProductBundle)inputElement).getProdcts().toArray();
		}
		
	}
	
		
		
		private void addProductNameColumn(TableViewer viewer) {
			TableViewerColumn tableColumn = new TableViewerColumn(viewer, SWT.None);
			tableColumn.getColumn().setWidth(400);
			tableColumn.getColumn().setText("Product Name");
			tableColumn.setLabelProvider(new ColumnLabelProvider() {
				@Override
				public String getText(Object element) {
					return ((Product)element).getName();
					
				};
			});
			
		}
		
		private void addProductCodeColumn(TableViewer viewer) {
			TableViewerColumn tableColumn = new TableViewerColumn(viewer, SWT.None);
			tableColumn.getColumn().setWidth(400);
			tableColumn.getColumn().setText("Product Code");
			tableColumn.setLabelProvider(new ColumnLabelProvider() {
				@Override
				public String getText(Object element) {
					return String.valueOf(((Product)element).getCode());
					
				};
			});
			
		}
		
		
	/**
	 *
	 */
	@Override
	public void createPartControl(Composite parent) {
		// TODO Auto-generated method stub
		TableViewer tableViewer = new TableViewer(parent);
		
		tableViewer.getTable().setHeaderVisible(true);
		tableViewer.getTable().setLinesVisible(true);
		
		tableViewer.setContentProvider(new TableViewerContentProvider());
		
		addProductNameColumn(tableViewer);
		addProductCodeColumn(tableViewer);
		tableViewer.setInput(new ProductBundle("My Product"));

	}

	
	@Override
	public void setFocus() {
		// TODO Auto-generated method stub

	}

}
