package com.bdqn.domain;

public abstract class Person {
	private String pname = "";

	public String getPname() {
		return pname;
	}

	public void setPname(String pname) {
		this.pname = pname;
	}

	public Person(String pname) {
		super();
		this.pname = pname;
	}
	
	public abstract void talk();
	
	public abstract void eat();
	
}
