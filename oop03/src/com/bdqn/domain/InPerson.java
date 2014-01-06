package com.bdqn.domain;

public class InPerson extends Person {

	public InPerson(String pname) {
		super(pname);
		// TODO Auto-generated constructor stub
	}

	@Override
	public void talk() {
		// TODO Auto-generated method stub
		System.out.println("印度英语！");
	}

	@Override
	public void eat() {
		// TODO Auto-generated method stub
		System.out.println("用手抓！");
	}

}
