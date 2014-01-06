package com.bdqn.test;

import com.bdqn.service.ExceptionService;

public class Demo {

	/**
	 * @param args
	 */
	public static void main(String[] args) throws Exception{
		// TODO Auto-generated method stub
		ExceptionService es = new ExceptionService();
		es.test();
		es.test(1);
		try {
			es.test("");
		} catch (Exception e) {
			// TODO: handle exception
			e.printStackTrace();
		}
		try {
			es.test2("sdfsd");
		} catch (ClassNotFoundException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} catch (Exception e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		es.test2("sdfsdfsdfsdfs");
	}

}
