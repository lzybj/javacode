package com.bdqn.test;

import java.util.List;
import java.util.Scanner;

import com.bdqn.domain.Emp;
import com.bdqn.service.EmpServcie;

public class Demo {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.out.println("请输入要查看你的页码：");
		Scanner input = new Scanner(System.in);
		int nowPage = input.nextInt();
		EmpServcie es = new EmpServcie();
		int pageCount = es.getPageTotal();//获得最大页数
		if(nowPage > pageCount){
			System.out.println("您输入的页码过大，本次共计" + pageCount + "页，下面给您显示最后一页数据：");
			nowPage = pageCount;
		}
		if(nowPage <= 0){
			System.out.println("您输入的页码为负数，现给您显示第一页！");
			nowPage = 1;
		}
		List<Emp> data = es.fenYe(nowPage);
		for (Emp emp : data) {
			System.out.println(emp.getEmpNo() + " , " + emp.geteName());
		}
	}

}
