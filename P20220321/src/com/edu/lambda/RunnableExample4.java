package com.edu.lambda;

interface Runnable4 {
	public int run(); //매개값 없음
}
public class RunnableExample4 {
	public static void main(String[] args) {
		Runnable4 runnable = () -> {
			return (int) (Math.random() * 10);	
		};
		int result = runnable.run();
		System.out.println(result);
		
		
		//함수적인 프로그램 작성
		runnable = () -> {
			return (int) (Math.random() * 100);	
		};
		result = runnable.run();
		System.out.println(result);
	}
}
