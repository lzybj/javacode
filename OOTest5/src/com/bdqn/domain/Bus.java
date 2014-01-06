package com.bdqn.domain;

public class Bus extends QiChe {
	private int seatCount = 0;
	
	public Bus(int bands, String cheCode, int seatCount) {
		super(bands, cheCode);
		this.seatCount = seatCount;
	}

	public int getSeatCount() {
		return seatCount;
	}

	public void setSeatCount(int seatCount) {
		this.seatCount = seatCount;
	}

//	@Override
//	public int zhuCheFeiYong(int parDay) {
//		// TODO Auto-generated method stub
//		if(this.getSeatCount() <= CheType.JINBEI_16){
//			return 800*parDay;
//		}else{
//			return 1500*parDay;
//		}
//	}

}
