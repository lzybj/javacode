package com.bdqn.test;

import java.sql.CallableStatement;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;

public class ProcDemo {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Connection conn = null;
		CallableStatement cstmt = null;//调用存储过程的新对象
		ResultSet rs = null;
		String sql = "";
		String url = "jdbc:sqlserver://192.168.240.129:1433;DatabaseName=MySchool";
		try {
			Class.forName("com.microsoft.sqlserver.jdbc.SQLServerDriver");
			conn = DriverManager.getConnection(url, "sa", "qaz123");
			sql = "{call proc_findByGradeName(?)}";//{call 存储过程名(参数)}
			//sql = "{call proc_stu}";//无参存储过程
			cstmt = conn.prepareCall(sql);
			//设置参数值,参数的索引是以1为开始
			cstmt.setString(1,"s1");
			//执行存储过程
			rs = cstmt.executeQuery();
			while(rs.next()){
				System.out.println(rs.getString("gradeid"));
				System.out.println(rs.getString("gradename"));
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
