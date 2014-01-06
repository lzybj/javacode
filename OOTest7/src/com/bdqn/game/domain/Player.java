package com.bdqn.game.domain;

public class Player {
	private int level = 1;
	private long startTime = 0;
	private long totalTime = 0;
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
	public long getTotalTime() {
		return totalTime;
	}
	public void setTotalTime(long totalTime) {
		this.totalTime = totalTime;
	}
	public int getJiFen() {
		return jiFen;
	}
	public void setJiFen(int jiFen) {
		this.jiFen = jiFen;
	}
	public Player(int level, long startTime, long totalTime, int jiFen) {
		super();
		this.level = level;
		this.startTime = startTime;
		this.totalTime = totalTime;
		this.jiFen = jiFen;
	}
	public Player(){
	}
}
