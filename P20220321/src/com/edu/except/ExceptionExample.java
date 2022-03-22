package com.edu.except;

import java.util.InputMismatchException;
import java.util.Scanner;

public class ExceptionExample {
	public static void main(String[] args) {
		// 오류 : error와 exception 2종류
		// compile error, runtime error(논리적 오류);

		try { // 예외처리 - runtime error에 대해 강제로 처리
			double result = 13 / 0;
			System.out.println(result);
		} catch (ArithmeticException e) {
//			e.printStackTrace();
			System.out.println("0으로 나눌 수 없습니다.");
		}

		Scanner scn = new Scanner(System.in);
		System.out.println("숫자를 입력하세요");
		try {
			int menu = scn.nextInt();
		} catch (InputMismatchException e) {
			System.out.println("숫자를 입력하지 않았습니다.");
		}
		scn.close();
		System.out.println("end of program");

	}

}
