package com.dev;

import java.util.Arrays;
import java.util.Scanner;

//BankApp(main method), Account(계좌번호, 예금주, 잔액)
public class BankApp {
	static Account[] banks = new Account[100];
	static Scanner scn = new Scanner(System.in);

	// 메뉴 : 1.계좌생성(번호, 예금주,예금액)
	// 2.예금(계좌번호, 예금액) -> 1회 예금한도 100,000
	// 3.출금(계좌번호, 출금액) - 잔고보다 큰 금액 출금 불가
	// 4.잔액조회(계좌번호)
	// 5.종료

	public static void main(String[] args) {

		while (true) {
			printMenu();
			int menu = scn.nextInt();

			if (menu == 1) {
				creatAccount();
			} else if (menu == 2) {
				deposit();
			} else if (menu == 3) {
				withdraw();
			} else if (menu == 4) {
				findAccountMoney();
			} else if (menu == 5) {
				System.out.println("종료합니다.");
				break;
			} else if (menu == 9) {
				showList();
			}
		}
		System.out.println("=== End of Program ===");

	}// end of main()

	// 메뉴 출력
	public static void printMenu() {
		String menu = "=============================\r\n" + "1.계좌생성(번호, 예금주,예금액)\r\n"
				+ "2.예금(계좌번호, 예금액) -> 1회 예금한도 100,000\r\n" + "3.출금(계좌번호, 출금액) - 잔고보다 큰 금액 출금 불가\r\n"
				+ "4.잔액조회(계좌번호)\r\n" + "5.종료\r\n" + "선택>";
		System.out.println(menu);
	}

	// 계좌생성(1번메뉴)
	public static void creatAccount() {
		System.out.println("계좌번호입력>>");
		String accNo = scn.next();
		System.out.println("이름입력>>");
		String accName = scn.next();
		System.out.println("예금액입력>>");
		int accMoney = scn.nextInt();
		Account accnt = new Account(accNo, accName, accMoney);

		for (int i = 0; i < banks.length; i++) {
			if (banks[i] == null) {
				banks[i] = accnt;
				break;
			}
		}
		System.out.println("계좌가 정상적으로 생성되었습니다.");
	}

	// 예금(2번메뉴)
	public static void deposit() { // 입금
		System.out.println("예금기능");
		System.out.print("계좌번호>>");
		String ano = scn.next();
		System.out.print("예금액>>");
		int amt = scn.nextInt();
		int checkCnt = 0; // 조회하여 계좌가 존재하는지 체크하는 변수
		for (int i = 0; i < banks.length; i++) {
			if (banks[i] != null && banks[i].getAccNo().equals(ano)) { // 계좌번호 존재할 경우
				// 계좌번호가 조회가 되었을 때 
				checkCnt = 1;
				int currAmt = banks[i].getMoney();
				
				//예금액이 한도를 초과하지 못하도록 방지
				if (currAmt + amt > 100000) {
					checkCnt = 2;
					break;
				}
				banks[i].setMoney(currAmt + amt); // 잔액 + 입금액
				break;
			}
		}
		if (checkCnt == 1) {
			System.out.println("입금이 정상적으로 처리되었습니다.");
		} else if (checkCnt == 2) {
			System.out.println("입금한도가 초과되었습니다.");
		} else {
			System.out.println("계좌번호가 존재하지 않습니다.");
		}
	}

	// 출금(3번메뉴)
	public static void withdraw() { // 출금
		System.out.println("출금기능");
	}

	// 조회(4번메뉴)
	public static void findAccountMoney() { // 잔액조회
		System.out.println("조회기능");
	}

	// 전체리스트
	public static void showList() {
		for (int i = 0; i < banks.length; i++) {
			if (banks[i] != null) {
				System.out.println(banks[i].toString());
			}
		}
	}

} // end of class
