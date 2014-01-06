package com.bdqn.test;

import java.sql.CallableStatement;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;

public class ProcDemo2 {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Connection conn = null;
		CallableStatement cstmt = null;
		ResultSet rs = null;
		String sql = "";
		String url = "jdbc:sqlserver://192.168.240.129:1433;Databasename=Myschool";
		try {
			Class.forName("com.microsoft.sqlserver.jdbc.SQLServerDriver");
			conn = DriverManager.getConnection(url, "sa", "qaz123");
			sql = "{call proc_student_fy2(?,?,?)}";
			cstmt = conn.prepareCall(sql);
			cstmt.setInt(1,5);
			cstmt.setInt(2,6);
			//注册输出参数
			cstmt.registerOutParameter(3,java.sql.Types.INTEGER);
			rs = cstmt.executeQuery();
			while(rs.next()){
				System.out.println(rs.getString("studentno"));
				System.out.println(rs.getString("studentname"));
			}
			System.out.println("共计" + cstmt.getInt(3) + "页");
			rs.close();
			cstmt.close();
			conn.close();
		} catch (Exception e) {
			// TODO: handle exception
			e.printStackTrace();
		}
	}

}
