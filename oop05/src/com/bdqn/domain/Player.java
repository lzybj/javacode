package com.bdqn.domain;

public class Player {
	//玩家级别
	private int level = 1;
	//玩家开始时间
	private long startTime = 0;
	//玩家在某一个关所用的总时间
	private int timeTotal = 0;
	//玩家积分
	private int jiFen = 0;
	public int getLevel() {
		return level;
	}
	public void setLevel(int level) {
		this.level = level;
	}
	public long getStartTime() {
		return startTime;
	}
	public void setStartTime(long startTime) {
		this.startTime = startTime;
	}
	public int getTimeTotal() {
		return timeTotal;
	}
	public void setTimeTotal(int timeTotal) {
		this.timeTotal = timeTotal;
	}
	public int getJiFen() {
		return jiFen;
	}
	public void setJiFen(int jiFen) {
		this.jiFen = jiFen;
	}
	public Player(int level, long startTime, int timeTotal, int jiFen) {
		super();
		this.level = level;
		this.startTime = startTime;
		this.timeTotal = timeTotal;
		this.jiFen = jiFen;
	}
	public Player() {
		super();
	}
	
	
}
