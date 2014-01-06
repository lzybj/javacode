package com.bdqn.domain;

public class ShouQiang extends WuQi {
	private ShouQiang(){
	}
	public static ShouQiang getShouQiang(){
		return new ShouQiang();
	}
	public static WuQi getWuQi(){
		return new ShouQiang();
	}
	@Override
	public void fire() {
		// TODO Auto-generated method stub
		System.out.println("用手枪开火！");
	}
	public void printx(){
		System.out.println("测试子类自有方法！");
	}
}
