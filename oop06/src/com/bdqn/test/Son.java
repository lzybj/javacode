package com.bdqn.test;

public class Son extends Father{
	@Override
	public void speak() {
		System.out.println("儿子不会说话！");
	}
	
	public void speak(String str){
		System.out.println("儿子会第二种方式说话" + str);
	}
}
