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
				transferAmount();

			} else if (menu == 6) {
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
				+ "4.잔액조회(계좌번호)\r\n" + "5.송금\r\n" // transferAmount()
				+ "6.종료\r\n" + "=============================\r\n" + "선택>";
		System.out.println(menu);
	}

	// 계좌생성(1번메뉴)
	public static void creatAccount() {
		String accNo;
		while (true) {
			System.out.println("계좌번호입력>>");
			accNo = scn.next();
			// 계좌번호가 있는지 체크하는 기능
			if (searchAccountNo(accNo) != null) { // != null -> null이 아닐 때
				System.out.println("계좌가 존재합니다.");
				continue; // 이하 구문들이 실행되지 않음 현재 메뉴로 돌아감
			} // 계좌입력단계에서 일치하는 계좌가 있으면 메뉴로 돌아감
			break;
		}
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
		String ano;
		System.out.println("예금기능");
		while (true) {
			System.out.print("계좌번호>>");
			ano = scn.next();
			if (searchAccountNo(ano) == null) {
				System.out.println("계좌가 존재하지 않습니다.");
				continue;
			}
			break;
		}

		System.out.print("예금액>>");
		int amt = scn.nextInt();
		int checkCnt = 0; // 조회하여 계좌가 존재하는지 체크하는 변수

		Account findAccount = searchAccountNo(ano);
		if (findAccount != null) {
			checkCnt = 1; // 찾는 조건에 맞는 계좌 존재할 시
			int currAmt = findAccount.getMoney();

			if (currAmt + amt > 100000) {
				checkCnt = 2;
			} else {
				findAccount.setMoney(currAmt + amt);
			}
		}
//		for (int i = 0; i < banks.length; i++) {
//			if (banks[i] != null && banks[i].getAccNo().equals(ano)) { // 계좌번호 존재할 경우
//				// 계좌번호가 조회가 되었을 때
//				checkCnt = 1;
//				int currAmt = banks[i].getMoney();
//				// 예금액이 한도를 초과하지 못하도록 방지
//				if (currAmt + amt > 100000) {
//					checkCnt = 2;
//					break;
//				}
//				banks[i].setMoney(currAmt + amt); // 잔액 + 입금액
//				break;
//			}
//		}
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
		String ano1;
		System.out.println("출금기능");
		while (true) {
			System.out.print("계좌번호>>");
			ano1 = scn.next();
			if (searchAccountNo(ano1) == null) {
				System.out.println("계좌가 존재하지 않습니다.");
				continue;
			}
			break;
		}

		System.out.print("출금액>>");
		int amt1 = scn.nextInt();
		int checkCnt = 0; // 조회하여 계좌가 존재하는지 체크하는 변수

		Account findAccount = searchAccountNo(ano1);
		if (findAccount != null) {
			checkCnt = 1; // 찾는 조건에 맞는 계좌 존재할 시
			int currAmt = findAccount.getMoney();

			if (currAmt < amt1) {
				checkCnt = 2;
			} else {
				findAccount.setMoney(currAmt - amt1);
			}
		}

//		for (int i = 0; i < banks.length; i++) {
//			if (banks[i] != null && banks[i].getAccNo().equals(ano1)) { // 계좌번호 존재할 경우
//				// 계좌번호가 조회가 되었을 때
//				checkCnt = 1;
//				int currAmt = banks[i].getMoney();
//				// 예금액이 한도를 초과하지 못하도록 방지
//				if (currAmt < amt1 ) {
//					checkCnt = 2;
//					break;
//				}
//				banks[i].setMoney(currAmt - amt1); // 잔액 + 입금액
//				break;
//			}
//		}
		if (checkCnt == 1) {
			System.out.println("출금이 정상적으로 처리되었습니다.");
		} else if (checkCnt == 2) {
			System.out.println("잔고가 부족합니다.");
		} else {
			System.out.println("계좌번호가 존재하지 않습니다.");
		}

	}

	// 조회(4번메뉴)
	public static void findAccountMoney() { // 잔액조회
		System.out.println("조회기능");
		System.out.println("계좌번호>>");
		String ano = scn.next();
		Account findAccount = searchAccountNo(ano);
		if (findAccount == null) {
			System.out.println("계좌가 존재하지 않습니다.");
			return;
		}
		System.out.println("잔액: " + findAccount.getMoney());
	}

	// 9번 전체리스트
	public static void showList() {
		for (int i = 0; i < banks.length; i++) {
			if (banks[i] != null) {
				System.out.println(banks[i].toString());
			}
		}
	}

	// 5번 송금메뉴
	public static void transferAmount() {
		String ano3;
		while (true) {
			System.out.print("송금계좌번호>>");
			ano3 = scn.next();
			if (searchAccountNo(ano3) == null) {
				System.out.println("계좌가 존재하지 않습니다.");
				continue;
			}
			break;
		}
		System.out.print("송금액>>");
		int amt3 = scn.nextInt();
		while (true) {
			System.out.println("입금계좌번호>>");
			ano3 = scn.next();
			if (searchAccountNo(ano3) == null) {
				System.out.println("계좌가 존재하지 않습니다.");
				continue;
			}
			break;
		}
		int checkCnt = 0; // 조회하여 계좌가 존재하는지 체크하는 변수

		Account findAccount = searchAccountNo(ano3);

		if (findAccount != null) {
			checkCnt = 1; // 찾는 조건에 맞는 계좌 존재할 시
			int currAmt = findAccount.getMoney();

			if (currAmt < amt3) {
				checkCnt = 2;
				
			} else {
				findAccount.setMoney(currAmt - amt3);
			}
		}
		if (checkCnt == 1) {
			System.out.println("송금이 정상적으로 처리되었습니다.");
		} else if (checkCnt == 2) {
			System.out.println("잔고가 부족합니다.");
		}

	}

	// 계좌번호를 입력하면 배열(banks)에서 그 계좌번호를 반환 없으면 null
	// 100개의 계정 중 null값
	public static Account searchAccountNo(String accNo) { // searchAccountNo - accNo에서 일치하는 게 있을 떄 account 출력, 없으면 null
															// 출력
		for (int i = 0; i < banks.length; i++) {
			if (banks[i] != null && banks[i].getAccNo().equals(accNo)) {
				return banks[i];
			}
		}
		return null; // 모든 클래스에 대응되는 기본값은 null
	}

} // end of class
