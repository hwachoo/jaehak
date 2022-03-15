package com.dev;

public class WhileExample2 {
	public static void main(String[] args) {
		// 1~10 짝수 출력
		// while 이용
		int i = 1;
		while (i <= 10) {
			if(i % 2 == 0 ) {
				System.out.println("i의 값" + i);
			}
			i++; //증감식
		}

	}
}
