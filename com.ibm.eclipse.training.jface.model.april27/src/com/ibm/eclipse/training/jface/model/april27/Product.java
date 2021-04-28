package com.ibm.eclipse.training.jface.model.april27;

public class Product {
	private String name;
	private int code;
	public Product(String name,int code) {
		// TODO Auto-generated constructor stub
		this.code=code;
		this.name=name;
	}
	
public int getCode() {
	return code;
}
public String getName() {
	return name;
}

}
