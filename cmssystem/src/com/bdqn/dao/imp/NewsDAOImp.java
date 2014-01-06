package com.bdqn.dao.imp;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.Statement;
import java.util.List;

import com.bdqn.dao.INewsDao;
import com.bdqn.domain.News;

public class NewsDAOImp implements INewsDao{
	private Connection conn = null;
	private Statement stmt = null;
	private String sql = "";
	private String url = "jdbc:oracle:thin:@192.168.240.134:1522:ORCL";
	private NewsDAOImp(){
	}
	public static INewsDao getInstance(){
		return new NewsDAOImp();
	}
	@Override
	public boolean insertNews(News news) {
		// TODO Auto-generated method stub
		try {
			Class.forName("oracle.jdbc.driver.OracleDriver");
			conn = DriverManager.getConnection(url,"bdqn", "qaz123");
			stmt = conn.createStatement();
			sql = "insert into news(nid,newstitle,newscontent,cusername,ctime,htmladdr)values("+ news.getNid() +",'"+ news.getNewsTitle() +"','"+ news.getNewsContent() +"','"+ news.getCuserName() +"',to_date('"+ news.getCtime() +"','yyyy-MM-dd HH:mi:ss'),'"+ news.getNewsAddr() +"')";
			System.out.println(sql);
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
	@Override
	public List<News> findByAll() {
		// TODO Auto-generated method stub
		return null;
	}
}
