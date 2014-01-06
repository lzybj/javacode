package com.bdqn.game.cfg;

import com.bdqn.game.domain.Level;

public class LevelCfg {
	public static final Level[] LEVELS = new Level[6];
	static{
		LEVELS[0] = new Level(1,2,12,1,2);
		LEVELS[1] = new Level(2,3,10,1,4);
		LEVELS[2] = new Level(3,4,14,1,6);
		LEVELS[3] = new Level(4,5,18,1,10);
		LEVELS[4] = new Level(5,6,20,1,20);
		LEVELS[5] = new Level(6,7,15,1,30);
	}
}
