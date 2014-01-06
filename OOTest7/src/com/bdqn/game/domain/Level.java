package com.bdqn.game.domain;

public class Level {
	private int levelCode = 0;
	private int strLen = 0;
	private int maxRand = 0;
	private int maxtime = 0;
	private int levelFen = 0;
	public int getLevelCode() {
		return levelCode;
	}
	public void setLevelCode(int levelCode) {
		this.levelCode = levelCode;
	}
	public int getStrLen() {
		return strLen;
	}
	public void setStrLen(int strLen) {
		this.strLen = strLen;
	}
	public int getMaxRand() {
		return maxRand;
	}
	public void setMaxRand(int maxRand) {
		this.maxRand = maxRand;
	}
	public int getMaxtime() {
		return maxtime;
	}
	public void setMaxtime(int maxtime) {
		this.maxtime = maxtime;
	}
	public int getLevelFen() {
		return levelFen;
	}
	public void setLevelFen(int levelFen) {
		this.levelFen = levelFen;
	}
	public Level(int levelCode, int strLen, int maxRand, int maxtime,
			int levelFen) {
		super();
		this.levelCode = levelCode;
		this.strLen = strLen;
		this.maxRand = maxRand;
		this.maxtime = maxtime;
		this.levelFen = levelFen;
	}
}
