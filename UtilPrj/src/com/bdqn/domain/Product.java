package com.bdqn.domain;

public class Product {
	private int prodouctID = 0;
	private String productName = "";
	public int getProdouctID() {
		return prodouctID;
	}
	public void setProdouctID(int prodouctID) {
		this.prodouctID = prodouctID;
	}
	public String getProductName() {
		return productName;
	}
	public void setProductName(String productName) {
		this.productName = productName;
	}
	public Product(int prodouctID, String productName) {
		super();
		this.prodouctID = prodouctID;
		this.productName = productName;
	}
	@Override
	public boolean equals(Object obj) {
		if(obj instanceof Product){
			Product obj2 = (Product)obj;
			if(this.getProdouctID() == obj2.getProdouctID()){
				return true;
			}
		}
		return false;
	}
}
