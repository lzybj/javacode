package com.bdqn.test;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.Statement;

public class Demo3 {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Connection conn = null;
		Statement stmt = null;
		ResultSet rs = null;
		String url = "jdbc:sqlserver://192.168.240.129:1433;DatabaseName=myschool";
		String sql = "";
		try {
			Class.forName("com.microsoft.sqlserver.jdbc.SQLServerDriver");
			conn = DriverManager.getConnection(url,"sa","qaz123");
			stmt = conn.createStatement();
			sql = "select * from users";
			rs = stmt.executeQuery(sql);
			//解析结果集
			
			while(rs.next()){
				//rs.getXxxx(列名) Xxx:int/String/Date
				System.out.println(rs.getInt("uid"));
				System.out.println(rs.getString("uname"));
				System.out.println(rs.getString("upwd"));
			}
		
			rs.close();
			stmt.close();
			conn.close();
		} catch (Exception e) {
			// TODO: handle exception
			e.printStackTrace();
		}
	}

}
