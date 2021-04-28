package com.ibm.eclipse.training.jface.model.april27;

import java.util.ArrayList;
import java.util.List;

public class ProductFactory {
	
	public static final ProductFactory factory = new ProductFactory();
	
	public ProductFactory() {
		// TODO Auto-generated constructor stub
	}
	
	public List<Product> getProducts(){
		List<Product> products = new ArrayList<Product>();
		
		Product productA = new Product("ProductA",100);
		products.add(productA);
		
		Product productB = new Product("ProductB",200);
		products.add(productB);
		
		Product productC = new Product("ProductC",300);
		products.add(productC);
		
		Product productD = new Product("ProductD",400);
		products.add(productD);
		
		Product productE = new Product("ProductE",500);
		products.add(productE);
		
		return products;
		
		
	}
	

}
