package com.bdqn.service;

import java.util.List;

import com.bdqn.domain.Cat;
import com.bdqn.domain.Dog;
import com.bdqn.inf.DongWu;

public class CWShop {
//	public void aiZhou(Cat parCat){
//		parCat.jiao();
//	}
//	public void aiZhou(Dog parDog){
//		parDog.jiao();
//	}
	public void aiZhou(DongWu parDongWu){
		parDongWu.jiao();
	}
	public void aiZhou(List<DongWu> parDongWus){
		for (DongWu dongWu : parDongWus) {
			dongWu.jiao();
		}
	}
}
