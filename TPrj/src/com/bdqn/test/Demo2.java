package com.bdqn.test;

import java.util.ArrayList;
import java.util.List;

import com.bdqn.domain.ShouQiang;
import com.bdqn.domain.TangKe;
import com.bdqn.inf.WuQI;
import com.bdqn.service.ZhanChang;

public class Demo2 {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		WuQI shouqiang = new ShouQiang();
		WuQI tangke = new TangKe();
		ZhanChang zhanChang = new ZhanChang();
		List<WuQI> wuqis = new ArrayList<WuQI>();
		wuqis.add(shouqiang);
		wuqis.add(tangke);
		zhanChang.kaiZhan(wuqis);
	}

}
