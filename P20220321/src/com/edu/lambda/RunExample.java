package com.edu.lambda;

interface Runnable {
	public void run();
}

class RunImpl implements Runnable {

	@Override
	public void run() {
		System.out.println("run...");
	}

}

public class RunExample {
	public static void main(String[] args) {
		// 람다표현식 (String s) -> {구현코드};

		Runnable runnable = new RunImpl();
		runnable.run();

		runnable = new Runnable() {

			@Override
			public void run() {
				System.out.println("호랑이가 달립니다.");
			}
		}; // 익명구현객체
		runnable.run();
		//람다식
		runnable = () -> {System.out.println("사자가 달립니다."); };
		runnable.run();

	}
}
