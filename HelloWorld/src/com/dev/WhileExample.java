package com.dev;

import java.util.Scanner;

public class WhileExample {
	public static void main(String[] args) {
		//for
		for(int i = 1; i <= 5; i++) {
			System.out.println("i의 값" + i);
		}
		
		//while
		int i = 1; //초기화값
		while(i <= 5) { //조건식
			System.out.println("i의 값" + i);
			i++; //초기화 위치에 따라 값이 다름
		}
		int num = 0;
		while(true) {
			System.out.println("값" + num);
			num++;
			if(num > 5) {
				break; //반복문 종료
			}
		}
		
		
		while(true) {
			int	rand = (int) (Math.random() * 10) +1;
			System.out.println("임의값:" + rand);
			if(rand == 8 ) {
				break;
			}
		}
		Scanner scn = new Scanner(System.in);
		int randomVal, userVal;
		while(true) {
			randomVal = (int) (Math.random() * 5) +1;
			System.out.println("임의 값 입력(1~5)");
			userVal = scn.nextInt();
			
			if(randomVal == userVal) {
				System.out.println("일치합니다.");
				break;
			} else {
				System.out.println("일치하지 않습니다.");
			}
			
		}
		
		System.out.println("end of program");
	}
}
