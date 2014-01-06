package com.bdqn.domain;

public class CPerson extends Person {

	public CPerson(String pname) {
		super(pname);
		// TODO Auto-generated constructor stub
	}

	@Override
	public void talk() {
		// TODO Auto-generated method stub
		System.out.println("中国人说中国话！");
	}

	@Override
	public void eat() {
		// TODO Auto-generated method stub
		System.out.println("用筷子吃饭!");
	}
	
	
	
	

}
