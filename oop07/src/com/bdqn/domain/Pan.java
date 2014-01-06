package com.bdqn.domain;

import java.util.Date;

public class Pan {
	private int productNum;
	private String ptime = "";//当前时间
	public int getProductNum() {
		return productNum;
	}
	public void setProductNum(int productNum) {
		this.productNum = productNum;
	}
	public String getPtime() {
		return ptime;
	}
	private void setPtime(String ptime) {
		this.ptime = ptime;
	}
	public Pan(int productNum) {
		super();
		this.productNum = productNum;
		this.ptime = new Date().toLocaleString();
	}
	
}
