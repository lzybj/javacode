package com.bdqn.domain;

import java.util.ArrayList;

public class Customer {
	private String cname = "";
	private String cid = "";//驾照号
	public Customer(String cname, String cid) {
		super();
		this.cname = cname;
		this.cid = cid;
	}
	public String getCname() {
		return cname;
	}
	public void setCname(String cname) {
		this.cname = cname;
	}
	public String getCid() {
		return cid;
	}
	public void setCid(String cid) {
		this.cid = cid;
	}
	
	public void zuChe(Che che,int day){
		System.out.println("您需要费用是:" + che.culPrice(day));
	}
	
	public void zuChe(ArrayList<Che> ches,int day){
		int sum = 0;
		System.out.println(this.cname + "的租车缴费明细:");
		for (Che che : ches) {
			if(che instanceof Car){
				System.out.println("品牌：" + che.getBrand() + "  型号：" + ((Car)che).getBrandType() + "  天数" + day + "  小计：" + che.culPrice(day));
			}else{
				if(che instanceof Bus){
					System.out.println("品牌：" + che.getBrand() + "  座位数：" + ((Bus)che).getSeatNum() + "  天数" + day + "  小计：" + che.culPrice(day));					
				}else{
					System.out.println("品牌：" + che.getBrand() + "  吨位数：" + ((KaChe)che).getDun() + "  天数" + day + "  小计：" + che.culPrice(day));
				}
			}
			sum = sum + che.culPrice(day);			
		}
		System.out.println("您共计租用了" + ches.size() + "车,租金共计：" + sum);
	}
	
}
