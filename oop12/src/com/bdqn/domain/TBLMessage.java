package com.bdqn.domain;

public class TBLMessage {
	private int mid = 0;
	private String uName = "";
	private String messageContent = "";
	private String postTime = "";
	public int getMid() {
		return mid;
	}
	public void setMid(int mid) {
		this.mid = mid;
	}
	public String getuName() {
		return uName;
	}
	public void setuName(String uName) {
		this.uName = uName;
	}
	public String getMessageContent() {
		return messageContent;
	}
	public void setMessageContent(String messageContent) {
		this.messageContent = messageContent;
	}
	public String getPostTime() {
		return postTime;
	}
	public void setPostTime(String postTime) {
		this.postTime = postTime;
	}
	public TBLMessage(int mid, String uName, String messageContent,
			String postTime) {
		super();
		this.mid = mid;
		this.uName = uName;
		this.messageContent = messageContent;
		this.postTime = postTime;
	}
	public TBLMessage(String uName, String messageContent) {
		super();
		this.uName = uName;
		this.messageContent = messageContent;
	}
}
