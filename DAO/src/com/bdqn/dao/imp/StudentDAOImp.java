package com.bdqn.dao.imp;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.Statement;

import com.bdqn.dao.IStudentDAO;
import com.bdqn.domain.Student;

public class StudentDAOImp implements IStudentDAO {
	private Connection conn = null;
	private Statement stmt = null;
	private ResultSet rs = null;
	private String sql = "";
	private String url = "jdbc:oracle:thin:@192.168.240.134:1522:ORCL";
	private StudentDAOImp(){
	}
	public static IStudentDAO getStudentDAOImp(){
		return new StudentDAOImp();
	}
	@Override
	public boolean insertStudent(Student parStudent) {
		// TODO Auto-generated method stub
		try {
			Class.forName("oracle.jdbc.driver.OracleDriver");
			conn = DriverManager.getConnection(url, "bdqn","qaz123");
			stmt = conn.createStatement();
			sql = "insert into students(stuid,stuno,stuname,stupwd,stuage,stusex,regtime)" +
					"values(seq_stuid.nextval,'"+parStudent.getStuNo()+"'," +
							"'"+ parStudent.getStuName() +"','"+ parStudent.getStuPwd() +"'" +
									","+ parStudent.getStuAge() +"" +
											","+ parStudent.getStuSexInt() +",sysdate)";
			int flag = stmt.executeUpdate(sql);
			if(flag > 0){
				return true;
			}
		} catch (Exception e) {
			// TODO: handle exception
			e.printStackTrace();
		}finally{
			try {
				if(stmt != null){
					stmt.close();
				}
				if(conn != null){
					conn.close();
				}
			} catch (Exception e2) {
				// TODO: handle exception
				e2.printStackTrace();
			}
		}
		return false;
	}

	@Override
	public Student findByStuNo(String parStuNo) {
		// TODO Auto-generated method stub
		try {
			Class.forName("oracle.jdbc.driver.OracleDriver");
			conn = DriverManager.getConnection(url, "bdqn","qaz123");
			stmt = conn.createStatement();
			sql = "select stuid,stuno,stuname,stupwd,stuage,decode(stusex,0,'Å®',1,'ÄÐ','ÆäËû') stusex,to_char(regtime,'yyyy-MM-dd') regtime " +
					"from students where stuno = '"+ parStuNo +"'";
			rs = stmt.executeQuery(sql);
			if(rs.next()){
				int stuid = rs.getInt("stuid");
				String stuno = rs.getString("stuno");
				String stuname = rs.getString("stuname");
				String stupwd = rs.getString("stupwd");
				int stuage = rs.getInt("stuage");
				String stusex = rs.getString("stusex");
				String regtime = rs.getString("regtime");
				return new Student(stuid, stuno, stuname, stupwd, stuage, stusex, regtime);
			}
		} catch (Exception e) {
			// TODO: handle exception
			e.printStackTrace();
		}finally{
			try {
				if(rs != null){
					rs.close();
				}
				if(stmt != null){
					stmt.close();
				}
				if(conn != null){
					conn.close();
				}
			} catch (Exception e2) {
				// TODO: handle exception
				e2.printStackTrace();
			}
		}
		return null;
	}

}
