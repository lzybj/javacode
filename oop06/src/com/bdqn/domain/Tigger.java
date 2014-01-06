package com.bdqn.domain;

import com.bdqn.inf.IPlayAble;
import com.bdqn.inf.IRun;

public class Tigger extends DongWu implements IPlayAble,IRun{
	public Tigger(String dName, String dSex) {
		super(dName, dSex);
		// TODO Auto-generated constructor stub
	}

	private int tui = 0;
	
	public int getTui() {
		return tui;
	}

	public void setTui(int tui) {
		this.tui = tui;
	}

	@Override
	public void jiao() {
		// TODO Auto-generated method stub
		System.out.println("à»à»¡£¡£¡£¡£");
	}
	
	public void play(){
		System.out.println("³öÈ¥á÷ÁÔ£¡");
	}

	@Override
	public int getTuiNum() {
		// TODO Auto-generated method stub
		return this.getTui();
	}
}
