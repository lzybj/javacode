package com.bdqn.test;

import java.util.ArrayList;
import java.util.List;

public class Demo {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		//∂‡Ã¨–¥∑®1
		Father son = new Son();
//		son.speak();		
		List<String> data = new ArrayList<String>();
		Test t = new Test();
		t.func(son,"ssssss");
		t.func(new Father(),"tttt");
//		t.func(son);
//		t.func(new Father());
	}

}
