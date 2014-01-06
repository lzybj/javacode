package com.bdqn.domain;

public class PM extends Emp {
	private int projectMoney = 0;
	
	
	
	public int getProjectMoney() {
		return projectMoney;
	}



	public void setProjectMoney(int projectMoney) {
		this.projectMoney = projectMoney;
	}



	public PM(String empCode, String empName, int baseMoney, int projectMoney) {
		super(empCode, empName, baseMoney);
		this.projectMoney = projectMoney;
	}


	public PM() {
		super();
	}



	@Override
	public void gongZi() {
		// TODO Auto-generated method stub
		System.out.println("项目经理工资为：" + (this.getBaseMoney() + this.projectMoney));
	}

}
