package com.dev;

import java.util.Scanner;

public class WhileExample4 {
	public static void main(String[] args) {
		// 은행 계좌 생성하여 1: 입금, 2:출금, 3:종료
		// 입금일 경우 : 입금액을 입력하세요account 누적금액
		// 출금일 경우 : 출금액을 입력하세요account 차감금액
		// 종료일 경우 : 프로그램 종료

		Scanner scn = new Scanner(System.in);
		int account = 0;

		while (true) { //반복
			System.out.println("1: 입금, 2: 출금, 3: 종료"); //메뉴
			int menu = scn.nextInt(); //입력값
			if (menu == 1) { //1번을 눌렀을 경우
				System.out.println("입금액을 입력하시오");
				account += scn.nextInt();
				System.out.println("잔고는" + account + "입니다.");

			} else if (menu == 2) {
				System.out.println("출금액을 입력하시오");
				int inputVal = scn.nextInt(); //새로운 변수 선언
				if (account < inputVal) { //출금액이 잔고보다 많을 시,
					System.out.println("잔고가 없습니다."); //메세지 출력 다시 메뉴로
					continue; // 명령어 이하 구문을 무시하고 다시 반복문 시작으로 돌아감

				} else {
					account -= inputVal; //잔고가 출금액보다 큰 경우
					System.out.println("잔고는" + account + "입니다."); //정상작동

				}

			} else if (menu == 3) {
				System.out.println("프로그램을 종료합니다.");
				break;
			}
		}
		System.out.println("end of program");
	}
}