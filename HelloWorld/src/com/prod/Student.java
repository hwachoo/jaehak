package com.prod;

public class Student {
	// 22-123456 문자가 포함됨
	//필드
	String studentNo;
	String studentName;
	int korScore;
	int engScore;

	// method : 기능 함수
	void study(String subject) { // StudentExample.java 확인
		System.out.println(subject + "를 공부합니다.");
	}

	void eat(String food) { // 매개변수
		System.out.println(food + "을 먹습니다.");
	}

	int getKorScore() {
		return korScore;
	}
	
	int getEngScore() {
		return engScore;
	}

}
