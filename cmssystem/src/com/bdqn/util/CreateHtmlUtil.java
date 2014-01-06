package com.bdqn.util;

import java.io.BufferedWriter;
import java.io.File;
import java.io.FileWriter;
import java.io.PrintWriter;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.List;
import java.util.Random;

import com.bdqn.domain.News;

public class CreateHtmlUtil {
	private static File file = null;
	private static FileWriter fileWriter = null;
	private static BufferedWriter bufferedWriter = null;
	private static PrintWriter out = null;
	public static String createHtml(News news){
		String filePath = "html/"+ getNowTime() +"-"+ getRand() +".html";
		try {
			file = new File(filePath);
			fileWriter = new FileWriter(file,true);
			bufferedWriter = new BufferedWriter(fileWriter);
			out = new PrintWriter(bufferedWriter);
            out.println("<!DOCTYPE html PUBLIC '-//W3C//DTD XHTML 1.0 Transitional//EN' 'http://www.w3.org/TR/xhtml1/DTD/xhtml1-transitional.dtd'>");
			out.println("<html xmlns='http://www.w3.org/1999/xhtml'>");
			out.println("<head>");
			out.println("<meta http-equiv='Content-Type' content='text/html; charset=gb2312' />");
			out.println("<title>"+ news.getNewsTitle() +"</title>");
			out.println("</head>");
			out.println("<body>");
			out.println("<table width='431' height='315' border='3'>");
			out.println("<tr>");
			out.println("<th width='112' scope='col'>新闻ID</th>");
			out.println("<th width='299' scope='col'>"+news.getNid()+"</th>");
			out.println("</tr>");
			out.println("<tr>");
			out.println("<td>新闻标题</td>");
			out.println("<td>"+ news.getNewsTitle() +"</td>");
			out.println("</tr>");
			out.println("<tr>");
			out.println("<td>新闻内容</td>");
			out.println("<td>"+ news.getNewsContent() +"</td>");
			out.println("</tr>");
			out.println("<tr>");
			out.println("<td>新闻时间</td>");
			out.println("<td>"+ news.getCtime() +"</td>");
			out.println("</tr>");
			out.println("<tr>");
			out.println("<td>发布人</td>");
			out.println("<td>"+ news.getCuserName() +"</td>");
			out.println("</tr>");
			out.println("</table>");
			out.println("</body>");
			out.println("</html>");			
			
			out.close();
			bufferedWriter.close();
			fileWriter.close();
		} catch (Exception e) {
			// TODO: handle exception
			e.printStackTrace();
		}
		return filePath;
	}
	private static String getNowTime(){
		Date now = new Date();
		SimpleDateFormat sdf = new SimpleDateFormat("yyyy-MM-dd");
		return sdf.format(now);
	}
	private static String getRand(){
		String randStr = "";
		for (int i = 0; i < 4; i++) {
			int rand = (int)(Math.random()*10);
			randStr = randStr + rand;
		}		
		return randStr;
	}
	public void ttt(List<String> li){
		li.add("1");
	}
}
