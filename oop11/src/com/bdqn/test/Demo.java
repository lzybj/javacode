package com.bdqn.test;

import java.util.Scanner;

import com.bdqn.domain.Users;
import com.bdqn.service.UsersServcie;

public class Demo {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.out.println("欢迎登录北大青鸟学员管理系统");
		Scanner input = new Scanner(System.in);
		System.out.println("请输入用户名和密码，用逗号分隔:");
		//老郑,qaz123
		String userInfo = input.next();
		String[] userArr = userInfo.split(",");
		//调用业务逻辑类和方法
		UsersServcie us = new UsersServcie();
		Users myUser = us.isLogin(userArr[0],userArr[1]);
		if(myUser != null){
			System.out.println("欢迎您：" + userArr[0] + "，您当前的客户状态为：" + myUser.getuState());
		}else{
			System.out.println("对不起，失败了！");
		}
	}

}
