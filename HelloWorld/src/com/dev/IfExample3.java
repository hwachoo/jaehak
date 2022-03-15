package com.dev;

import java.util.Scanner;

public class IfExample3 {
	public static void main(String[] args) {
		Scanner scn = new Scanner(System.in);
		int num, ranVal = (int) (Math.random() * 3) + 1; //0 ~1사이 임의의 실수 작성
		
		//1~3 중 임의의 값 입력하여 ranVal이 같을 경우
		//정답 출력, 틀렸을 경우 오답
		System.out.println("1~3 사이의 수를 입력하시오");
		num = scn.nextInt();
		
		System.out.println(ranVal);
		
		if (num == ranVal) { //비교로 해야 됨
			System.out.println("정답입니다.");
		} else {
			System.out.println("오답입니다.");
		}
		scn.close();
		
	}
}
