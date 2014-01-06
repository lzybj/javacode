package com.bdqn.service;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.util.ArrayList;
import java.util.List;

import com.bdqn.domain.Emp;

public class EmpServcie {
	private Connection conn = null;
	private PreparedStatement pstmt = null;
	private ResultSet rs = null;
	private String sql = "";
	private String url = "jdbc:oracle:thin:@192.168.240.134:1522:ORCL";
	
	public int getPageTotal(){
		try {
			Class.forName("oracle.jdbc.driver.OracleDriver");
			conn = DriverManager.getConnection(url,"scott","tiger");
			sql = "select count(*) pagetotal from emp";
			pstmt = conn.prepareStatement(sql);
			rs = pstmt.executeQuery();
			if(rs.next()){
				int dataSize = rs.getInt("pagetotal");
				if((dataSize % 5) == 0){
					return dataSize / 5;
				}else{
					return (dataSize / 5) + 1;
				}
			}
		} catch (Exception e) {
			// TODO: handle exception
			e.printStackTrace();
		}finally{
			try {
				rs.close();
				pstmt.close();
				conn.close();
			} catch (Exception e2) {
				// TODO: handle exception
				e2.printStackTrace();
			}
		}
		return 0;
	}
	
	public List<Emp> fenYe(int nowPage){
		List<Emp> data = new ArrayList<Emp>();
		try {
			Class.forName("oracle.jdbc.driver.OracleDriver");
			conn = DriverManager.getConnection(url,"scott","tiger");
			sql = "select empno,ename from (select rownum mynum,empno,ename from emp) newemp " +
					"where newemp.mynum > ? and newemp.mynum <= ?";
			pstmt = conn.prepareStatement(sql);
			pstmt.setInt(1,(nowPage - 1) * 5);
			pstmt.setInt(2,nowPage * 5);
			rs = pstmt.executeQuery();
			while(rs.next()){
				String empNo = rs.getString("empno");
				String ename = rs.getString("ename");
				Emp myemp = new Emp(empNo, ename);
				data.add(myemp);
			}
		} catch (Exception e) {
			// TODO: handle exception
			e.printStackTrace();
		}finally{
			try {
				rs.close();
				pstmt.close();
				conn.close();
			} catch (Exception e2) {
				// TODO: handle exception
				e2.printStackTrace();
			}
		}
		return data;
	}
	public static void main(String[] args) {
		EmpServcie es = new EmpServcie();
		System.out.println(es.getPageTotal());
	}
}
