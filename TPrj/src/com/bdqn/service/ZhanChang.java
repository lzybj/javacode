package com.bdqn.service;

import java.util.List;

import com.bdqn.inf.WuQI;

public class ZhanChang {
	public void kaiZhan(WuQI parWuQi){
		parWuQi.fire();
	}
	public void kaiZhan(List<WuQI> parWuQis){
		for (WuQI wuQI : parWuQis) {
			wuQI.fire();
		}
	}
}
