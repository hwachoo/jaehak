package com.edu; //scanner - 

import java.util.Scanner;

public class ScannerExample {  // 패키지명과 스캐너이름 합침 'com.edu.ScannerExample'
	public static void main(String[] args) {
		Scanner scn = new Scanner(System.in); //키보드 입력기능 'System.in)
		
//		System.out.println("첫번째 숫자를 입력하세요..");
//		int val = scn.nextInt();//사용자가 입력한 값을 읽어들임 'netxInt'
//		System.out.println("두번째 숫자를 입력하세요..");
//		int val2 = scn.nextInt();
//		int result = val + val2;
		
		System.out.println("두 수의 합은 " + (10 + 20) + "입니다.");
		
//		if(val % 2 == 0) {
//			System.out.println("짝수입니다.");
//		}
//		if(val % 2 == 1) {
//			System.out.println("홀수입니다.");
//		}
		scn.close();
	}
}
