package com.dev;

import java.util.Scanner;

import com.edu.Student;

public class StudentEx {
	public static void main(String[] args) {
		// Scanner, 배열 선언5개, 입력, 리스트출력.
		Scanner scn = new Scanner(System.in);
		Student[] students = new Student[5];

		while (true) {
			System.out.println("1.입력 2.리스트열람 3.종료");
			System.out.print("선택> ");
			int menu = scn.nextInt();
			if(menu == 1) {
				//입력기능
//				System.out.println("입력기능구현");
				System.out.print("학번을 입력하시오");
				int sno = scn.nextInt();
				System.out.print("이름을 입력하시오");
				String snm = scn.next();
				System.out.println("영어점수를 입력하시오");
				int esc = scn.nextInt();
				System.out.println("국어점수를 입력하시오");
				int ksc = scn.nextInt();
				System.out.println("수학점수를 입력하시오");
				int msc = scn.nextInt();
				
				Student s1 = new Student(sno, snm, ksc, esc, msc);
				
				for(int i=0; i<students.length; i++) {
					if(students[i] == null) {
						students[i] = s1;
						break;
					}
				}
				System.out.println("저장되었습니다.");
				
			} else if(menu == 2) {
				//리스트 출력
//				System.out.println("리스트기능구현");
				for (int i = 0 ; i < students.length; i++) {
					if(students[i] !=null) {
						System.out.println(students[i].getStudInfo());
					}
				}
				System.out.println("조회완료");
			} else if(menu == 3) {
				//종료
				System.out.println("프로그램을 종료합니다.");
				break;
			} else {
				System.out.println("잘못된 메뉴입니다.");
			}

		}
		
		System.out.println("end of program");
	}

}
