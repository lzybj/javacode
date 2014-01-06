package com.bdqn.domain;

public class Teacher extends Users{
	private String TeacherCode = "";
	private String bumen = "";
	public Teacher(String teacherCode, String bumen) {
		TeacherCode = teacherCode;
		this.bumen = bumen;
	}
	public Teacher(String parUserName,String parPassWord,String Sex,String TeacherCode,String parBumen){
	//	this(TeacherCode,parBumen);
		super(parUserName,parPassWord,Sex);
		this.TeacherCode = TeacherCode;
		this.bumen = parBumen;
	}
	public String getTeacherCode() {
		return TeacherCode;
	}
	public void setTeacherCode(String teacherCode) {
		TeacherCode = teacherCode;
	}
	public String getBumen() {
		return bumen;
	}
	public void setBumen(String bumen) {
		this.bumen = bumen;
	}
	public void ks(){
		System.out.println("上班给钱！");
	}
	public void jineng(){
		System.out.println("会计算机技能！");
	}
	@Override
	public void work() {
		//System.out.println("调用父类work方法");
		//super.work();
		System.out.println("打印重写work方法");
		System.out.println("老师要讲课!");
	}
}
