package com.edu.interfaces;

public class Refrigerator implements RemoteControl {
	public void On() {
		System.out.println("냉장고를 켭니다.");
	}
	public void Off() {
		System.out.println("냉장고를 끕니다.");
	}
	@Override
	public void powerOn() {
		System.out.println("냉장고를 켭니다.");
		
	}
	@Override
	public void powerOff() {
		System.out.println("냉장고를 끕니다.");
		
	}

}
