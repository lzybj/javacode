package com.bdqn.bank.service;

import java.text.SimpleDateFormat;
import java.util.Date;

/**
  * 此类是业务逻辑类
 * 5.转账业务操作
 * @author hidba
 *
 */
public class ZhuanZhangService {
	/**
	 * 1.将转出账号余额更新
	 * 2.将转入账号余额更新
	 * 3.插入两条业务流水
	 *   3.1 转出业务流水
	 *   3.2 转入业务流水
	 * 4.事务处理
	 * @param parAccCodeOut 转出账号
	 * @param parAccCodeIn  转入账号
	 * @param parMoney      转账金额
	 * @return 成功与否
	 */
	public boolean zzService(String parAccCodeOut,String parAccCodeIn,float parMoney){
		return false;
	}
	/**
	 * 生成业务流水
	 * 业务规则：年月日+8位随机数
	 * 例如：2013030212153424342984
	 * @return
	 */
	private String createSerCode(){
		SimpleDateFormat sfd = new SimpleDateFormat("yyyyMMddHHmmss");
		Date nowDate = new Date();
		System.out.println(sfd.format(nowDate));
		return "";
	}
	public static void main(String[] args) {
		new ZhuanZhangService().createSerCode();
	}
}
