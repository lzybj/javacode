package com.bdqn.domain;

public class Emp {
	private String empNo = "";
	private String eName = "";
	public String getEmpNo() {
		return empNo;
	}
	public void setEmpNo(String empNo) {
		this.empNo = empNo;
	}
	public String geteName() {
		return eName;
	}
	public void seteName(String eName) {
		this.eName = eName;
	}
	public Emp(String empNo, String eName) {
		super();
		this.empNo = empNo;
		this.eName = eName;
	}
	
}
