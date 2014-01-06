package com.bdqn.domain;

public class JPerson extends Person {

	public JPerson(String pname) {
		super(pname);
		// TODO Auto-generated constructor stub
	}

	@Override
	public void talk() {
		// TODO Auto-generated method stub
		System.out.println("日本说日本话！");
	}

	@Override
	public void eat() {
		// TODO Auto-generated method stub
		System.out.println("用脚吃！");
	}

}
