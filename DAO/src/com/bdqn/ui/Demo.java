package com.bdqn.ui;

import java.util.Scanner;

import com.bdqn.domain.Student;
import com.bdqn.service.StudentService;

public class Demo {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.out.println("欢迎登录系统");
		System.out.println("请输入用户名和密码：");
		Scanner input = new Scanner(System.in);
		String[] mess = input.next().split(",");
		StudentService ss = new StudentService();
		Student myStu = ss.login(mess[0],mess[1]);
		if(myStu != null){
			System.out.println("登录成功！");
		}else{
			System.out.println("登录失败!");
		}
	}

}
