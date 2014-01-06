package com.bdqn.domain;

/**
 * 这是一个员工的实体类
 * @author hidba
 *
 */
public class Emp {
	//员工的编号(部门代码+职务代码+四位序列数)
	private String empCode = "";
	//员工的用户名
	private String empName = "";
	//员工的真实名
	private String empTName = "";
	//员工密码
	private String empPwd = "";
	//员工性别(0：女;1:男)
	private int empSex = 0;
	//员工的年龄
	private int age = 0;
	public String getEmpCode() {
		return empCode;
	}
	private void setEmpCode(String empCode) {
		this.empCode = empCode;
	}
	public String getEmpName() {
		return empName;
	}
	public void setEmpName(String empName) {
		this.empName = empName;
	}
	public String getEmpTName() {
		return empTName;
	}
	public void setEmpTName(String empTName) {
		this.empTName = empTName;
	}
	public String getEmpPwd() {
		return empPwd;
	}
	public void setEmpPwd(String empPwd) {
		this.empPwd = empPwd;
	}
	public int getAge() {
		return age;
	}
	private void setAge(int age) {
		this.age = age;
	}
	public int getEmpSex() {
		return empSex;
	}
	/**
	 * 默认构造方法
	 */
	public Emp(){
	}
	/**
	 * 全参数构造方法
	 * @param empCode 员工code
	 * @param empName
	 * @param empTName
	 * @param empPwd
	 * @param empSex
	 * @param age
	 */
	private Emp(String empCode, String empName, String empTName, String empPwd,
			int empSex, int age) {
		super();
		this.empCode = empCode;
		this.empName = empName;
		this.empTName = empTName;
		this.empPwd = empPwd;
		this.empSex = empSex;
		this.age = age;
	}
//	private Emp(String empCode, String empName, String empTName, int empSex,
//			int age) {
//		super();
//		this.empCode = empCode;
//		this.empName = empName;
//		this.empTName = empTName;
//		this.empPwd = "888888";
//		this.empSex = empSex;
//		this.age = age;
//	}
	
	public Emp(String empName, String empTName, String empPwd, int empSex,
			int age) {
		super();
		this.setEmpCode(this.createEmpCode());
		this.empName = empName;
		this.empTName = empTName;
		this.empPwd = empPwd;
		this.empSex = empSex;
		this.age = age;
	}
	/**
	 * 生成员工编码
	 * @return
	 */
	private String createEmpCode(){
		String temp = "JN" + "03" + "0005";
		return temp;
	}
}
