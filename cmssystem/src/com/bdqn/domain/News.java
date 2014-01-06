package com.bdqn.domain;

public class News {
	private int nid = 0;
	private String newsTitle = "";
	private String newsContent = "";
	private String ctime = "";
	private String cuserName = "";
	private String newsAddr = "";
	public int getNid() {
		return nid;
	}
	public void setNid(int nid) {
		this.nid = nid;
	}
	public String getNewsTitle() {
		return newsTitle;
	}
	public void setNewsTitle(String newsTitle) {
		this.newsTitle = newsTitle;
	}
	public String getNewsContent() {
		return newsContent;
	}
	public void setNewsContent(String newsContent) {
		this.newsContent = newsContent;
	}
	public String getCtime() {
		return ctime;
	}
	public void setCtime(String ctime) {
		this.ctime = ctime;
	}
	public String getCuserName() {
		return cuserName;
	}
	public void setCuserName(String cuserName) {
		this.cuserName = cuserName;
	}
	
	
	public String getNewsAddr() {
		return newsAddr;
	}
	public void setNewsAddr(String newsAddr) {
		this.newsAddr = newsAddr;
	}
	public News(int nid, String newsTitle, String newsContent, String ctime,
			String cuserName) {
		super();
		this.nid = nid;
		this.newsTitle = newsTitle;
		this.newsContent = newsContent;
		this.ctime = ctime;
		this.cuserName = cuserName;
	}
	public News(int nid, String newsTitle, String newsContent, String cuserName) {
		super();
		this.nid = nid;
		this.newsTitle = newsTitle;
		this.newsContent = newsContent;
		this.cuserName = cuserName;
	}
	
}
