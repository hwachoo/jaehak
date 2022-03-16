package com.prod;

public class ReferenceExample {
	public static void main(String[] args) {
		//참조타입 vs 기본타입
		int num1 = 10; //리터럴
		int num2 = 10;
		 //int정수표현대표타입, double소수표현대표타입, (byte, shrot, long, float, char, booelan)
		 //상기는 기본 데이터타입
		System.out.println(num1);
		System.out.println(num2);
		System.out.println(num1 == num2); //true
		
		String str1 = new String("hello");
		String str2 = new String("hello");
		
		System.out.println(str1); //123afbc35  
		System.out.println(str2); //ab3af3ch5
		System.out.println(str1 == str2); // 주소 값 비교로 비교연산자 시 false 출력
		System.out.println(str1.equals(str2)); // 해당 클래스가 취하게 되는 값을 비교
		
	}
}
