package com.bdqn.domain;

public class DongWu {
	private String name = "";
	private int love = 0;
	private int JKValue = 0;
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public int getLove() {
		return love;
	}
	public void setLove(int love) {
		this.love = love;
	}
	public int getJKValue() {
		return JKValue;
	}
	public void setJKValue(int jKValue) {
		JKValue = jKValue;
	}
	public DongWu() {
		System.out.println("动物的构造方法,父类打印");
	}
	public DongWu(int parLove){
		
	}
	public void jiao(){
		System.out.println("动物叫！！！");
	}
}
