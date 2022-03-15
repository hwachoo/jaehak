package com.dev;

import java.util.Scanner;

public class ForExample3 {
	public static void main(String[] args) {
		// 입력받는 두 수를 num1,2
		// num1과 num2 사이의 수를 합
		Scanner scn = new Scanner(System.in);
		int num1, num2;
		
		System.out.println("수를 입력하시오");
		num1=scn.nextInt();
		System.out.println("수를 입력하시오");
		num2=scn.nextInt();
		int sum = 0;
		int startCnt=num1;
		int lastCnt=num2;
		for(int i=startCnt; i<=lastCnt; i++) {
			//System.out.println(i);
			sum= sum + i;
			
		}
		System.out.println("합계" + sum);
		scn.close();
	}
}
