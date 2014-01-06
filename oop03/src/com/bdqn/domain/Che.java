package com.bdqn.domain;

public abstract class Che {
	private String brand = "";
	private String cheCode = "";
	public String getBrand() {
		return brand;
	}
	public void setBrand(String brand) {
		this.brand = brand;
	}
	public String getCheCode() {
		return cheCode;
	}
	public void setCheCode(String cheCode) {
		this.cheCode = cheCode;
	}
	public Che(String brand, String cheCode) {
		super();
		this.brand = brand;
		this.cheCode = cheCode;
	}
	
	public abstract int culPrice(int day);
	
	
}
