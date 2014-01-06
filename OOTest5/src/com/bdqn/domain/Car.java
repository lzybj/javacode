package com.bdqn.domain;

public class Car extends QiChe {
	private int carType = 0;//³µÐÍºÅ
	public int getCarType() {
		return carType;
	}
	public void setCarType(int carType) {
		this.carType = carType;
	}
//	@Override
//	public int zhuCheFeiYong(int parDay) {
//		// TODO Auto-generated method stub
//		if(this.getCarType()==CheType.BMW_550I){
//			return 500*parDay;
//		}else if(this.getCarType()==CheType.BIEKE_GL8){
//			return 600*parDay;
//		}else{
//			return 300*parDay;
//		}
//	}
	public Car(int parBands,String parCheCode,int carType) {
		super(parBands,parCheCode);
		this.carType = carType;
	}
}
