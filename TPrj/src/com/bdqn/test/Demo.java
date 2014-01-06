package com.bdqn.test;

import java.util.ArrayList;
import java.util.List;

import com.bdqn.domain.Cat;
import com.bdqn.domain.Dog;
import com.bdqn.inf.DongWu;
import com.bdqn.service.CWShop;

public class Demo {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		DongWu cat = new Cat();
		DongWu dog = new Dog();
		List<DongWu> dongwus = new ArrayList<DongWu>();
		dongwus.add(cat);
		dongwus.add(dog);
		CWShop csh = new CWShop();
//		csh.aiZhou(cat);
//		csh.aiZhou(dog);
		csh.aiZhou(dongwus);
	}

}
