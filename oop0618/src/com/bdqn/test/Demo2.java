package com.bdqn.test;

import com.bdqn.domain.Student;
import com.bdqn.domain.Teacher;

public class Demo2 {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Student myStu = new Student();
		myStu.setPname("ÔøºÆ");
		myStu.setSex("ÄÐ");
		myStu.setStuno("1002");
		myStu.talk();
		myStu.jiaozuoye();
		myStu.xuexi();
		Teacher myTeacher = new Teacher();
		myTeacher.talk();
		myTeacher.work();
		myTeacher.daka();
		myTeacher.chaKanZuoYe();
		
	}

}
