package com.bdqn.test;

import java.util.ArrayList;
import java.util.List;

import com.bdqn.domain.FeiJi;
import com.bdqn.domain.ShouQiang;
import com.bdqn.domain.TangKe;
import com.bdqn.domain.WuQi;
import com.bdqn.service.ZhanChang;

public class Demo3 {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		List<WuQi> wuqis = new ArrayList<WuQi>();
		WuQi sq = ShouQiang.getShouQiang();
		wuqis.add(sq);
		TangKe tk = new TangKe();
		wuqis.add(tk);
		FeiJi fj = new FeiJi();
		wuqis.add(fj);
		ZhanChang zhanchang = new ZhanChang();
		zhanchang.kaiZhan(wuqis);
//		zhanchang.kaiZhan(sq);
//		zhanchang.kaiZhan(tk);
//		zhanchang.kaiZhan(fj);
	}

}
