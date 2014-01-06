package com.bdqn.domain;

import java.util.ArrayList;

public class FanJun {
	public void jiaoLiu(Person p){
		p.talk();
	}
	
	public void jiaoLiu(ArrayList<Person> persons){
		for (Person person : persons) {
			person.talk();
		}
	}
	
	public void kaiChi(Person p){
		p.eat();
	}
	
	public void kaiChi(ArrayList<Person> persons){
		for (Person person : persons) {
			person.eat();
		}
	}
}
