package com.bdqn.game.core;

import java.util.Random;
import java.util.Scanner;

import com.bdqn.game.cfg.LevelCfg;
import com.bdqn.game.domain.Level;
import com.bdqn.game.domain.Player;
import com.bdqn.game.inf.core.IGameService;

public class GameService implements IGameService{
	private Player player = null;
	private Level myLevel = null;
	public Player getPlayer() {
		return player;
	}
	public Level getMyLevel() {
		return myLevel;
	}
	public GameService(Player player) {
		this.player = player;
		myLevel = LevelCfg.LEVELS[this.player.getLevelCode() - 1];
	}
	/**
	 * 根据玩家级别系统随机生成一个根据LEVEL对象中某个属性(strLen)长度的字符串
	 * 规则：
	 *   随机种子即是strLen
	 * @return
	 */
	public String randStr(){
		String randStr = "";
		int strLen = this.myLevel.getStrLen();
		for(int i = 0;i < strLen;i++){
			Random random = new Random();
			int rand = random.nextInt(strLen);
		switch (rand) {
		case 0:
			randStr = randStr + "<";
			break;
		case 1:
			randStr = randStr + "@";
			break;
		case 2:
			randStr = randStr + "^";
			break;
		case 3:
			randStr = randStr + ")";
			break;
		case 4:
			randStr = randStr + "&";
			break;
		case 5:
			randStr = randStr + "!";
			break;
		default:
			randStr = randStr + "%";
			break;
		}			
	    }		
		return randStr;
	}
	/**
	 * 比较用户输入的字符串与系统随机出现字符串，是否相等
	 * 如果相等，还要判断输入所用时间，是否是当前级别要求限时时间，
	 * 如果是：将当前级别积分累加给玩家,同时，累加所用时间
	 * 如果不是：失败
	 * @param inputStr 玩家输入的字符串
	 * @param outputStr 系统随机生成字符串
	 * @return 返回play对象，如果失败，则返回NULL
	 */
	public Player gameCore(String inputStr,String outputStr){
		boolean isOK = false;
		if(inputStr.endsWith(outputStr)){
			isOK = true;
		}
		if(isOK){
			//获取输入结束实际
			long endTime = System.currentTimeMillis();
			//玩家所用的时间
			int yongTime = (int)((endTime - this.player.getStartTime()) / 1000);
			if(yongTime < this.myLevel.getMaxTime()){//成功
				//加积分
				this.player.setJiFen(this.player.getJiFen() + this.addJF());
				//加时间
				this.player.setTotalTime(this.player.getTotalTime() + yongTime);
				return this.player;
			}
		}
		return null;
	}
	/**
	 * 晋级处理
	 * 1.玩家级别增加
	 * 2.获得新的级别类
	 * 3.积分清空(jiFen)
	 * 4.累计耗时时间清空(totalTime)
	 */
	public void addLevel(){
		this.player.setLevelCode(this.player.getLevelCode() + 1);
		this.myLevel = LevelCfg.LEVELS[this.player.getLevelCode() - 1];
		this.player.setJiFen(0);
		this.player.setTotalTime(0);
	}
	public int addJF(){
		int addjf = this.myLevel.getLevelJF();
		return addjf;
	}
	public void gameStart(){
		System.out.println("欢迎进入老郑打字游戏系统");
		while(true){
			for (int i = 0; i < this.myLevel.getRandMax(); i++) {
				String randStr = this.randStr();
				System.out.println(randStr);
				this.player.setStartTime(System.currentTimeMillis());
				Scanner scanner = new Scanner(System.in);
				String inputStr = scanner.next();
				this.player = this.gameCore(inputStr, randStr);
				if(this.player == null){
					System.out.println("你太慢了，回去多练练，游戏结束了！");
					this.gameOver();
				}			
			}
			//晋级
			if(this.myLevel.getLevel() == LevelCfg.LEVELS.length){//当前级别已经最高
				System.out.println("你太牛了，通关！");
				this.gameOver();
			}
			this.addLevel();			
		}
	}
	public void gameOver(){
		System.exit(0);//强制结束整个程序
	}
	@Override
	public void setPlayer(Player parPlayer) {
		// TODO Auto-generated method stub
		this.player = parPlayer;
	}
}
