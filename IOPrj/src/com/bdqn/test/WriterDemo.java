package com.bdqn.test;

import java.io.BufferedWriter;
import java.io.File;
import java.io.FileWriter;
import java.io.PrintWriter;
import java.util.Date;

public class WriterDemo {

	/**
	 * @param args
	 */
	public static void main(String[] args) throws Exception{
		// TODO Auto-generated method stub
		File myFile = new File("log.txt");
		//打开文件
		FileWriter fw = new FileWriter(myFile,true);
		//准备开始写
		BufferedWriter bw = new BufferedWriter(fw);
		//写
		PrintWriter out = new PrintWriter(bw);
		out.println("测试一下" + new Date());
		out.println("来自与老郑");
		//保存
		out.close();
		bw.close();
		fw.close();

	}

}
