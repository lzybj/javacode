package com.bdqn.service;

import java.util.Random;

import com.bdqn.domain.Player;

public class GameServiceV2 extends GameService {
	private Player player = null;
	private Player player2 = null;
	public GameServiceV2(Player player,Player player2) {
		super(player);
		// TODO Auto-generated constructor stub
		this.player2 = player2;
	}
	
	@Override
	public String getRandStr() {
		String randStr = "";
		/**
		 * 1.生成随机整数(0-5)
		 * 2.创建swith随机生成字符串
		 */
		for (int i = 0; i < this.getmLevel().getStrLen() ; i++) {
			Random random = new Random();
			int rand = random.nextInt(5);
			switch (rand) {
			case 0:
				randStr = randStr + "a";
				break;
			case 1:
				randStr = randStr +  "b";
				break;
			case 2:
				randStr = randStr +  "c";
				break;
			case 3:
				randStr = randStr +  "d";
				break;
			case 4:
				randStr = randStr +  "e";
				break;
			default:
				randStr = randStr +  "f";
				break;
			}			
		}
		return randStr;
	}
}
