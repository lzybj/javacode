package com.bdqn.service;

import java.util.List;

import com.bdqn.domain.QiChe;

public abstract class ABSCheZuLinService {
	public abstract int zhuCheFeiYong(QiChe parQiChe,int parDay);
	public abstract int zhuCheFeiYong(List<QiChe> parQiChes,int parDay);
}
