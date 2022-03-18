package com.dev;

public class AccExample {
	public static void main(String[] args) {
		Account[] accounts;

//		accounts = new Account[] { new Account("1-111", "Hong")//
//				, new Account("1-112", "Hwang")//
//				, new Account("1-113", "Kim")//
//		}; // 이중선언 배열변수 선언
		
		Account a1 = new Account (); //초기화(인스턴스 생성)
		System.out.println(Account.bankName);
		Account.showBankName();
		
		//쉐어하우스 주방, 거실 // 룸
		CalculatorExample.sum(10, 20);
		
		CalculatorExample c1 = new CalculatorExample();
		c1.sum(10, 20);
		
		CalculatorExample.getArea(10);
		
		//static 활용
		
		
	}
}
