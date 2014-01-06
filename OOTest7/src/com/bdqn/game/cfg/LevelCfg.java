package com.bdqn.game.cfg;

import com.bdqn.game.domain.Level;

public class LevelCfg {
	public static final Level LEVELS[] = new Level[6];
	static{
		LEVELS[0] = new Level(1, 2, 5, 20, 1);
		LEVELS[1] = new Level(2, 3, 1, 15, 3);
		LEVELS[2] = new Level(3, 4, 1, 10, 6);
		LEVELS[3] = new Level(4, 5, 1, 12, 7);
		LEVELS[4] = new Level(5, 6, 1, 6, 12);
		LEVELS[5] = new Level(6, 7, 1, 8, 15);		
	}
}
