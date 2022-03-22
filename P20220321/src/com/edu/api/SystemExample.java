package com.edu.api;

public class SystemExample {
	public static void main(String[] args) {
		
		System.out.println("strat");
//		System.exit(0); //프로그램 강제종료
		System.out.println("end");
		
		long currentTime = System.currentTimeMillis(); //현재시간을 1970.1.1 ~ 현재날짜 ms단위로
		System.out.println(currentTime);
		//24*60*60*1000 => 하루
		long days = currentTime/(24*60*60*1000);
		System.out.println(days); //19073이 하루
		long years = 19073/365;
		System.out.println(years); //52년

		
		currentTime = System.currentTimeMillis();
		long sum = 0;
		for(int i = 0; i < 10000000; i++) {
			sum += i;
		}
		System.out.println("summary" + sum);
		long endTime = System.currentTimeMillis();
		
		System.out.println("연산 경과 시간: " + (endTime - currentTime) + "(msec)");
	}

}
