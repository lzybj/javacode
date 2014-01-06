package com.bdqn.domain;

public class Student {
	private String studentNo = "";
	private String studentName = "";
	private String sex = "";
	private String bornday = "";
	public String getStudentNo() {
		return studentNo;
	}
	public void setStudentNo(String studentNo) {
		this.studentNo = studentNo;
	}
	public String getStudentName() {
		return studentName;
	}
	public void setStudentName(String studentName) {
		this.studentName = studentName;
	}
	public String getSex() {
		return sex;
	}
	public void setSex(String sex) {
		this.sex = sex;
	}
	public String getBornday() {
		return bornday;
	}
	public void setBornday(String bornday) {
		this.bornday = bornday;
	}
	public Student(String studentNo, String studentName, String sex,
			String bornday) {
		super();
		this.studentNo = studentNo;
		this.studentName = studentName;
		this.sex = sex;
		this.bornday = bornday;
	}
	
}
