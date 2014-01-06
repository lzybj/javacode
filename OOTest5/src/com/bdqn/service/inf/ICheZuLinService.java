package com.bdqn.service.inf;

import java.util.List;

import com.bdqn.domain.QiChe;

public interface ICheZuLinService {
	public int zhuCheFeiYong(QiChe parQiChe,int parDay);
	public int zhuCheFeiYong(List<QiChe> parQiChes,int parDay);

}
