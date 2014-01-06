package com.bdqn.service.inf;

import java.sql.Connection;
import java.util.List;

public interface IDBHelp {
	public Connection getConn(String url,String parUserName,String parPassWord);
	public List<Object> executeQuery(String sql);
	public int execute(String sql);
	public void close();
}
