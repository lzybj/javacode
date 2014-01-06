package com.bdqn.domain;

import java.util.ArrayList;

import com.bdqn.inf.IUsb;

public class PC {
	public void usbPort(IUsb usb){
		usb.outputData();
		usb.inputData();
	}
	public void usbPort(ArrayList<IUsb> usbs){
		for (IUsb iUsb : usbs) {
			iUsb.inputData();
			iUsb.outputData();
		}
	}
	
}
