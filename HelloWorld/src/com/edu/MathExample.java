package com.edu;

import java.util.Scanner;

public class MathExample {
	public static void main(String[] args) {
		Scanner scn = new Scanner(System.in);
		int num1, num2, n1, n2, n3, n4 ;
		System.out.println("첫번째 수를 입력하시오");
		num1 = scn.nextInt();
		System.out.println("두번째 수를 입력하시오");
		num2 = scn.nextInt();
		n1 = num1 + num2;
		n2 = num1 - num2;
		n3 = num1 * num2;
		n4 = num1 / num2;
		double n5 = num1 % num2;
		
		System.out.println("합" + n1);
		System.out.println("차" + n2);
		System.out.println("곱" + n3);
		System.out.println("몫" + n4);
		System.out.println("나머지" + n5);
	
}
}
