package com.bdqn.domain;

public class Teacher extends Employee {
	public void work(){
		System.out.println("讲课");
	}
	public void chaKanZuoYe(){
		System.out.println("查看作业");
	}
	public Teacher() {
		// TODO Auto-generated constructor stub
		System.out.println("这是教师类构造方法！");
	}
}
