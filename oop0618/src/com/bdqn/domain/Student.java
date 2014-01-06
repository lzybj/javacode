package com.bdqn.domain;

public class Student extends Person{
	private String stuno = "";
	
	
	public String getStuno() {
		return stuno;
	}
	public void setStuno(String stuno) {
		this.stuno = stuno;
	}
	public void xuexi(){
		System.out.println("学习");
	}
	public void jiaozuoye(){
		System.out.println("交作业");
	}
	
	public Student(){
		System.out.println("这是子类构造方法！");
	}
	public Student(String stuno) {
		super();
		this.stuno = stuno;
	}
	public Student(String pname, String sex, String stuno) {
		super(pname, sex);
		this.stuno = stuno;
	}
	
	
	
	
}
