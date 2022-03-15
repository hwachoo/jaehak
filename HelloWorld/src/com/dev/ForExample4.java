package com.dev;

public class ForExample4 {
	public static void main(String[] args) {
		// 1 ~ 10 수 중에서 짝수 값 => evensum, 홀수 값 -> oddsum
		int evensum, oddsum; // 변수 선언
		evensum = oddsum = 0; //변수 초기값 할당(초기화)
		
		for(int i = 1; i <= 10; i++) {
			if(i % 2 ==0) {
				evensum += i;
			} else {	
			System.out.println(i);
				oddsum += i;

		}
	}
		System.out.println("짝수의 합" + evensum);
		System.out.println("홀수의 합" + oddsum);
	}
}