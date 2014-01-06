package com.bdqn.service;

import java.util.List;

import com.bdqn.domain.Bus;
import com.bdqn.domain.Car;
import com.bdqn.domain.CheType;
import com.bdqn.domain.QiChe;
import com.bdqn.service.inf.ICheZuLinService;

public class CheZuLinService implements ICheZuLinService{
	public int zhuCheFeiYong(QiChe parQiChe,int parDay){
		if (parQiChe instanceof Car) {
			Car myCar = (Car) parQiChe;
			if(myCar.getCarType() == CheType.BMW_550I){
				return 500 * parDay;
			}else if(myCar.getCarType() == CheType.BIEKE_GL8){
				return 600 * parDay;
			}else{
				return 300 * parDay;
			}
		}
		if(parQiChe instanceof Bus){
		   Bus myBus = (Bus) parQiChe;
		   if(myBus.getSeatCount() <= CheType.JINBEI_16){
			   return 800 * parDay;
		   }else{
			   return 1500 * parDay;
		   }
		}
		return 0;
	}
	public int zhuCheFeiYong(List<QiChe> parQiChes,int parDay){
		int sum = 0;
		for (QiChe qiChe : parQiChes) {
			sum = sum + this.zhuCheFeiYong(qiChe, parDay);
		}
		return sum;
	}
}
