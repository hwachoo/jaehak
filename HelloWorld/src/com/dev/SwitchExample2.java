package com.dev;

public class SwitchExample2 {
	public static void main(String[] args) {
		// 90점 a 80 b 70 c 60 d f
		
		int score = 23; // 하나의 값
		
		switch (score / 10){
		case 9:
			System.out.println("A");
			break;
		case 8:
			System.out.println("B");
			break;
		case 7:
			System.out.println("C");
			break;
		case 6:
			System.out.println("D");
			break;
		default:
			System.out.println("F");
		}
	}
}
