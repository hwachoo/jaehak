package com.dev;

public class IfExample { // WhichExample - 클래스이름은 항상 대문자(두 단어 합성도 각각), 대소문자 안 가릴 경우 _로 구분
	public static void main(String[] args) {
		// 조건문 - if 
		//60점 이상이면 Pass 미만이면 
		int score = 83;
		if(score > 60) { //중괄호 짝 잘 찾아서 할 것
			System.out.println("Pass");
			
		} else {
			System.out.println("Fail");
		}
		//90점 이상이면 A, 80 B 70 C 60 D 이하 F
		if(score >= 90) {
			if (score >= 95) {
				System.out.println("A+");
			} else {
			System.out.println("A");
			}
		}  else if (score >= 80) {
			if (score >= 85) {
			System.out.println("B+");
			} else {
				System.out.println("B");
			}
		} else if (score >= 70) {
			if (score >= 75) {
				System.out.println("C+");
			}else {
			System.out.println("C");
			}
		} else if (score >= 60) {
			if (score >= 65) {
			System.out.println("D+");
			}	else {
				System.out.println("D");
			}
		} else {
			
			System.out.println("F");
		}
		System.out.println("end of Program");
	}
}
