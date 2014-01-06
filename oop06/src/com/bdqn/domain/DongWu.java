package com.bdqn.domain;

public abstract class DongWu {
	private String dName = "";
	private String dSex = "";
	public String getdName() {
		return dName;
	}
	public void setdName(String dName) {
		this.dName = dName;
	}
	public String getdSex() {
		return dSex;
	}
	public void setdSex(String dSex) {
		this.dSex = dSex;
	}
	public DongWu(String dName, String dSex) {
		super();
		this.dName = dName;
		this.dSex = dSex;
	}
	
	public abstract void jiao();
	
}
