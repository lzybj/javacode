package com.bdqn.test;

import com.bdqn.service.imp.ComputerImp;
import com.bdqn.service.inf.Computer;

public class Demo2 {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		//Computer myComputer = new ComputerImp();
		Computer myComputer = ComputerImp.getInstance();
		myComputer.cunchu();
		myComputer.view();
	}

}
