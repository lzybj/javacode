package com.bdqn.game.domain;

public class Level {
	//级别
	private int level = 1;
	//当前级别所要生成的字符串长度
	private int strLen = 0;
	//输入字符串最长限制用时
	private int maxTime = 0;
	//当前级别要循环的次数
	private int randMax = 0;
	//当前级别输入正确后，获得的积分
	private int levelJF = 0;
	
	public int getLevelJF() {
		return levelJF;
	}
	public void setLevelJF(int levelJF) {
		this.levelJF = levelJF;
	}
	public int getLevel() {
		return level;
	}
	public void setLevel(int level) {
		this.level = level;
	}
	public int getStrLen() {
		return strLen;
	}
	public void setStrLen(int strLen) {
		this.strLen = strLen;
	}
	public int getMaxTime() {
		return maxTime;
	}
	public void setMaxTime(int maxTime) {
		this.maxTime = maxTime;
	}
	public int getRandMax() {
		return randMax;
	}
	public void setRandMax(int randMax) {
		this.randMax = randMax;
	}
	public Level(int level, int strLen, int maxTime, int randMax, int levelJF) {
		super();
		this.level = level;
		this.strLen = strLen;
		this.maxTime = maxTime;
		this.randMax = randMax;
		this.levelJF = levelJF;
	}
}
