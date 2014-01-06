package com.bdqn.domain;

import com.bdqn.inf.SE;
import com.bdqn.inf.ShiChang;

public class ADSE implements SE,ShiChang{
	@Override
	public void speakYW() {
		// TODO Auto-generated method stub
		System.out.println("具备将业务的能力！");
	}
	@Override
	public void writerCoding() {
		// TODO Auto-generated method stub
		System.out.println("写代码！");
	}
}
