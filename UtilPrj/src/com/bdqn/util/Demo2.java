package com.bdqn.util;

import java.util.HashSet;
import java.util.Iterator;
import java.util.TreeSet;

public class Demo2 {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		HashSet<String> hs = new HashSet<String>();
		hs.add("1");
		hs.add("3");
		hs.add("2");
		hs.add("4");
		hs.add("3");
//		hs.add(null);
		//foreach
//		for (String string : hs) {
//			System.out.println(string);
//		}
//		Iterator<String> it = hs.iterator();
//		while(it.hasNext()){
//			System.out.println(it.next());
//		}
		System.out.println(hs);
		TreeSet<String> ts = new TreeSet<String>();
		ts.addAll(hs);
		ts.add("11");
		ts.add("22");
		ts.add("21");
		ts.add("41");
		ts.add("54");
		ts.add("5");
		System.out.println(ts);
	}

}
