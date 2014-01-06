package com.bdqn.factory;

import com.bdqn.domain.CaiWu;
import com.bdqn.domain.Emp;
import com.bdqn.domain.PM;
import com.bdqn.domain.SE;
import com.bdqn.myconst.EmpType;

public class EmpFactory {
   
	public static Emp getInstance(int empType){
		Emp emp = null;
		switch (empType) {
		case EmpType.EMP_SE:
			emp = new SE();
			break;
		case EmpType.EMP_PM:
			emp = new PM();
			break;
		case EmpType.EMP_CW:
			emp = new CaiWu();
			break;
		default:
			break;
		}
		return emp;
	}
}
