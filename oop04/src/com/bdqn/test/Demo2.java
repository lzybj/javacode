package com.bdqn.test;

import java.util.ArrayList;
import java.util.List;

import com.bdqn.domain.A4Paper;
import com.bdqn.domain.CaiSeInkBox;
import com.bdqn.domain.Printer;
import com.bdqn.inf.IPaper;
import com.bdqn.inf.InkBox;

public class Demo2 {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		InkBox color = new CaiSeInkBox();
		IPaper a4 = new A4Paper();
		Printer myprinter = new Printer();
		myprinter.Print(color, a4);
		List<String> xx = new ArrayList<String>();
	}

}
