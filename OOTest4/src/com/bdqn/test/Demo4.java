package com.bdqn.test;

import com.bdqn.domain.DotMatrixPrinter;
import com.bdqn.domain.LnkpetPrinter;
import com.bdqn.domain.Printer;
import com.bdqn.service.BankSystem;

public class Demo4 {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Printer dotMatrixPrinter = new DotMatrixPrinter();
		Printer lnkpetPrinter = new LnkpetPrinter();
		BankSystem bankSystem = new BankSystem();
		bankSystem.shouju(dotMatrixPrinter);
		bankSystem.shouju(lnkpetPrinter);
	}

}
