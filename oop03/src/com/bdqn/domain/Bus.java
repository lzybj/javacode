package com.bdqn.domain;

public class Bus extends Che{
	private int seatNum = 0;

	public int getSeatNum() {
		return seatNum;
	}

	public void setSeatNum(int seatNum) {
		this.seatNum = seatNum;
	}

	public Bus(String brand, String cheCode, int seatNum) {
		super(brand, cheCode);
		this.seatNum = seatNum;
	}
	
	@Override
	public int culPrice(int day) {
		// TODO Auto-generated method stub
		if(this.seatNum <= 16){
			return 800*day;
		}
		return 1500*day;
	}
}
