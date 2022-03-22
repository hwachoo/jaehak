package com.edu.interfaces;

public interface RemoteControl {
//	public RemoteControl() {
//	인터페이스에서는 생성자(인스턴스)를 사용할 수 없다.	
//	} 생성자(인스턴스) 불가
	
//	private String maxVolume() 필드 생성 불가
	public static final int MAX_VOLUME = 10; //final - 값이 변하지 않음
	public static final int MIN_VOLUME = 0; //상수로 선언
	//final 사용할 경우 인터페이스에서도 사용 가능
	
	public void powerOn(); //추상메소드를 제시할 수밖에 없음
	public void powerOff();	
	

}
