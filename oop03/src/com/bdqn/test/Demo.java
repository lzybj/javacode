package com.bdqn.test;

import java.util.ArrayList;

import com.bdqn.domain.CaiWu;
import com.bdqn.domain.Emp;
import com.bdqn.domain.PM;
import com.bdqn.domain.SE;
import com.bdqn.factory.EmpFactory;
import com.bdqn.myconst.EmpType;

public class Demo {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Emp se = EmpFactory.getInstance(EmpType.EMP_SE);
		Emp pm = EmpFactory.getInstance(EmpType.EMP_PM);
		Emp cw = EmpFactory.getInstance(EmpType.EMP_CW);
		se.setEmpCode("1001");
		se.setEmpName("小王");
		se.setBaseMoney(2000);
		((SE)se).setJiaoXiaoMoney(3000);
		pm.setEmpCode("1002");
		pm.setEmpName("老李");
		pm.setBaseMoney(6000);
		((PM)pm).setProjectMoney(10000);
		ArrayList<Emp> emps = new ArrayList<Emp>();
		emps.add(se);
		emps.add(pm);
		((CaiWu)cw).FaGZ(emps);
	}

}
