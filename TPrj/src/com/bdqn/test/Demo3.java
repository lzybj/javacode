package com.bdqn.test;

import java.sql.CallableStatement;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;

public class Demo3 {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Connection conn = null;
		CallableStatement cstmt = null;  //调用存储过程专用
		ResultSet rs = null;
		String sql = "";
		String url = "jdbc:sqlserver://192.168.240.129:1433;DatabaseName=MySchool";
		try {
			Class.forName("com.microsoft.sqlserver.jdbc.SQLServerDriver");
			conn = DriverManager.getConnection(url,"sa","qaz123");
			//调用存储过程之前先准备sql语句 ,格式：{call 存储过程名(?,?)}
			sql = "{call proc_stu_ffy2(?,?,?)}";
			cstmt = conn.prepareCall(sql);
			//设置参数值，注意起始索引，1
			cstmt.setInt(1,5);
			cstmt.setInt(2,5);
			//对输出参数的注册（声明）
			cstmt.registerOutParameter(3,java.sql.Types.INTEGER);
			//执行存储过程
			rs = cstmt.executeQuery();
			while(rs.next()){
				System.out.println(rs.getString("stuid"));
				System.out.println(rs.getString("studentno"));
				System.out.println(rs.getString("studentname"));
			}
			/**
			 * 注意：调用有输出参数的存储过程时，一定是先解析结果集，后取输出参数值
			 */
			System.out.println(cstmt.getInt(3));
			rs.close();
			cstmt.close();
			conn.close();
		} catch (Exception e) {
			// TODO: handle exception
			e.printStackTrace();
		}
	}

}
