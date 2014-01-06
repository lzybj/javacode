package com.bdqn.domain;

public abstract class Employee extends Person {
	private String empCode = "";

	public String getEmpCode() {
		return empCode;
	}

	public void setEmpCode(String empCode) {
		this.empCode = empCode;
	}
	
	public final void daka(){
		System.out.println("打卡！");
	}
	public abstract void work();
	
	public Employee(){
		System.out.println("这是员工的构造方法@");
	}
}
