package com.bdqn.domain;

public class Product {
	private String productName = "";
	private float unitPrice = 0f;
	private int productNum = 0;
	private float productTotal = 0f;
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
	public int getProductNum() {
		return productNum;
	}
	public void setProductNum(int productNum) {
		this.productNum = productNum;
	}
	public float getProductTotal() {
		this.productTotal = this.unitPrice * this.productNum;
		return productTotal;
	}
	/**
	private void setProductTotal(float productTotal) {
		this.productTotal = productTotal;
	}
	**/
	/**
	public Product(String productName, float unitPrice, int productNum,
			float productTotal) {
		super();
		this.productName = productName;
		this.unitPrice = unitPrice;
		this.productNum = productNum;
		this.productTotal = productTotal;
	}
	**/
	public Product() {
		super();
	}
	public Product(String productName, float unitPrice, int productNum) {
		super();
		this.productName = productName;
		this.unitPrice = unitPrice;
		this.productNum = productNum;
	}
	
	
}
