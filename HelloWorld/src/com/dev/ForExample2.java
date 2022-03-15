package com.dev;

public class ForExample2 {
	public static void main(String[] args) {
		// for 반복문 사용하여 

//		System.out.println(1);
//		System.out.println(2);
//		System.out.println(3);
		
		int sum = 0;
		int startCnt = 11;
		int lastCnt = 20;
		for(int i=startCnt; i <= lastCnt; i++) {
			if(i % 2 == 0) {//0은 짝수, 1은 홀수
				System.out.println(i);
				sum += i;
			}
	}
		System.out.println("짝수의 합" + sum);
		
	}
}
