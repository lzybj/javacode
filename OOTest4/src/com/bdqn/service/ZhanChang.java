package com.bdqn.service;

import java.util.List;

import com.bdqn.domain.WuQi;

public class ZhanChang {
	public void kaiZhan(WuQi parWuQi){
		parWuQi.fire();
	}
	public void kaiZhan(List<WuQi> parWuQis){
		for (WuQi wuQi : parWuQis) {
			wuQi.fire();
		}
	}
}
