package com.dev;

import java.util.Scanner;

public class WorkExample2 {
	public static void main(String[] args) {
		Scanner scn = new Scanner(System.in);
		int num1, num2, num3;

		
		System.out.println("수를 입력하시오");
		num1 = scn.nextInt();
		System.out.println("수를 입력하시오");
		num2 = scn.nextInt();
		System.out.println("수를 입력하시오");
		num3 = scn.nextInt();
		
		if(num1 > num2) {
			int tmp = num1;
			num1 = num2;
			num2 = tmp;
		}
		if(num1 > num3 ) {
			int tmp = num1;
			num1 = num3;
			num3 = tmp;
		}
		if(num2 > num3) {
			int tmp = num2;
			num2 = num3;
			num3 = tmp;
		}
		System.out.println("각 수의 순서는" + num1 + num2 + num3);
		}

			
	}
	
	
	
