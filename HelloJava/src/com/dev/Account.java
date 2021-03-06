package com.dev;

public class Account {
	// 계좌정보, 예금주, 예금액
	//field
	private String accNo;
	private String accName;
	private int money;
	
	public static String bankName;
	static { //{} - 정적블럭, 1번만 실행
		bankName = "한일은행";
	}
	public static void showBankName() {
		System.out.println("한일은행입니다.");
	}
	
	//constructor:생성자. 목적은 필드의 초기값을 지정.
	//기본생성자는 여러 개 선언가능(overloading), 동일한 구성은 불가
	
	public Account() {
	}
	public Account(String accNo) {
	}//위나 아래와 같으면 안됨(타입이 같으면 순서를 바꿔도 안됨)) 
		
	public Account(String accNo, String accName, int money) {
		super();
		this.accNo = accNo;
		this.accName = accName;
		this.money = money;
	}
	
	@Override
	public String toString() {
		return "Account [accNo=" + accNo + ", accName=" + accName + ", money=" + money + "]";
	}

	////////////////////////////
	//method
	public String getAccNo() {
		return accNo;
	}
	
	public void setAccNo(String accNo) {
		this.accNo = accNo;
	}
	public String getAccName() {
		return accName;
	}
	public void setAccName(String accName) {
		this.accName = accName;
	}
	public int getMoney() {
		return money;
	}
	public void setMoney(int money) {
		this.money = money;
	}
	////////////////////////////
	
}
