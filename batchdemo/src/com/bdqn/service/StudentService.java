package com.bdqn.service;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.Statement;
import java.util.ArrayList;
import java.util.List;

import com.bdqn.domain.Student;

public class StudentService {
	private Connection conn = null;
	private Statement stmt = null;
	private ResultSet rs = null;
	private String sql = "";
	private String url = "jdbc:sqlserver://192.168.240.129:1433;DatabaseName=MySchool";
	private List<Student> data = new ArrayList<Student>();
	/**
	 * 通过学员名返回其生日
	 * @param parStudentName
	 * @return
	 */
	private String findByStudentName(String parStudentName){
		try {
			Class.forName("com.microsoft.sqlserver.jdbc.SQLServerDriver");
			conn = DriverManager.getConnection(url,"sa","qaz123");
			stmt = conn.createStatement();
			sql = "select borndate from student where studentname = '"+parStudentName+"'";
			rs = stmt.executeQuery(sql);
			if(rs.next()){
				return rs.getString("borndate");
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
		return "";
	}
	public List<Student> findByBornday(String parStudentName){
		//判断是否取到生日
		String bornday = this.findByStudentName(parStudentName);
		if(bornday.equals("")){
			return null;
		}
		try {
			Class.forName("com.microsoft.sqlserver.jdbc.SQLServerDriver");
			conn = DriverManager.getConnection(url,"sa","qaz123");
			stmt = conn.createStatement();
			sql = "select studentno,studentname,sex,borndate from student where borndate > '"+ bornday +"'";
			rs = stmt.executeQuery(sql);
			while(rs.next()){
				Student myStu = new Student(rs.getString("studentno"),rs.getString("studentname"),rs.getString("sex"),rs.getString("borndate"));
				data.add(myStu);
			}
			return data;
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
		return null;
	}
	//批处理操作
	public boolean executeAll(List<Student> parData){
		try {
			Class.forName("com.microsoft.sqlserver.jdbc.SQLServerDriver");
			conn = DriverManager.getConnection(url,"sa","qaz123");
			//设置为非自动提交
			conn.setAutoCommit(false);
			stmt = conn.createStatement();
			for (Student student : parData) {
				sql = "insert into temp(studentno,studentname,sex,borndate)values('"+ student.getStudentNo() +"','"+ student.getStudentName() +"','"+ student.getSex() +"','"+ student.getBornday() +"')";
				stmt.addBatch(sql);//添加到batch中
			}
			int[] flags = stmt.executeBatch();
			//分析是否全部成功，如果全部成功，则手动提交(commit)，否则，则回滚
			boolean isCommit = true;
			for (int i = 0; i < flags.length; i++) {
				//此段代码模拟失败的效果，其实，无意义
				if(i == 3){
					flags[i] = 0;
				}
				
	           /////////////////
				if(flags[i] <= 0){//其中的一条执行失败的处理
					isCommit = false;
					break;
				}
			}
			//判断是否提交还是回滚
			if(isCommit){//提交
				conn.commit();
			}else{//回滚
				conn.rollback();
			}
			return true;
		} catch (Exception e) {
			// TODO: handle exception
			e.printStackTrace();
		}finally{
			try {
				stmt.close();
				conn.close();
			} catch (Exception e2) {
				// TODO: handle exception
				e2.printStackTrace();
			}
		}
		return false;
	}
	public static void main(String[] args) {
		StudentService ss = new StudentService();
		System.out.println(ss.executeAll(ss.findByBornday("白燕")));
	}
}
