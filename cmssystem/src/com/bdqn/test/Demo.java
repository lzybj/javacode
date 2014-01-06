package com.bdqn.test;

import java.util.ArrayList;
import java.util.List;

import com.bdqn.util.CreateHtmlUtil;

public class Demo {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		List<String> data = new ArrayList<String>();
		CreateHtmlUtil cu = new CreateHtmlUtil();
		cu.ttt(data);
		System.out.println(data.size());
	}

}
