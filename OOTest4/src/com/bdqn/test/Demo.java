package com.bdqn.test;

import com.bdqn.domain.CPerson;
import com.bdqn.domain.JPerson;
import com.bdqn.domain.YPerson;
import com.bdqn.service.FanJun;

public class Demo {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stu
		CPerson myCPerson = new CPerson();
		myCPerson.setRenZhong("中国人");
		JPerson myJPerson = new JPerson();
		myJPerson.setRenZhong("日本人");
		YPerson myYPerson = new YPerson();
		myYPerson.setRenZhong("印度人");
		FanJun myFanJun = new FanJun();
		myFanJun.talk(myCPerson);
//		myFanJun.talk(myJPerson);
//		myFanJun.talk(myYPerson);
//		myFanJun.kaichi(myYPerson);
		myFanJun.kaichi(myCPerson);
//		myFanJun.kaichi(myJPerson);
	}

}
