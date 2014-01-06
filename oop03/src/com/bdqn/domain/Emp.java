package com.bdqn.domain;

public abstract class Emp {
	private String empCode = "";
	private String empName = "";
	private int baseMoney = 0;
	public String getEmpCode() {
		return empCode;
	}
	public void setEmpCode(String empCode) {
		this.empCode = empCode;
	}
	public String getEmpName() {
		return empName;
	}
	public void setEmpName(String empName) {
		this.empName = empName;
	}
	public int getBaseMoney() {
		return baseMoney;
	}
	public void setBaseMoney(int baseMoney) {
		this.baseMoney = baseMoney;
	}
	public Emp(String empCode, String empName, int baseMoney) {
		super();
		this.empCode = empCode;
		this.empName = empName;
		this.baseMoney = baseMoney;
	}
	public Emp() {
		super();
	}
	public final void daKai(){
		System.out.println("”√÷∏Œ∆¥Úø®£°");
	}
	
	public abstract void gongZi();
	
	
}
