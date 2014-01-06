package com.bdqn.service;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.Statement;

import com.bdqn.domain.TBLUsers;

public class UsersService {
	private Connection conn = null;
	private Statement stmt = null;
	private ResultSet rs = null;
	private String sql = "";
	private String url = "jdbc:oracle:thin:@192.168.240.134:1522:ORCL";
	public TBLUsers isLogin(String uName,String uPwd){
		try {
			Class.forName("oracle.jdbc.driver.OracleDriver");
			conn = DriverManager.getConnection(url,"bdqnst03","qaz123");
			stmt = conn.createStatement();
			sql = "select * from tbl_users where uname = '"+ uName +"'";
			rs = stmt.executeQuery(sql);
			if(rs.next()){
				String pwd = rs.getString("upwd");
				if(uPwd.equals(pwd)){
					return new TBLUsers(uName, uPwd);
				}
			}
		} catch (Exception e) {
			// TODO: handle exception
			e.printStackTrace();
		}finally{
			try {
				rs.close();
				stmt.close();
				conn.close();
			} catch (Exception e2) {
				// TODO: handle exception
				e2.printStackTrace();
			}
		}
		return null;
	}
}
