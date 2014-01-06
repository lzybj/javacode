package com.bdqn.domain;

public class Dog extends DongWu{
	private float price = 0f;

	public float getPrice() {
		return price;
	}

	public void setPrice(float price) {
		this.price = price;
	}
	public void jiao(){
		System.out.println("汪汪！");
	}
	public Dog(){
		
	}
	public Dog(int parPrice) {
		super(19);
		System.out.println("狗生出来了！打印一下！");
	}
}
