package com.bdqn.domain;

public class LevelCfg {
	public static Level[] LEVEL_CFG = new Level[6];
	static{
		//参数说明:级别,字符串长度,循环次数,限定秒数,积分
		LEVEL_CFG[0] = new Level(1,1,1,15,5);
		LEVEL_CFG[1] = new Level(2,2,1,10,15);
		LEVEL_CFG[2] = new Level(3,3,1,12,25);
		LEVEL_CFG[3] = new Level(4,4,1,7,35);
		LEVEL_CFG[4] = new Level(5,5,1,8,45);
		LEVEL_CFG[5] = new Level(6,6,1,15,55);
	}
}
