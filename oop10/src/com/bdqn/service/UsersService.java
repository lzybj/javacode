package com.bdqn.service;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.Statement;
import java.util.ArrayList;
import java.util.List;

import com.bdqn.domain.Users;

public class UsersService {
	private Connection conn = null;
	private Statement stmt = null;
	private ResultSet rs = null;
	private String url = "jdbc:sqlserver://192.168.240.129:1433;DatabaseName=Myschool";
	private String sql = "";
	public boolean register(String uName,String upwd){
		try {
			Class.forName("com.microsoft.sqlserver.jdbc.SQLServerDriver");
			conn = DriverManager.getConnection(url,"sa","qaz123");
			stmt = conn.createStatement();
			sql = "insert into Users(uname,upwd)values('"+ uName +"','"+ upwd +"')";
			int flag = stmt.executeUpdate(sql);
			if(flag > 0){
				stmt.close();
				conn.close();
				return true;
			}else{
				stmt.close();
				conn.close();
				return false;
			}
		} catch (Exception e) {
			// TODO: handle exception
			e.printStackTrace();
		}
		return true;
	}
	public List<Users> findByAll(){
		List<Users> data = new ArrayList<Users>();
		try {
			Class.forName("com.microsoft.sqlserver.jdbc.SQLServerDriver");
			conn = DriverManager.getConnection(url,"sa","qaz123");
			stmt = conn.createStatement();
			sql = "select * from users";
			rs = stmt.executeQuery(sql);
			
			while(rs.next()){
				int uid = rs.getInt("uid");
				String uName = rs.getString("uname");
				String upwd = rs.getString("upwd");
				Users myUser = new Users(uid,uName,upwd);
				data.add(myUser);
			}
			
			rs.close();
			stmt.close();
			conn.close();
		} catch (Exception e) {
			// TODO: handle exception
			e.printStackTrace();
		}
		return data;
	}
}
