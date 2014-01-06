package com.bdqn.ui;

import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.Scanner;

import com.bdqn.domain.News;
import com.bdqn.service.NewsService;

public class CMSSystem {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner input = new Scanner(System.in);
		System.out.println("请输入新闻ID：");
		int nid = input.nextInt();
		System.out.println("请输入新闻标题：");
		String newsTitle = input.next();
		System.out.println("请输入新闻内容：");
		String newsContent = input.next();
		System.out.println("请输入发布人：");
		String cuserName = input.next();
		Date now = new Date();
		SimpleDateFormat sdf = new SimpleDateFormat("yyyy-MM-dd HH:mm:ss");
		String ctime = sdf.format(now);
		
		News myNews = new News(nid, newsTitle, newsContent, ctime, cuserName);
		
		NewsService ns = new NewsService();
		
		boolean isSucc = ns.sendNews(myNews);
		
		if(isSucc){
			System.out.println("发布成功@");
		}else{
			System.out.println("发布失败！");
		}
		
	}

}
