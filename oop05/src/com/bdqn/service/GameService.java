package com.bdqn.service;

import java.util.Random;
import java.util.Scanner;

import com.bdqn.domain.Level;
import com.bdqn.domain.LevelCfg;
import com.bdqn.domain.Player;

public class GameService {
	private Player player = null;
	private Level mLevel = null;
	
	public Player getPlayer() {
		return player;
	}

	public void setPlayer(Player player) {
		this.player = player;
	}

	public Level getmLevel() {
		return mLevel;
	}

	public void setmLevel(Level mLevel) {
		this.mLevel = mLevel;
	}

	public GameService(Player player){
		this.player = player;
		this.mLevel = LevelCfg.LEVEL_CFG[this.player.getLevel() - 1];
	}
	
	//此方法用于生成随机字符串
	public String getRandStr(){
		String randStr = "";
		/**
		 * 1.生成随机整数(0-5)
		 * 2.创建swith随机生成字符串
		 */
		for (int i = 0; i < mLevel.getStrLen(); i++) {
			Random random = new Random();
			int rand = random.nextInt(5);
			switch (rand) {
			case 0:
				randStr = randStr + ">";
				break;
			case 1:
				randStr = randStr +  "%";
				break;
			case 2:
				randStr = randStr +  "^";
				break;
			case 3:
				randStr = randStr +  "_";
				break;
			case 4:
				randStr = randStr +  "r";
				break;
			default:
				randStr = randStr +  "@";
				break;
			}			
		}
		return randStr;
	}
	/**
	 * 1.比较系统生成的字符串是否与客户输入字符串相等?
	 * 2.输入的时间是否超过限定时间
	 * 1,2条件同时成立,
	 * 1.将累计客户积分
	 * 2.将累计客户所用总耗时
	 * 如果1，2有一个不成立则，GAME OVER
	 * 参数1：用户输入的串
	 * 参数2:系统生成的串
	 */
	public Player gameCore(String inputStr,String outStr){
		boolean isOK = false;
		if(inputStr.equals(outStr)){
			isOK = true;
		}
		if(isOK){
			//获得系统当前的毫秒数
			long nowTime = System.currentTimeMillis();
			//获得玩家开始输入时当前的时间
			long startTiem = this.player.getStartTime();
			//客户输入耗时
			int playerTime = (int)((nowTime - startTiem) / 1000);
			if(playerTime <= mLevel.getMaxTime()){
				//累计积分
				this.player.setJiFen(this.player.getJiFen() + mLevel.getLevelJF());
				//累计总耗时
				this.player.setTimeTotal(this.player.getTimeTotal() + playerTime);
				return this.player;
			}			
		}
		return null;
	}
	
	/**
	 *	游戏晋级
	 *   3.将积分清空
	 *   4.将总耗时清空
	 *   1.生成新的Level对象
	 *   2.调整玩家级别属性
	 */
	public void addLevel(){
		this.mLevel = LevelCfg.LEVEL_CFG[this.player.getLevel()];
		this.player.setLevel(this.mLevel.getLevelNo());
		this.player.setJiFen(0);
		this.player.setTimeTotal(0);
	}
	
	public void gameOver(){
		System.exit(0);
	}
	
	public void gameStart(){
		System.out.println("欢迎进入打字游戏系统");
		while(true){
			for (int i = 0; i < mLevel.getMaxCiShu(); i++) {
				String outputStr = this.getRandStr();
				long startTime = System.currentTimeMillis();
				System.out.println(outputStr);
				Scanner input = new Scanner(System.in);
				String inputStr = input.next();
				if(inputStr.equals("exit")){
					this.gameOver();
				}
				this.player.setStartTime(startTime);//设置开始时间
				this.player = this.gameCore(inputStr, outputStr);
				if(this.player == null){
					System.out.println("对不起，游戏结束！");
					this.gameOver();
				}
			}
			//判断是否全部通关
			if(this.player.getLevel() == LevelCfg.LEVEL_CFG.length){
				System.out.println("恭喜你，游戏全部通关！");
				this.gameOver();
			}
			//通关晋级
			this.addLevel();			
		}
	}
	
	public static void main(String[] args) {
		GameService gs = new GameService(new Player());
		//System.out.println(gs.getRandStr());
		gs.gameStart();
	}
}
