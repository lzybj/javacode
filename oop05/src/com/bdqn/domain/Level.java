package com.bdqn.domain;

public class Level {
	//级别编号
	private int levelNo = 0;
	//当前级别生成字符串长度
	private int strLen = 0;
	//当前关卡循环次数
	private int maxCiShu = 0;
	//当前关卡最大限定时间
	private int maxTime = 0;
	//当前关卡获得通过后获得积分
	private int levelJF = 0;
	public Level(int levelNo, int strLen, int maxCiShu, int maxTime, int levelJF) {
		super();
		this.levelNo = levelNo;
		this.strLen = strLen;
		this.maxCiShu = maxCiShu;
		this.maxTime = maxTime;
		this.levelJF = levelJF;
	}
	public int getLevelNo() {
		return levelNo;
	}
	public void setLevelNo(int levelNo) {
		this.levelNo = levelNo;
	}
	public int getStrLen() {
		return strLen;
	}
	public void setStrLen(int strLen) {
		this.strLen = strLen;
	}
	public int getMaxCiShu() {
		return maxCiShu;
	}
	public void setMaxCiShu(int maxCiShu) {
		this.maxCiShu = maxCiShu;
	}
	public int getMaxTime() {
		return maxTime;
	}
	public void setMaxTime(int maxTime) {
		this.maxTime = maxTime;
	}
	public int getLevelJF() {
		return levelJF;
	}
	public void setLevelJF(int levelJF) {
		this.levelJF = levelJF;
	}
	
	
	
}
