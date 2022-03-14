package com.edu;

import java.util.Scanner;

public class TemperatureExample {
	public static void main(String[] args) {
		// C = 5/9*(F-32) 화씨온도를 섭씨온도로 변경하는 규칙
		Scanner scn = new Scanner(System.in);
		double fDeg, cDeg; //변수선언
		System.out.println("화씨온도를 입력하시오.");
		fDeg = scn.nextDouble(); //입력한 값을 읽어옴
		cDeg = (double) 5/9 * (fDeg - 32); 
		System.out.println(cDeg);
		
		if(cDeg > 30.0) {
			System.out.println("오늘은 더운 날씨네요");
		} else {
			System.out.println("살만하네요");
		}
		
		
		//30.0 보다 크면 "오늘은 더운 날씨네요"
		//그보다 적으면 "살만하네요"
}
}
