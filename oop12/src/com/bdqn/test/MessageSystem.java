package com.bdqn.test;

import java.util.List;
import java.util.Scanner;

import com.bdqn.domain.TBLMessage;
import com.bdqn.domain.TBLUsers;
import com.bdqn.service.MessageService;
import com.bdqn.service.UsersService;

public class MessageSystem {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.out.println("欢迎进入短消息系统");
		Scanner input = new Scanner(System.in);
		System.out.println("请输入用户名：");
		String uname = input.next();
		System.out.println("请输入密码：");
		String upwd = input.next();
		UsersService us = new UsersService();
		TBLUsers user = us.isLogin(uname, upwd);
		if(user != null){
			System.out.println("欢迎您:" + user.getuName());
			System.out.println("请选择功能：");
			System.out.println("1.发消息");
			System.out.println("2.查看消息");
			int mysel = input.nextInt();
			if(mysel == 1){
				System.out.println("请输入消息：");
				String messagecontent = input.next();
				TBLMessage message = new TBLMessage(user.getuName(), messagecontent);
				MessageService ms = new MessageService();
				boolean isOK = ms.addMessage(user, message);
				if(isOK){
					System.out.println("发送成功@");
				}else{
					System.out.println("发送失败！");
				}
			}else{
				System.out.println("请输入用户名：");
				String unamex = input.next();
				MessageService ms = new MessageService();
				List<TBLMessage> data = ms.findByUName(unamex);
				for (TBLMessage tblMessage : data) {
					System.out.println(tblMessage.getMid() + "  " + tblMessage.getuName() + "   " + tblMessage.getMessageContent() + "  " + tblMessage.getPostTime());
				}
			}
		}else{
			System.out.println("对不起，密码错误！");
		}
		
		
	}

}
