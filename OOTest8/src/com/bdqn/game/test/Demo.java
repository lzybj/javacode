package com.bdqn.game.test;

import java.util.Random;
import java.util.Scanner;

import com.bdqn.game.core.GameService;
import com.bdqn.game.domain.Player;

public class Demo {
	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		GameService gs = new GameService(new Player());
		gs.gameStart();
	}

}
