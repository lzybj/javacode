package com.bdqn.factory;

import com.bdqn.dao.INewsDao;
import com.bdqn.dao.imp.NewsDAOImp;

public class CMSFactory {
	public static INewsDao getNewsDAO(){
		return NewsDAOImp.getInstance();
	}
}
