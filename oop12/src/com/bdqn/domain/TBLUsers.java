package com.bdqn.domain;

public class TBLUsers {
	private String uName = "";
	private String uPwd = "";
	public String getuName() {
		return uName;
	}
	public void setuName(String uName) {
		this.uName = uName;
	}
	public String getuPwd() {
		return uPwd;
	}
	public void setuPwd(String uPwd) {
		this.uPwd = uPwd;
	}
	public TBLUsers(String uName, String uPwd) {
		super();
		this.uName = uName;
		this.uPwd = uPwd;
	}
}
