package com.bdqn.domain;

import java.util.List;

import com.bdqn.service.CheZuLinService;

public class Custom {
	private String cid = "";
	private String cName = "";
	private CheZuLinService mySerivce = new CheZuLinService();
	public String getCid() {
		return cid;
	}
	public void setCid(String cid) {
		this.cid = cid;
	}
	public String getcName() {
		return cName;
	}
	public void setcName(String cName) {
		this.cName = cName;
	}
	public Custom(String cid, String cName) {
		super();
		this.cid = cid;
		this.cName = cName;
	}
	public int zuChe(QiChe parQiche,int parDay){
		return mySerivce.zhuCheFeiYong(parQiche, parDay);
	}
	public int zuChe(List<QiChe> parQiches,int parDay){
		return mySerivce.zhuCheFeiYong(parQiches, parDay);
	}
}
