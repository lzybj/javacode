package com.bdqn.service;

import com.bdqn.dao.INewsDao;
import com.bdqn.domain.News;
import com.bdqn.factory.CMSFactory;
import com.bdqn.util.CreateHtmlUtil;

public class NewsService {
	/**
	 * 1.生成HTML文件
	 * 2.插入数据库
	 * @param news
	 * @return
	 */
	public boolean sendNews(News news){
		String htmlAddr = CreateHtmlUtil.createHtml(news);
		news.setNewsAddr(htmlAddr);
		INewsDao newsDao = CMSFactory.getNewsDAO();
		return newsDao.insertNews(news);
		
	}
}
