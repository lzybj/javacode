package com.bdqn.domain;

import java.util.ArrayList;

public class CaiWu extends Emp {
	@Override
	public void gongZi() {
		// TODO Auto-generated method stub
		System.out.println("财务的工资为" + this.getBaseMoney());
	}
	
	public void FaGZ(Emp emp){
		emp.gongZi();
	}
	
	public void FaGZ(ArrayList<Emp> emps){
		for (Emp emp : emps) {
			emp.gongZi();
		}
	}
	
}
