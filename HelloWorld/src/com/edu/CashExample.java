package com.edu;

import java.util.Scanner;

public class CashExample {
	public static void main(String[] args) {
		Scanner scn = new Scanner(System.in);
		// 2개 값을 입력.
		int price, cash;
		System.out.println("가격을 입력하시오");
		// 가격을 입력하세요...(5500)
		price = scn.nextInt(); //5500원은 부가세 포함된 가격
		System.out.println("금액을 입력하시오");
		//손님이 제시한 금액을 입력하시오
		cash = scn.nextInt(); //10000원 지불
		
		System.out.println("제품 금액" + price + "원");
		System.out.println("지불금액" + cash + "원");
		System.out.println("거스름돈" + (cash - price) + "원");
		System.out.println("부가세" + (price / 10) + "원");
		// 상품의 부가세(10%), 거스름돈
		// 부가세 500원       4500
		
}
}
