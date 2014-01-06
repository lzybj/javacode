package com.bdqn.test;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileReader;

public class ReaderDemo {

	/**
	 * @param args
	 */
	public static void main(String[] args) throws Exception{
		// TODO Auto-generated method stub
		File myFile = new File("log.txt");
		//打开文件
		FileReader fr = new FileReader(myFile);
		//准备开始读
		BufferedReader br = new BufferedReader(fr);
		//读
		String temp;//临时存储一行数据
		while((temp = br.readLine()) != null){
			System.out.println(temp);
		}
		//关闭
		br.close();
		fr.close();
	}

}
