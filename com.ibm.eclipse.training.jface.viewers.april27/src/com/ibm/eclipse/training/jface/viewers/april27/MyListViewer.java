package com.ibm.eclipse.training.jface.viewers.april27;

import org.eclipse.jface.viewers.IStructuredContentProvider;
import org.eclipse.jface.viewers.LabelProvider;
import org.eclipse.jface.viewers.ListViewer;
import org.eclipse.swt.widgets.Composite;
import org.eclipse.ui.part.ViewPart;

import com.ibm.eclipse.training.jface.model.april27.Product;
import com.ibm.eclipse.training.jface.model.april27.ProductBundle;

/**
 * ListViewer can not have icon or lines
 *
 */
public class MyListViewer extends ViewPart {
	

	private class  ListViewerContentProvider implements IStructuredContentProvider {

		@Override
		public Object[] getElements(Object inputElement) {
			ProductBundle bundle =  (ProductBundle) inputElement;
			return bundle.getProdcts().toArray();
		}
		
	}
	
		
		private class  ListViewerLableProvider extends LabelProvider{
			@Override
			public String getText(Object element) {
				// TODO Auto-generated method stub
				Product product = (Product)element;
				
				return "Name: "+product.getName()+", Code: "+product.getCode();
			}
		}
	@Override
	public void createPartControl(Composite parent) {
		// TODO Auto-generated method stub
		ListViewer listView = new ListViewer(parent);
		listView.setContentProvider(new ListViewerContentProvider());
		listView.setLabelProvider(new ListViewerLableProvider());
		listView.setInput(new ProductBundle("My Products"));

	}

	@Override
	public void setFocus() {
		// TODO Auto-generated method stub

	}

}
