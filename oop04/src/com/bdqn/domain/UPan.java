package com.bdqn.domain;

import com.bdqn.inf.IUsb;

public class UPan implements IUsb{
	public void chongDian(){
		System.out.println("扩展U盘充电的功能！");
	}
	
	@Override
	public void inputData() {
		// TODO Auto-generated method stub
		System.out.println("拷贝数据到计算机中!");
	}
	@Override
	public void outputData() {
		// TODO Auto-generated method stub
		System.out.println("拷贝数据到U盘中！");
	}
}
