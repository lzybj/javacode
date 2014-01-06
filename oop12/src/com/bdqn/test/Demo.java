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
		String sql = "";
		//jdbc:oracle:thin:@Êý¾Ý¿âIPµØÖ·£º1521£ºSID
		//localhost/127.0.0.1
		String url = "jdbc:oracle:thin:@192.168.240.134:1522:ORCL";
		try {
			Class.forName("oracle.jdbc.driver.OracleDriver");
			conn = DriverManager.getConnection(url,"bdqnst03","qaz123");
			stmt = conn.createStatement();
			sql = "select * from tbl_users where uname = 'laozheng'";
			rs = stmt.executeQuery(sql);
			if(rs.next()){
				String upwd = rs.getString("upwd");
				if(upwd.equals("qaz123")){
					System.out.println("µÇÂ¼³É¹¦!");
				}else{
					System.out.println("Ê§°Ü£¡");
				}
			}else{
				System.out.println("Ê§°Ü£¡");
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
	}

}
