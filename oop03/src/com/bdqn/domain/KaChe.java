package com.bdqn.domain;

public class KaChe extends Che{
	private int dun = 0;
	
	
	public KaChe(String brand, String cheCode, int dun) {
		super(brand, cheCode);
		this.dun = dun;
	}

	public int getDun() {
		return dun;
	}

	public void setDun(int dun) {
		this.dun = dun;
	}

	@Override
	public int culPrice(int day) {
		// TODO Auto-generated method stub
		return this.dun * 50 * day;
	}
}
