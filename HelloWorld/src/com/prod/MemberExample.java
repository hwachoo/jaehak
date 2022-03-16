package com.prod;

public class MemberExample {
	public static void main(String[] args) {
		// int=10; 변수 선언하여 정수 표현 String="김이박"; 변수로 문자 표현
		//변수 하나로 문자와 정수를 표현
		
		Member mem1 = new Member(); //name 및 age의 속성x
		mem1.name = "홍길동";
		mem1.age = 20;
		
		Member mem2 = new Member(); // 초기화
		mem2.name = "김민수";
		mem2.age = 25;
		
		System.out.println("mem의 name속성 " + mem1.name);
		System.out.println("mem의 age속성 " + mem1.age);
		
		Student st1 = new Student();
		st1.studentNo = "22-123456";
		st1.studentName = "아무개";
		st1.korScore = 90;
		st1.engScore = 80;
		
		
	}

}
