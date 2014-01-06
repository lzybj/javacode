package com.bdqn.test;

import com.bdqn.game.core.GameService;
import com.bdqn.game.domain.Player;
import com.bdqn.game.inf.core.IGameService;

public class Demo {
	public static void main(String[] args) {
		Player myPlayer = new Player();
		IGameService gs = new GameService(myPlayer);
		gs.gameStart();
	}
}
