package com.bdqn.test;

import java.util.ArrayList;

import com.bdqn.domain.MouseUsb;
import com.bdqn.domain.PC;
import com.bdqn.domain.SoundUsb;
import com.bdqn.domain.UPan;
import com.bdqn.inf.IUsb;

public class Demo {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		IUsb myMouse = new MouseUsb();
//		myMouse.inputData();
//		myMouse.outputData();
//		((MouseUsb)myMouse).click();
		IUsb mySound = new SoundUsb();
		IUsb myUpan = new UPan();
		ArrayList<IUsb> usbs = new ArrayList<IUsb>();
		usbs.add(myMouse);
		usbs.add(mySound);
		usbs.add(myUpan);
		PC mypc = new PC();
		mypc.usbPort(usbs);
	}

}
