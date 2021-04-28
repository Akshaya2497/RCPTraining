package com.ibm.eclipse.training.jface.model.april27;

import java.util.List;

public class ProductBundle {
	private final String name;
	
	public ProductBundle(String name) {
		// TODO Auto-generated constructor stub
		this.name=name;
	}
	public String getName() {
		return name;
	}
	public List<Product> getProdcts(){
		return ProductFactory.factory.getProducts();
		
	}
	
}
