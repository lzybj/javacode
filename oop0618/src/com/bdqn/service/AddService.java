package com.bdqn.service;

public class AddService {
	public int add(int a,int b){
		return a+b;
	}
	public int add(int a,String b){
		return a + Integer.parseInt(b);
	}
	public String add(String a,int b){
		return a + String.valueOf(b);
	}
	public String add(String a,String b){
		return a + b;
	}
}
