package com.bdqn.domain;

import com.bdqn.inf.IUsb;

public class MouseUsb implements IUsb{
	public void click(){
		System.out.println("单击鼠标!");
	}
	
	@Override
	public void inputData() {
		// TODO Auto-generated method stub
		System.out.println("通过滑动向计算机输入物理位置!");
	}
	@Override
	public void outputData() {
		// TODO Auto-generated method stub
		System.out.println("输出显示器中的相对物理坐标！");
	}
}
