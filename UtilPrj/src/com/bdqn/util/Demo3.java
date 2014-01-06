package com.bdqn.util;

import java.util.HashSet;
import java.util.Set;

public class Demo3 {
	public static void main(String[] args) {
		Set<String> data = new HashSet<String>();
		int y = 0;
		while(true){
			if(data.size() == 300){
				break;
			}
			String randStr = "";
			for (int i = 0; i < 8; i++) {
				randStr = randStr + (int)(Math.random()*10);
			}
			data.add(randStr);
			y++;
		}
		System.out.println(data);
		System.out.println(y);
	}
}
