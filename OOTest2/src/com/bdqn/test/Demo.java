package com.bdqn.test;

import java.text.SimpleDateFormat;
import java.util.Date;

public class Demo {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub
//		Teacher2 myTeacher = new Teacher2("¿œ÷£","KKKKKKKK");
//		myTeacher.test();
//		System.out.println(myTeacher.getName());
		Date now = new Date();
		System.out.println(now.toLocaleString());
		SimpleDateFormat sdf = new SimpleDateFormat("yyyy-MM-dd HH:mm:ss");
		System.out.println(sdf.format(now));
		System.out.println(System.currentTimeMillis());
	}

}
