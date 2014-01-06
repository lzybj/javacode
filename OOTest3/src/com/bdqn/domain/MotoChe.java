package com.bdqn.domain;

public abstract class MotoChe {
	private String mHao = "";
	private String yanShe = "";
	private String pinPai = "";
	private float price = 0f;
	public abstract float total(int day);
}
