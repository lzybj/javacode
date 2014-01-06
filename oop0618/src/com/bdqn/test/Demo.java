package com.bdqn.test;

import com.bdqn.service.AddService;

public class Demo {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		AddService as = new AddService();
		System.out.println(as.add(12, 13));
		System.out.println(as.add(12,"13"));
		System.out.println(as.add("12",13));
	}

}
