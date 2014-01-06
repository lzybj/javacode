package com.bdqn.test;

import java.io.File;

public class FileDemo {

	/**
	 * @param args
	 */
	public static void main(String[] args) throws Exception{
		// TODO Auto-generated method stub
		File myFile = new File("log.txt");
		if(myFile.exists()){//存在
			System.out.println(myFile.delete());
			return;
		}else{//不存在
			System.out.println(myFile.createNewFile());
		}
		System.out.println(myFile.getAbsolutePath());//获取文件绝对路径
		
	}

}
