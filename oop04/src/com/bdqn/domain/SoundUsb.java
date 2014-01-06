package com.bdqn.domain;

import com.bdqn.inf.IUsb;

public class SoundUsb implements IUsb {

	@Override
	public void inputData() {
		// TODO Auto-generated method stub
		System.out.println("通过输入音频码！");
	}

	@Override
	public void outputData() {
		// TODO Auto-generated method stub
		System.out.println("输出解码后的声音！");
	}

}
