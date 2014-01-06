package com.bdqn.test;

import org.apache.log4j.Logger;

public class Demo {
	private Logger log = Logger.getLogger(Demo.class.getName());
	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Logger log = Logger.getLogger(Demo.class.getName());
		log.fatal("第一个级别消息类型fatal!");
		log.error("第二个级别消息类型error!");
		log.warn("第三个级别消息类型warn!");
		log.info("第四个级别消息类型debug!");
		log.debug("第五个级别消息类型info!");
		try {
			System.out.println(10/0);
		} catch (Exception e) {
			// TODO: handle exception
			log.error("对比起，成需出差了！");
		}
	}

}
