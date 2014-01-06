package com.bdqn.domain;

import com.bdqn.inf.IPlayAble;
import com.bdqn.inf.IRun;

public class Cat extends DongWu implements IPlayAble,IRun{
	private int tui = 0;
	

	public int getTui() {
		return tui;
	}


	public void setTui(int tui) {
		this.tui = tui;
	}


	public Cat(String dName, String dSex, int tui) {
		super(dName, dSex);
		this.tui = tui;
	}


	@Override
	public void jiao() {
		// TODO Auto-generated method stub
		System.out.println("ß÷ß÷....");
	}
	
	public void play(){
		System.out.println("×¥ºÄ×Ó£¡");
	}


	@Override
	public int getTuiNum() {
		// TODO Auto-generated method stub
		return this.getTui();
	}
	
}
