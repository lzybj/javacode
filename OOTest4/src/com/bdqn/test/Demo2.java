package com.bdqn.test;

import com.bdqn.domain.Cat;
import com.bdqn.domain.Dog;
import com.bdqn.service.DongWuService;

public class Demo2 {
	public static void main(String[] args) {
		Dog myDog = new Dog();
		myDog.setName("±¦±¦");
		Cat myCat = new Cat();
		myCat.setName("¿î¿î");
		DongWuService dws = new DongWuService();
		dws.aiZhou(myDog);
		dws.aiZhou(myCat);
	}
}
