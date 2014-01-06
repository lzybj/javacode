package com.bdqn.test;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.Statement;

public class Demo {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Connection conn = null;//连接对象
		Statement stmt = null;//数据传输对象
		//java:sqlserver://数据库IP:端口号;DatabaseName=数据库名
		//localhost  127.0.0.1
		//String url = "jdbc:sqlserver://localhost:1433;DatabaseName=MySchool";
		//String url = "jdbc:sqlserver://127.0.0.1:1433;DatabaseName=MySchool";
		String url = "jdbc:sqlserver://192.168.240.129:1433;DatabaseName=Myschool";//连接串
		String dbuser = "sa";
		String dbpwd = "qaz123";
		try {
			//1.加载数据库驱动类
			Class.forName("com.microsoft.sqlserver.jdbc.SQLServerDriver");
			//2.生成连接(Connection)
			conn = DriverManager.getConnection(url, dbuser, dbpwd);
			//3.创建数据传输通道对象(Statement)
			stmt = conn.createStatement();
			//4.操作数据库
			String sql = "insert into grade(gradename)values('测试年级')";
			//执行SQL
			int flag = stmt.executeUpdate(sql);
			if(flag > 0){
				System.out.println("插入成功！");
			}else{
				System.out.println("插入失败！");
			}
			stmt.close();//关闭
			conn.close();//关闭
			
			System.out.println("OK");
		} catch (Exception e) {
			// TODO: handle exception
			e.printStackTrace();
		}
	}

}
