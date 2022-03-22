package com.edu.except;

import java.util.Calendar;
import java.util.Scanner;

//class String2 extends string { final 클래스여서 더이상 상속받지 못함
//	public final String{}
//}

public class ExcemtionExample2 {
	public static void main(String[] args) {

		// Object(최상위 클래스)
		Object obj = new String();
		obj = new Scanner(System.in);
		obj = Calendar.getInstance();
		
		obj = new Object();
		System.out.println("obj의 해시코드: " + obj.hashCode());
			

		// Exception 컴파일할 때 예외처리
		try {
			Class.forName("java.lang.String");
		} catch (ClassNotFoundException e1) {
//			e1.printStackTrace();
			System.out.println("해당 클래스가 존재하지 않습니다.");
		}

		// RuntimeException 
		String str = null;
		
		try {
			str.charAt(0); // CharSequence interface의 추상메소드
			System.out.println(str.toString());
		} catch (NullPointerException e) {
			System.out.println("Null포인트 예외발생");
			e.printStackTrace();
		}

		String nums1 = "백";
		String nums2 = "이백";
		int num1, num2;
		try {
			num1 = Integer.parseInt(nums1);
			num2 = Integer.parseInt(nums2);

			str.charAt(0);
		} catch (Exception e) {
			num1 = 0;
			num2 = 0;
			System.out.println("상위의 예외발생");
		}
		System.out.println(num1 + "+" + num2 + "=" + (num1 + num2));

		try {
			showError();
		} catch (ClassNotFoundException e) {
			e.printStackTrace();
		}

		System.out.println("end of prog");
	} // end of main

	public static void showError() throws ClassNotFoundException {
		Class.forName("java.lang.Strings");

	}

} // end of class
