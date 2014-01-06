package com.bdqn.core;

import com.bdqn.core.inf.IMyGameSerivce;
import com.bdqn.game.core.GameService;
import com.bdqn.game.domain.Player;

public class MyGameService extends GameService implements IMyGameSerivce{
	public MyGameService(Player player) {
		super(player);
		// TODO Auto-generated constructor stub	
	}
		
	@Override
	public int addJF(int parYongTime) {		
		// TODO Auto-generated method stub
		return (super.getMyLevel().getMaxTime() - parYongTime) * super.getMyLevel().getLevelJF();
	}

}
