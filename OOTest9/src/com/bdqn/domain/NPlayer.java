package com.bdqn.domain;

import com.bdqn.game.domain.Player;

public class NPlayer extends Player {
	private String pname = "";
	private int health = 100;
	public String getPname() {
		return pname;
	}
	public void setPname(String pname) {
		this.pname = pname;
	}
	public int getHealth() {
		return health;
	}
	public void setHealth(int health) {
		this.health = health;
	}
}
