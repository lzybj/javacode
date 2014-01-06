package com.bdqn.service;

import java.sql.SQLException;

public class ExceptionService {
	public void test(){
		try {
			System.out.println("测试！");
		} catch (Exception e) {
			// TODO: handle exception
			e.printStackTrace();
		}
	}
	/**
	 * 在方法体内，处理异常
	 * @param par
	 */
	public void test(int par){
		try {
			System.out.println(10/par);
		} catch (Exception e) {
			// TODO: handle exception
			e.printStackTrace();
		}
	}
	public void test(String par) throws ClassNotFoundException{
		System.out.println(par.length());
	}
	public void test2(String par) throws ClassNotFoundException,Exception{
		System.out.println(par.length());
	}
	public int getCount() throws Exception{
//	    System.out.println("这是多上！！！");
//		System.out.println("sdfsdfsd");
		throw new Exception("对不起，此方法暂为完成!注意!!!");
	}
}
