package com.bdqn.game.domain;

public class Player {
	//玩家级别
	private int levelCode = 1;
	//玩家积分
	private int jiFen = 0;
	//玩家开始玩的时间
	private long startTime = 0;
	//玩家总用时
	private int totalTime = 0;
	public int getLevelCode() {
		return levelCode;
	}
	public void setLevelCode(int levelCode) {
		this.levelCode = levelCode;
	}
	public int getJiFen() {
		return jiFen;
	}
	public void setJiFen(int jiFen) {
		this.jiFen = jiFen;
	}
	public long getStartTime() {
		return startTime;
	}
	public void setStartTime(long startTime) {
		this.startTime = startTime;
	}
	public int getTotalTime() {
		return totalTime;
	}
	public void setTotalTime(int totalTime) {
		this.totalTime = totalTime;
	}
	public Player(int levelCode, int jiFen, long startTime, int totalTime) {
		super();
		this.levelCode = levelCode;
		this.jiFen = jiFen;
		this.startTime = startTime;
		this.totalTime = totalTime;
	}
	public Player() {
		super();
	}
}
