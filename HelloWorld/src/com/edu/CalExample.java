package com.edu;

import java.util.Scanner;

public class CalExample {
	public static void main(String[] args) {
		Scanner scn = new Scanner(System.in); // % = 나머지값 연산자
		int hour, minute, second, inputVal; //inputVal = 입력값
		
		System.out.println("초 단위 입력(ex 150)");
		inputVal = scn.nextInt();
		hour = inputVal / 3600; //5000/3600 => 1 (1400sc)
		minute = (inputVal % 3600) / 60; //1400 / 60 => 23mn
		second = (inputVal % 3600) % 60; // 1400 % 60 => 20sc
				
		System.out.println(inputVal + "초는" + hour + "시간" + minute + "분" + second + "초");
		
		scn.close();
	}

}
