package com.bdqn.game.inf.core;

import com.bdqn.game.domain.Player;

public interface IGameService {
	public String randStr();
	public Player gameCore(String inputStr,String outputStr);
	public void addLevel();
	public int addJF();
	public void gameStart();
	public void gameOver();
	public void setPlayer(Player parPlayer);
}
