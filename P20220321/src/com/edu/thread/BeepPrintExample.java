package com.edu.thread;

import java.awt.Toolkit;

class BeepTask implements Runnable {

	@Override
	public void run() {

	}

}

//process(여지껏 main쓰레드 통해 병렬처리x, 싱글쓰레드로 처리해옴)
public class BeepPrintExample {
	public static void main(String[] args) {

		// thread 생성법
		// Thread 클래스의 생성자 매개값으로 Runnable 인터페이스 구현한 객체
//		Thread thread = new Thread(new BeepTask()); //1번 방법

		// Runnable 인터페이스의 익명구현객체를 생성
		// thread클래스 생성자 매개값으로 사용
		Thread thread = new Thread(()/* 생성자 - 초기화 */ -> {
			
			Toolkit toolkit = Toolkit.getDefaultToolkit();
			for (int i = 0; i <= 5; i++) {
				toolkit.beep(); // 비프음
				try { // Thread는 try/catch를 해줘야함
					Thread.sleep(500);// 1/1000초 단위로 간격을 줌
				} catch (InterruptedException e) {
					e.printStackTrace();
				}
			}

		});
		thread.start();// 쓰레드 시작

		for (int i = 0; i < 5; i++) {
			System.out.println("beep");
			try {
				Thread.sleep(500);
			} catch (InterruptedException e) {
				e.printStackTrace();
			}
		}
		System.out.println("end of prog");
	}
}
