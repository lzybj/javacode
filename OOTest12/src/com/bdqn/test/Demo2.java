package com.bdqn.test;

import com.bdqn.inf.UsersService;
import com.bdqn.service.ExceptionService;
import com.bdqn.service.UsersServiceImp;

public class Demo2 {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		ExceptionService es = new ExceptionService();
		try {
			es.getCount();
		} catch (Exception e) {
			// TODO: handle exception
			e.printStackTrace();
		}
		UsersService us = new UsersServiceImp();
		try {
			us.login("", "");
		} catch (Exception e) {
			// TODO: handle exception
			e.printStackTrace();
		}
	}

}
