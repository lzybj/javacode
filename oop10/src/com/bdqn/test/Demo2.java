package com.bdqn.test;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.Statement;
import java.util.List;
import java.util.Scanner;

import com.bdqn.domain.Users;
import com.bdqn.service.UsersService;

public class Demo2 {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner input = new Scanner(System.in);
		System.out.println("请输入用户名：");
		String uName = input.next();
		System.out.println("请输入密码：");
		String upwd = input.next();
		UsersService us = new UsersService();
		boolean isOk = us.register(uName,upwd);
		if(isOk){
			System.out.println("注册成功！");
			System.out.println("显示所有的用户");
			List<Users> data = us.findByAll();
			for (Users users : data) {
				System.out.println(users.getuName());
			}
		}else{
			System.out.println("注册失败！");
		}
	}

}
