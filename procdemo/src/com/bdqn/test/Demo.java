package com.bdqn.test;

import java.sql.CallableStatement;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;

public class Demo {

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
			sql = "{call proc_sms_findSmsListBySento(?)}";
			cstmt = conn.prepareCall(sql);
			cstmt.setString(1,"wk");
			rs = cstmt.executeQuery();
			while(rs.next()){
				System.out.println(rs.getString("msgcontent"));
			}
			rs.close();
			cstmt.close();
			conn.close();
		} catch (Exception e) {
			// TODO: handle exception
			e.printStackTrace();
		}
	}

}
