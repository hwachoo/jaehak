package com.prod;

public class StudentExample {
	public static void main(String[] args) {
		Student s1 = new Student();
		s1.studentName = "아무개";
		s1.korScore = 80;
		s1.engScore = 85;
		s1.study("영어");
	//	String st1 = s1.eat("급식"); //void가 반환하는 값이 없음
		s1.eat("간식");
		
		int v1 = s1.getKorScore();
		int v2 = s1.getEngScore();
		System.out.println("국어" + v1);
		System.out.println("영어" + v2);
		
	}
	

	}

