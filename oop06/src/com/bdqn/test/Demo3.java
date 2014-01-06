package com.bdqn.test;

import java.util.ArrayList;
import java.util.List;

import com.bdqn.domain.Cat;
import com.bdqn.domain.Dog;
import com.bdqn.domain.DongWu;
import com.bdqn.domain.HaiTun;
import com.bdqn.domain.Hospital;

public class Demo3 {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		DongWu cat = new Cat("加菲猫","雄性",4);
		DongWu dog = new Dog("史努比","雄性",4);
		DongWu haitun = new HaiTun("豚豚","雄性");
		List<DongWu> dongwus = new ArrayList<DongWu>();
		dongwus.add(cat);
		dongwus.add(dog);
		dongwus.add(haitun);
		Hospital hp = new Hospital();
		hp.aiZhou(dongwus);
		hp.liu(dongwus);
		hp.xieTui(dongwus);
		
	}

}
