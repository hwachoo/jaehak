package com.edu.interfaces;

public class MainExe {
	public static void main(String[] args) {
		RemoteControl rm = new TV();
		rm.powerOn();
		rm.powerOff();
		
		rm = new Radio();
		rm.powerOn();
		rm.powerOff();
		
		rm = new Refrigerator();
		rm.powerOn();
		rm.powerOff();
	}

}
