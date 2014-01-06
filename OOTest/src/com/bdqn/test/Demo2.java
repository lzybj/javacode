package com.bdqn.test;

public class Demo2 {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int count = 0;
		float sswd = 0f;
		float hswd = 0f;
		do{
			if(count != 0){
			sswd = sswd + 20;
			}
			hswd = sswd * 0.9f + 32;
			System.out.println(sswd + ":" + hswd);
			count++;
		}while(count < 10 && hswd < 250);
	}

}
