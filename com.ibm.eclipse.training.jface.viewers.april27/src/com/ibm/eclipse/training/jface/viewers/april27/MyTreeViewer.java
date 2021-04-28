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
//import org.eclipse.jface.resource.ResourceManager;
import org.eclipse.jface.viewers.IStructuredContentProvider;
import org.eclipse.jface.viewers.ITreeContentProvider;
import org.eclipse.jface.viewers.LabelProvider;
import org.eclipse.jface.viewers.ListViewer;
import org.eclipse.jface.viewers.TreeViewer;
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
public class MyTreeViewer extends ViewPart {
	

	private class  TreeViewerContentProvider implements ITreeContentProvider {

		@Override
		public Object[] getElements(Object inputElement) {
			 return new Object[] {new ProductBundle("My Product")};
			
		}

		@Override
		public Object[] getChildren(Object parentElement) {
			ProductBundle bundle =  (ProductBundle) parentElement;
			return bundle.getProdcts().toArray();
		}

		@Override
		public Object getParent(Object element) {
			 return null;
		}

		@Override
		public boolean hasChildren(Object element) {
			// TODO Auto-generated method stub
			return element instanceof ProductBundle;
		}
		
	}
	
		
		private class  TreeViewerLableProvider extends LabelProvider{
			@Override
			public String getText(Object element) {
				// TODO Auto-generated method stub
				if(element instanceof ProductBundle) 				
					return ((ProductBundle) element).getName();
				else if(element instanceof Product)
					return ((Product) element).getName()+", "+((Product) element).getCode();
				return null;
			}
			@Override
			public Image getImage(Object element) {
				//Get the bundle plugin that has the icon
				Bundle bundle = FrameworkUtil.getBundle(MyTreeViewer.class);
				
				//Get the path of image 
				URL imagePath = FileLocator.find(bundle,new Path("icons/tree.png")); 
				
				//Get the resource manager
				ResourceManager resourceManager = new LocalResourceManager(JFaceResources.getResources());						
				
				return resourceManager.createImage(ImageDescriptor.createFromURL(imagePath));
						
			
			}
		}
	@Override
	public void createPartControl(Composite parent) {
		// TODO Auto-generated method stub
		TreeViewer treeView = new TreeViewer(parent);
		treeView.setContentProvider(new TreeViewerContentProvider());
		treeView.setLabelProvider(new TreeViewerLableProvider());
		treeView.setInput(new ProductBundle("My Products"));

	}

	@Override
	public void setFocus() {
		// TODO Auto-generated method stub

	}

}
