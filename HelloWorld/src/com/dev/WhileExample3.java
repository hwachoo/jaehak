package com.dev;

import java.util.Scanner;

public class WhileExample3 {
	public static void main(String[] args) {
		// 입력받은 값(계속)
		//-1 값 입력하면 입력종료
		//sum 값에 입력
		Scanner scn = new Scanner(System.in);
		int sum = 0, inputVal;
		
		while(true) {
			System.out.println("숫자를 입력하시오");
			inputVal=scn.nextInt();
			
			if(inputVal == -1) {
			break;
		}
			sum= sum + inputVal;
	}
		System.out.println("합계" + sum);

}
}