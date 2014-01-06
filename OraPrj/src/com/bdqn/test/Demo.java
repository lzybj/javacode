package com.bdqn.test;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.Statement;

public class Demo {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Connection conn = null;
		Statement stmt = null;
		ResultSet rs = null;
		String url = "jdbc:oracle:thin:@192.168.240.134:1522:ORCL";
		String sql = "";
		try {
			Class.forName("oracle.jdbc.driver.OracleDriver");
			conn = DriverManager.getConnection(url,"bdqn","qaz123");
			stmt = conn.createStatement();
			sql = "insert into chongwu(cwid,cwname,cwhealth,cwlove,zname,cwtid)values(seq_chongwu.nextval,'dada',80,30,'laozheng',1)";
			System.out.println(sql);
//			sql = "insert into chongwutype values(seq_chongwu.nextval,'sssss')";
			int flag = stmt.executeUpdate(sql);
			System.out.println(flag);
//			rs = stmt.executeQuery(sql);
//			if(rs.next()){
//				System.out.println(rs.getString("zname"));
//			}
//			rs.close();
			stmt.close();
			conn.close();
		} catch (Exception e) {
			// TODO: handle exception
			e.printStackTrace();
		}
	}

}
