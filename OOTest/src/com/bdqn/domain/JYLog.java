package com.bdqn.domain;

import java.text.SimpleDateFormat;
import java.util.Date;

import com.bdqn.content.JYType;

/**
 * 此类是交易流水类
 * @author hidba
 *
 */
public class JYLog {
	private String jyCode = "";
	private String cardId = "";
	private int jyTypeCode = 0;
	private String jyName = "";
	private float jyMoney = 0f;
	private String jyDateTime = "";
	public String getJyCode() {
		return jyCode;
	}
	public String getCardId() {
		return cardId;
	}
	public void setCardId(String cardId) {
		this.cardId = cardId;
	}
	public String getJyName() {
		return jyName;
	}
	private void setJyName(String jyName) {
		this.jyName = jyName;
	}
	public float getJyMoney() {
		return jyMoney;
	}
	public void setJyMoney(float jyMoney) {
		this.jyMoney = jyMoney;
	}
	public String getJyDateTime() {
		return jyDateTime;
	}
	public JYLog(String cardId, int jyTypeCode, float jyMoney) {
		super();
		this.jyCode = this.getNowTime() + this.rand8();//生成交易流水
		this.cardId = cardId;
		this.jyTypeCode = jyTypeCode;
		if(this.jyTypeCode == 0){
			this.setJyName(JYType.JYTYPE_CUNKUAN);
		}else{
			this.setJyName(JYType.JYTYPE_QUKUAN);
		}
		this.jyMoney = jyMoney;
		this.jyDateTime = this.getNowTime(1);
	}
	private String getNowTime(){
		Date now = new Date();
		SimpleDateFormat sdf = new SimpleDateFormat("yyyyMMddHHmmss");
		return sdf.format(now);
	}
	/**
	 * 获得当前是的多样性方法
	 * @param flag 0:默认的无格式;1:yyyy-MM-dd HH:mm:ss
	 * @return String
	 */
	private String getNowTime(int flag){
		if(flag == 0){
			return this.getNowTime();
		}else{
			Date now = new Date();
			SimpleDateFormat sdf = new SimpleDateFormat("yyyy-MM-dd HH:mm:ss");
			return sdf.format(now);			
		}
	}
	/**
	 * 随机生成8位随机数
	 * @return
	 */
	public String rand8(){
		String randStr = "";
		for(int i = 0;i < 8;i++){
			randStr = randStr + (int)(Math.random()*10);
		}
		return randStr;
	}
}
