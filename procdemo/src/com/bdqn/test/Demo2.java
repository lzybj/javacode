package com.bdqn.test;

import java.sql.CallableStatement;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;

public class Demo2 {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Connection conn = null;
		CallableStatement cstmt = null;
		ResultSet rs = null;
		String url = "jdbc:sqlserver://192.168.240.129:1433;DatabaseName=BDQN_SMS";
		String sql = "";
		try {
			Class.forName("com.microsoft.sqlserver.jdbc.SQLServerDriver");
			conn = DriverManager.getConnection(url, "sa","qaz123");
			sql = "{call proc_sms_findByUserName(?,?)}";
			cstmt = conn.prepareCall(sql);
			cstmt.setString(1,"wk");
			cstmt.registerOutParameter(2,java.sql.Types.VARCHAR);
			System.out.println(cstmt.execute());
			System.out.println(cstmt.getString(2));//Êä³ö²ÎÊý
			cstmt.close();
			conn.close();
		} catch (Exception e) {
			// TODO: handle exception
			e.printStackTrace();
		}		
	}

}
