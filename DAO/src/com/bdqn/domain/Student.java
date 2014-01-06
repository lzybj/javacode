package com.bdqn.domain;

public class Student {
	private int stuid = 0;
	private String stuNo = "";
	private String stuName = "";
	private String stuPwd = "";
	private int stuAge = 0;
	private int stuSexInt = 0;//插入数据
	private String stuSexStr = "";//查询数据
	private String regtime = "";
	public int getStuid() {
		return stuid;
	}
	public void setStuid(int stuid) {
		this.stuid = stuid;
	}
	public String getStuNo() {
		return stuNo;
	}
	public void setStuNo(String stuNo) {
		this.stuNo = stuNo;
	}
	public String getStuName() {
		return stuName;
	}
	public void setStuName(String stuName) {
		this.stuName = stuName;
	}
	public String getStuPwd() {
		return stuPwd;
	}
	public void setStuPwd(String stuPwd) {
		this.stuPwd = stuPwd;
	}
	public int getStuAge() {
		return stuAge;
	}
	public void setStuAge(int stuAge) {
		this.stuAge = stuAge;
	}
	public int getStuSexInt() {
		return stuSexInt;
	}
	public void setStuSexInt(int stuSexInt) {
		this.stuSexInt = stuSexInt;
	}
	public String getStuSexStr() {
		return stuSexStr;
	}
	public void setStuSexStr(String stuSexStr) {
		this.stuSexStr = stuSexStr;
	}
	public String getRegtime() {
		return regtime;
	}
	public void setRegtime(String regtime) {
		this.regtime = regtime;
	}
	//插入时所用构造方法
	public Student(String stuNo, String stuName, String stuPwd, int stuAge,
			int stuSexInt) {
		super();
		this.stuNo = stuNo;
		this.stuName = stuName;
		this.stuPwd = stuPwd;
		this.stuAge = stuAge;
		this.stuSexInt = stuSexInt;
	}
	public Student(int stuid, String stuNo, String stuName, String stuPwd,
			int stuAge, String stuSexStr, String regtime) {
		super();
		this.stuid = stuid;
		this.stuNo = stuNo;
		this.stuName = stuName;
		this.stuPwd = stuPwd;
		this.stuAge = stuAge;
		this.stuSexStr = stuSexStr;
		this.regtime = regtime;
	}
}
