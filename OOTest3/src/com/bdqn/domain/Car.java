package com.bdqn.domain;

public class Car extends MotoChe {
	private String xingHao = "";
	private int day = 0;
	public int getDay() {
		return day;
	}
	public void setDay(int day) {
		this.day = day;
	}
	@Override
	public float total(int day) {
		// TODO Auto-generated method stub
		return this.xingHaoJiage(this.getXingHao()) * day;
	}
	public String getXingHao() {
		return xingHao;
	}
	public void setXingHao(String xingHao) {
		this.xingHao = xingHao;
	}
	public Car(String xingHao) {
		super();
		this.xingHao = xingHao;
	}
	private float xingHaoJiage(String parXingHao){
		if(parXingHao.equals("别克商务舱GL8")){
			return 600f;
		}else if(parXingHao.equals("宝马i550")){
			return 500f;
		}else{
			return 300f;
		}
	}
}
