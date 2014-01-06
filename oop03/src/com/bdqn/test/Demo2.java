package com.bdqn.test;

import java.util.ArrayList;

import com.bdqn.domain.CPerson;
import com.bdqn.domain.FanJun;
import com.bdqn.domain.InPerson;
import com.bdqn.domain.JPerson;
import com.bdqn.domain.Person;

public class Demo2 {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Person p = new CPerson("老王");
		Person p2 = new JPerson("山精");
		Person p3 = new InPerson("阿三");
		
		ArrayList<Person> data = new ArrayList<Person>();
		data.add(p);
		data.add(p2);
		data.add(p3);
		FanJun fj = new FanJun();
		fj.jiaoLiu(data);
		fj.kaiChi(data);
//		fj.jiaoLiu(p2);
//		fj.kaiChi(p2);
		
	}

}
