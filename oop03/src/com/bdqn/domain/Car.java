package com.bdqn.domain;

public class Car extends Che{
	private String brandType = "";
	
	
	public String getBrandType() {
		return brandType;
	}


	public void setBrandType(String brandType) {
		this.brandType = brandType;
	}

	
	public Car(String brand, String cheCode, String brandType) {
		super(brand, cheCode);
		this.brandType = brandType;
	}


	@Override
	public int culPrice(int day) {
		// TODO Auto-generated method stub
		if(this.brandType.equals("550i")){
			return 500*day;
		}
		if(this.brandType.equals("GL8")){
			return 600*day;
		}
		return 300*day;
	}
}
