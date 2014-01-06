package com.bdqn.domain;

public class Product {
	private int productID = 0;
	private String productName = "";
	private float unitPrice = 0f;
	public static int count = 10;
	public int sum = 10;
	
	public int getProductID() {
		return productID;
	}
	public void setProductID(int productID) {
		this.productID = productID;
	}
	public String getProductName() {
		return productName;
	}
	public void setProductName(String productName) {
		this.productName = productName;
	}
	public float getUnitPrice() {
		return unitPrice;
	}
	public void setUnitPrice(float unitPrice) {
		this.unitPrice = unitPrice;
	}
	public Product(int productID, String productName, float unitPrice) {
		super();
		this.productID = productID;
		this.productName = productName;
		this.unitPrice = unitPrice;
	}
	@Override
	public boolean equals(Object obj) {
		// TODO Auto-generated method stub
		if(obj instanceof Product){
			Product myPro2 = (Product)obj;
			if(this.productName.equals(myPro2.getProductName())){
				return true;
			}
		}
		return false;
	}
	public Product(){
		
	}
}
