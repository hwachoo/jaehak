package com.edu.thread;

import java.awt.Toolkit;
//멀티 쓰레드
class BeepThread extends Thread {

	@Override
	public void run() {
		Toolkit toolkit = /* 생성자 - 초기화 */ Toolkit.getDefaultToolkit();
		for (int i = 0; i <= 5; i++) {
			toolkit.beep(); // 비프음
			try { // Thread는 try/catch를 해줘야함
				Thread.sleep(500);// 1/1000초 단위로 간격을 줌
			} catch (InterruptedException e) {
				e.printStackTrace();
			}
		}
	}
}

public class BeepPrintExample2 {
	public static void main(String[] args) {
		// 비프음 출력
		//thread클래스 상속받는 클래스 선언.run메소드 오버라이딩
		Thread thread = new BeepThread();
		thread.start();
				

		// beep 출력
		for (int i = 0; i < 5; i++) {
			System.out.println("beep");
			try {
				Thread.sleep(500);
			} catch (InterruptedException e) {
				e.printStackTrace();
			}
		}
		System.out.println("end of prog");
		// 멀티쓰레드로 출력

	}
}
