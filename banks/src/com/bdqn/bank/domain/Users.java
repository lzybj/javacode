package com.bdqn.bank.domain;

/**
 * 用户实体
 * @author hidba
 *
 */
public class Users {
	private int uid = 0;
	private String userName = "";
	private String passWord = "";
	private String ctime = "";
	public int getUid() {
		return uid;
	}
	public void setUid(int uid) {
		this.uid = uid;
	}
	public String getUserName() {
		return userName;
	}
	public void setUserName(String userName) {
		this.userName = userName;
	}
	public String getPassWord() {
		return passWord;
	}
	public void setPassWord(String passWord) {
		this.passWord = passWord;
	}
	public String getCtime() {
		return ctime;
	}
	public void setCtime(String ctime) {
		this.ctime = ctime;
	}
	public Users(int uid, String userName, String passWord, String ctime) {
		super();
		this.uid = uid;
		this.userName = userName;
		this.passWord = passWord;
		this.ctime = ctime;
	}
}
