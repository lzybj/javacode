package com.bdqn.domain;

import com.bdqn.inf.Terrestrial;

public class Cat extends Animal implements Terrestrial{
	private int legnum = 0;
	public Cat(String name, int legnum) {
		super(name);
		this.legnum = legnum;
		// TODO Auto-generated constructor stub
	}

	@Override
	public void shout() {
		// TODO Auto-generated method stub
		System.out.println("ß÷ß÷¡£¡£¡£¡£");
	}

	@Override
	public int getLegnum() {
		// TODO Auto-generated method stub
		return this.legnum;
	}

}
