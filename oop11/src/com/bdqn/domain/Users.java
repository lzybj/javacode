package com.bdqn.domain;

public class Users {
	private int uid = 0;
	private String uName = "";
	private String uPwd = "";
	private int uState = 0;
	public int getUid() {
		return uid;
	}
	public void setUid(int uid) {
		this.uid = uid;
	}
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
	public int getuState() {
		return uState;
	}
	public void setuState(int uState) {
		this.uState = uState;
	}
	public Users(int uid, String uName, String uPwd, int uState) {
		super();
		this.uid = uid;
		this.uName = uName;
		this.uPwd = uPwd;
		this.uState = uState;
	}
	public Users(String uName, String uPwd, int uState) {
		super();
		this.uName = uName;
		this.uPwd = uPwd;
		this.uState = uState;
	}
	
}
