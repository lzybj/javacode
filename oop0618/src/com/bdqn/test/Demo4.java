package com.bdqn.test;

import com.bdqn.domain.Product;

public class Demo4 {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Product myPro = new Product();
		myPro.count = myPro.count - 1;
		myPro.sum = myPro.sum - 1;
		System.out.println(myPro.count);
		System.out.println(myPro.sum);
		Product myPro2 = new Product();
		myPro2.count = myPro2.count - 1;
		myPro2.sum = myPro2.sum - 1;
		System.out.println(myPro2.count);
		System.out.println(myPro2.sum);
		
	}

}
