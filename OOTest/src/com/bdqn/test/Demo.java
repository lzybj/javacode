package com.bdqn.test;

import com.bdqn.domain.Emp;
import com.bdqn.domain.JYLog;

public class Demo {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		//Emp myEmp = new Emp("JN030005", "zb0531", "¿œ÷£", "qaz123",1,18);
		//Emp myEmp = new Emp("zb0531", "¿œ÷£", "qaz123", 1, 25);
		//System.out.println(myEmp.getEmpCode());
		JYLog myLog = new JYLog("6225 1213 2342 5675", 0, 12.3f);
		System.out.println(myLog.getJyCode());
		System.out.println(myLog.getCardId());
		System.out.println(myLog.getJyName());
		System.out.println(myLog.getJyMoney());
		System.out.println(myLog.getJyDateTime());
	}

}
