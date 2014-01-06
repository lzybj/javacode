package com.bdqn.test;

import java.util.List;

/**
 * 方法重装
 * @author hidba
 *
 */
public class Test {
	public static int count = 10;
	public int sum = 20;
	public static void func(int i){
		System.out.println(i);
	}
	public void func(String str){
		System.out.println(str);
	}
	public void func(int a,int b){
		System.out.println(a+b);
	}
	public void func(double a){
		
	}
	public String func(List<String> li){
		return "";
	}
	
	public void func(Father fa){
		fa.speak();
	}
	
	public void func(Father fa,String str){
		if(fa instanceof Son){
			((Son)fa).speak(str);
		}else{
			System.out.println("对不起，你传的不是Son类型");
		}
	}
}
