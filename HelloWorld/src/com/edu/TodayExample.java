package com.edu;
// 이름 입력(String) -> scn.nextLine();
// 연락처 입력(String) -> scn.nextLine();
// 나이 입력(int) -> scn.nextInt();
// 키 입력(double) -> scn.nextDouble();

import java.util.Scanner;

//이름 : 입력값
//연락처 : 
//나이 : ??세
//키 : ???.?cm
// 적정몸무게 : (키 - 100) * 0.9 -> 60.3보다 크면 과체중, 작으면 저체중
public class TodayExample {
	public static void main(String[] args) {
		double weight = 67.5; //72.5~62.5 사이가 적정	
		double realweigh = 69.3;
	
		Scanner scn = new Scanner(System.in);
		String name, phone; //변수를 지정하면 아래 요인에 기입x
		int age;
		double cm, w;
	System.out.println("이름을 입력하시오");
	name = scn.nextLine();
	System.out.println("연락처를 입력하시오");
	phone = scn.nextLine();
	System.out.println("나이를 입력하시오");
	age = scn.nextInt();
	System.out.println("키를 입력하시오");
	cm = scn.nextDouble();
	System.out.println("몸무게를 입력하시오");
	w = scn.nextDouble();
	
	w = (cm - 100) * 0.9;

	
	System.out.println("이름 : " + name);
	System.out.println("연락처 : " + phone);
	System.out.println("나이 : " + age + "세");
	System.out.println("키 : " + cm + "cm");
	System.out.println("몸무게는" + w + "입니다.");
	
	if(weight+5>realweigh && weight-5<realweigh) {
		System.out.println("적정 몸무게입니다.");
	} else {
		System.out.println("비정상입니다.");
	}
	}
}
