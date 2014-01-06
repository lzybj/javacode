package com.bdqn.service;

import com.bdqn.domain.CPerson;
import com.bdqn.domain.JPerson;
import com.bdqn.domain.Person;
import com.bdqn.domain.YPerson;

public class FanJun {
	/**没有利用多态实现
	public void talk(CPerson parCPerson){
		parCPerson.langauge();
	}
	public void talk(JPerson parJPerson){
		parJPerson.langauge();
	}
	public void talk(YPerson parYPerson){
		parYPerson.langauge();
	}
	public void kaichi(CPerson parCPerson){
		parCPerson.eat();
	}
	public void kaichi(JPerson parJPerson){
		parJPerson.eat();
	}
	public void kaichi(YPerson parYPerson){
		parYPerson.eat();
	}
	**/
	public void talk(Person myPerson){
		myPerson.langauge();
	}
	public void kaichi(Person myPerson){
		myPerson.eat();
	}
}
