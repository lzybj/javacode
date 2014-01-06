package com.bdqn.service;

import java.sql.Connection;
import java.sql.DriverManager;

import com.bdqn.consts.DBConsts;

public class UsersService {
	public boolean login(String parUsername,String parPassWord){
		try {
			Connection conn = DriverManager.getConnection(DBConsts.DB_URL,DBConsts.DB_USER,DBConsts.DB_PWD);
		} catch (Exception e) {
			// TODO: handle exception
		}
		return false;
	}
}
