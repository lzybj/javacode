package com.bdqn.test;

public class Student2 {
	private String stuCode = "";
	private String stuName = "";
	public String getStuCode() {
		return stuCode;
	}
	public void setStuCode(String stuCode) {
		this.stuCode = stuCode;
	}
	public String getStuName() {
		return stuName;
	}
	public void setStuName(String stuName) {
		this.stuName = stuName;
	}
	public Student2(String stuCode, String stuName) {
		super();
		this.stuCode = stuCode;
		this.stuName = stuName;
	}
	public Student2(){
	}
	public void test2(Teacher2 myTeacher){
		myTeacher.updateTeacherCode("FFFFFFFFFF");
	}
}
