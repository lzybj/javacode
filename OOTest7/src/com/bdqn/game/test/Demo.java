package com.bdqn.game.test;

import java.util.Random;
import java.util.Scanner;

import com.bdqn.game.core.GameService;
import com.bdqn.game.domain.Player;

public class Demo {

	public String randStr(int level){
		Random rand = new Random();
		String str = "";
		for(int i = 0;i < level;i++){
		int ran = rand.nextInt(level);
		switch (ran) {
		case 0:
			str = str + "<";
			break;
		case 1:
			str = str + ">";
			break;
		case 2:
			str = str + "@";
			break;
		case 3:
			str = str + "^";
			break;
		case 4:
			str = str + "&";
			break;
		default:
			str = str + ")";
			break;
		}
		}
		return str;
	}
	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		GameService gs = new GameService(new Player());
		gs.gameStart();
	}

}
