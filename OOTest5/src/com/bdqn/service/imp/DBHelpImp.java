package com.bdqn.service.imp;

import java.sql.Connection;
import java.util.List;

import com.bdqn.service.inf.IDBHelp;

public class DBHelpImp implements IDBHelp{

	@Override
	public Connection getConn(String url, String parUserName, String parPassWord) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public List<Object> executeQuery(String sql) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public int execute(String sql) {
		// TODO Auto-generated method stub
		return 0;
	}

	@Override
	public void close() {
		// TODO Auto-generated method stub
		
	}

}
