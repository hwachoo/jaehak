package com.dev;

import java.util.Scanner;

public class SwitchExample {
	public static void main(String[] args) {
		// 가위(1)바위(2)보(3)
		Scanner scn = new Scanner(System.in);
		int ranVal = (int) (Math.random() * 3) + 1;
		
//		System.out.println("입력하시오");
//		
//		if(ranVal == 1) {
//			System.out.println("가위");
//		} else if (ranVal == 2) {
//			System.out.println("바위");
//		} else {
//			System.out.println("보");
//		} 
//		
		switch(ranVal) {
		case 1:
			System.out.println("가위");
			break;
		case 2:
			System.out.println("바위");
			break;
		case 3:
			System.out.println("보");
		}
		
		System.out.println("end of program");
	}
}
