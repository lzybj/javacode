package com.bdqn.domain;

public class Product {
	private int productID = 0;
	private String productName = "";
	private int productNum = 0;
	//产品成本价
	private float jhPrice = 0f;
	private float unitPrice = 0f;
	
	public Product() {
		super();
	}
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
	public int getProductNum() {
		return productNum;
	}
	public void setProductNum(int productNum) {
		this.productNum = productNum;
	}
	public float getJhPrice() {
		return jhPrice;
	}
	public void setJhPrice(float jhPrice) {
		this.jhPrice = jhPrice;
	}
	public float getUnitPrice() {
		return unitPrice;
	}
	public void setUnitPrice(float unitPrice) {
		this.unitPrice = unitPrice;
	}
	public Product(int productID, String productName, int productNum,
			float jhPrice, float unitPrice) {
		super();
		this.productID = productID;
		this.productName = productName;
		this.productNum = productNum;
		this.jhPrice = jhPrice;
		this.unitPrice = unitPrice;
	}
}
