package com.dev;

import java.util.Scanner;

public class IfExample2 {
	public static void main(String[] args) {
		Scanner scn = new Scanner(System.in);
		int price;
		
		System.out.println("금액을 입력하시오");
		price = scn.nextInt();
		
		if (price >= 50000) {
			System.out.println("결제금액은" + price + "입니다.");
		} else {
			System.out.println("결제금액은" + (price + 3000) + "입니다.");
			scn.close();
		}
		// 물건가격 50000 이상 배송비 0
		// 그 외 배송비 3000
		
		//결제금액 출력 코드 작성
		
		//스캐너로 입력, 
	}
}
