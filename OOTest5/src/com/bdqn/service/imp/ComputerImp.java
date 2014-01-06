package com.bdqn.service.imp;

import com.bdqn.service.inf.Computer;

public class ComputerImp implements Computer {
	private ComputerImp(){
	}
	public static Computer getInstance(){
		return new ComputerImp();
	}
	@Override
	public void cunchu() {
		// TODO Auto-generated method stub
		System.out.println("这是计算机基本的存储!");
	}

	@Override
	public void view() {
		// TODO Auto-generated method stub
		System.out.println("这是计算机基本显示!");
	}

	@Override
	public void input() {
		// TODO Auto-generated method stub
		System.out.println("这是计算机基本输入！");
	}

}
