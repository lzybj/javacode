package com.bdqn.service;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.Statement;
import java.util.ArrayList;
import java.util.List;

import com.bdqn.domain.TBLMessage;
import com.bdqn.domain.TBLUsers;

public class MessageService {
	private Connection conn = null;
	private Statement stmt = null;
	private ResultSet rs = null;
	private String sql = "";
	private String url = "jdbc:oracle:thin:@192.168.240.134:1522:ORCL";
	public boolean addMessage(TBLUsers user,TBLMessage message){
		try {
			Class.forName("oracle.jdbc.driver.OracleDriver");
			conn = DriverManager.getConnection(url,"bdqnst03","qaz123");
			stmt = conn.createStatement();
			sql = "insert into tbl_message(mid,uname,messagecontent)values(SEQ_TBL_MESSAGE.nextval,'"+ user.getuName() +"','"+ message.getMessageContent() +"')";
			int flag = stmt.executeUpdate(sql);
			if(flag > 0){
				return true;
			}
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
	
	public List<TBLMessage> findByUName(String uName){
		List<TBLMessage> data = new ArrayList<TBLMessage>();
		try {
			Class.forName("oracle.jdbc.driver.OracleDriver");
			conn = DriverManager.getConnection(url,"bdqnst03","qaz123");
			stmt = conn.createStatement();
			sql = "select * from tbl_message where uname like '%"+ uName +"%'";
			rs = stmt.executeQuery(sql);
			while(rs.next()){
				int mid = rs.getInt("mid");
				String uname = rs.getString("uname");
				String messagecontent = rs.getString("messagecontent");
				String posttime = rs.getString("posttime");
				data.add(new TBLMessage(mid, uname, messagecontent, posttime));
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
		return data;
	}
	public static void main(String[] args) {
		MessageService ms = new MessageService();
		List<TBLMessage> data = ms.findByUName("l");
		for (TBLMessage tblMessage : data) {
			System.out.println(tblMessage.getPostTime());
		}
	}
}
