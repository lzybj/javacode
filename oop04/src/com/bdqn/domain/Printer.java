package com.bdqn.domain;

import java.util.ArrayList;

import com.bdqn.inf.IPaper;
import com.bdqn.inf.InkBox;

public class Printer {
	public void Print(InkBox inkbox,IPaper paper){
		System.out.println("用" + inkbox.getColor() + "打印" + paper.paperSize());
	}
	public void Print(InkBox inkbox,ArrayList<IPaper> papers){
		for (IPaper iPaper : papers) {
			System.out.println("用" + inkbox.getColor() + "打印" + iPaper.paperSize());			
		}
	}
	
}
