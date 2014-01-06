package com.bdqn.test;

import com.bdqn.domain.Student;
import com.bdqn.domain.Teacher;
import com.bdqn.domain.Users;

public class Demo2 {
	public static void main(String[] args) {
		Teacher myTeacher = new Teacher("老郑","qaz123","男","学术部","JN030004");
//		myTeacher.setUserName("老郑");
//		myTeacher.setPassWord("qaz123");
//		myTeacher.setBumen("学术部");
//		myTeacher.setTeacherCode("JN030004");
		System.out.println(myTeacher.getSex());
		myTeacher.work();
		myTeacher.eat();
		myTeacher.jineng();
		myTeacher.ks();
		System.out.println("--------------------------");
		Student myStu = new Student();
		myStu.setUserName("李岩");
		myStu.setPassWord("123456");
		myStu.setBanji("ST02");
		myStu.setStuCode("ST020001");
		myStu.work();
		myStu.eat();
		myStu.jf();
		myStu.naoshi();
		//Users myUser = new Users();
	}
}
