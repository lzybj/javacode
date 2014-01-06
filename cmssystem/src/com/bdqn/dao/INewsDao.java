package com.bdqn.dao;

import java.util.List;

import com.bdqn.domain.News;

public interface INewsDao {
	public boolean insertNews(News news);
	public List<News> findByAll();
}
