package com.dev;

import java.util.Scanner;

import com.edu.Student; //경로가 달라도 import해줘야 사용가능함

public class ObjectExample {
	public static void main(String[] args) {
		Student s1 = new Student();
//		s1.setStudNo(100); //private정보여서 다른 패키지에서 가져오지 못함
		s1.setStudName("아무개"); //public정보여서 다른 패키지여도 가져올 수 있음
		
		Scanner scn = new Scanner(System.in);
		scn.nextInt();
		
	}

}
