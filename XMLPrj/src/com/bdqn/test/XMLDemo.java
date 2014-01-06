package com.bdqn.test;

import javax.xml.parsers.DocumentBuilder;
import javax.xml.parsers.DocumentBuilderFactory;

import org.w3c.dom.Document;
import org.w3c.dom.Element;
import org.w3c.dom.NodeList;

public class XMLDemo {

	/**
	 * @param args
	 */
	public static void main(String[] args) throws Exception{
		// TODO Auto-generated method stub
		DocumentBuilderFactory dbf = DocumentBuilderFactory.newInstance();
		DocumentBuilder db = dbf.newDocumentBuilder();
		Document doc = db.parse("Students.xml");
//	    NodeList students = doc.getElementsByTagName("student");
//	    for (int i = 0; i < students.getLength(); i++) {
//	    	   	Element student = (Element)students.item(i);
		//取属性
//	    	   	System.out.println(student.getAttribute("stuid"));
        //取stuno节点的值节点
		//	    	   	System.out.println(student.getElementsByTagName("stuno").item(0).getFirstChild().getNodeValue());
        //取stuname节点的值节点
		//	    	   	System.out.println(student.getElementsByTagName("stuname").item(0).getFirstChild().getNodeValue());
//		}
		//获取stuname标签的节点集合
		NodeList stunames = doc.getElementsByTagName("stuname");
		for (int i = 0; i < stunames.getLength(); i++) {
			System.out.println(stunames.item(i).getFirstChild().getNodeValue());
		}
	}

}
