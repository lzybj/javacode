package com.bdqn.service;

import com.bdqn.domain.Animal;
import com.bdqn.inf.Terrestrial;

public class Inferno {
	public void aiZhou(Animal[] animals){
		for (Animal animal : animals) {
			System.out.print(animal.getName() + "-------");
			animal.shout();
		}
	}
	public void xieTui(Animal[] animals){
		for (Animal animal : animals) {
			if(animal instanceof Terrestrial){
				int legnum = ((Terrestrial)animal).getLegnum();
				System.out.println("卸了" + animal.getName() + ":" + legnum + "条腿");
			}else{
				System.out.println("对不起，这个动物" + animal.getName() +":已经被老天爷全卸光了！");
			}
		}
	}
}
