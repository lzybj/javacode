package com.bdqn.util;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.LinkedList;
import java.util.List;
import java.util.Vector;

import com.bdqn.domain.Product;

public class Demo {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		/**
		 * 1.创建
		 * 2.添加
		 * 3.修改
		 * 4.删除
		 * 5.获得
		 * 6.遍历
		 */
		List<String> data = new ArrayList<String>();//创建
		data.add("1");//添加
		data.add("2");
//		data.set(1, "3");//修改
//		System.out.println(data);
//		data.remove("3");
//		System.out.println(data);
//		////////////
//		List<Product> data2 = new ArrayList<Product>();
//		Product myProduct = new Product(1,"java");
//		Product myProduct2 = new Product(2,"sqlserver");
//		data2.add(myProduct2);
//		data2.add(myProduct);
//		System.out.println(data2.size());
//		//删除
//		Product myProduct3 = new Product(1,"java");
//		for (Product product : data2) {
//			if(product.getProdouctID() == myProduct3.getProdouctID()){
//				data2.remove(product);
//				break;
//			}
//		}
//		System.out.println(data2.size());
//		System.out.println(data2.get(0).getProdouctID());
//		Iterator<Product> it = data2.iterator();
//		//迭代器遍历方式
//		while(it.hasNext()){
//			Product myPro = it.next();
//			System.out.println(myPro.getProductName());
//		}
		////
		LinkedList<String> data3 = new LinkedList<String>();
		data3.add("1");
		data3.add("2");
		data3.add("3");
		data3.add(1,"4");
		data3.addAll(data);
		System.out.println(data3);
//		Vector<String> vect = new Vector<String>();
	}
	

}
