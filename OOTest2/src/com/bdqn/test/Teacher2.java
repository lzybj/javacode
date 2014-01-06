package com.bdqn.test;

public class Teacher2 {
	private String name = "";
	private String teacherCode = "";
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public String getTeacherCode() {
		return teacherCode;
	}
	public void setTeacherCode(String teacherCode) {
		this.teacherCode = teacherCode;
	}
	public Teacher2(String name, String teacherCode) {
		super();
		this.name = name;
		this.teacherCode = teacherCode;
	}
	public Teacher2(){
	}
	public void test(){
		//
		Student2 myStu = new Student2("S2T0002","LIYAN");
		//myStu.test2(this);
		myStu.test2(new Teacher2("¿œ¿Ó","KKKKKKKK"));
	}
	public void updateTeacherCode(String parCode){
		this.setTeacherCode(parCode);
		System.out.println(this.getTeacherCode());
	}
}
