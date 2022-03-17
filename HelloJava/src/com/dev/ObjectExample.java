package com.dev;

import java.util.Scanner;

import com.edu.Student; //경로가 달라도 import해줘야 사용가능함

public class ObjectExample {
	public static void main(String[] args) {
		Scanner scn = new Scanner(System.in);

		Student s1 = new Student(100, "김수한"); // studNo = 100
//		s1.setStudNo(100); //private정보여서 다른 패키지에서 가져오지 못함
//		s1.setStudName("아무개"); //public정보여서 다른 패키지여도 가져올 수 있음
		System.out.println(s1.getStudNo());
		System.out.println(s1.getStudName());
		s1.setEngScore(100);
		s1.setEngScore(60); // set메소드 값을 지정
		s1.setMathScore(80);

		Student s2 = new Student(101, "이혜린", 80, 82, 85); // 생성자를 통해서 필드값의 지정, 정의한 순서대로 매개값을 입력해야함
		System.out.println(s2.getStudName() + "의 평균: " + s2.getAvgScore());

//		Scanner scn = new Scanner(System.in);
//		scn.nextInt();

		Student s3 = new Student(102, "김종서", 70, 80, 90);
		Student s4 = new Student(102, "박만수", 77, 82, 83);

		Student[] students = { s1, s2, s3, s4 };
		////////////////////////////////////////////////////
		while (true) {
			System.out.println("조회하려는 학생의 이름:(ex:홍길동) ");
			String searchName = scn.next();
			if(searchName.equals("종료")) {
				break;
			}

			for (int i = 0; i < students.length; i++) {
				if (students[i].getStudName().equals(searchName)) {
					System.out.println(students[i].getStudInfo());
				}
			}
		}
		System.out.println("시스템을 종료합니다.");
		//////////////////////////////////////////////////
	}
}
