package com.prod;

public class FriendExample {
	public static void main(String[] args) {
		// 친구의 정보(이름, 전화번호, 이메일, (double)키, (double)몸무게)
		Friend f1 = new Friend();
		f1.FriendName = "아무개";
		f1.FriendPhoneNumber = "010-0000-0000";
		f1.Email = "asd@aaaaa.com";
		f1.Weight = 67.5;
		f1.Height = 169.8;

		Friend f2 = new Friend();
		f2.FriendName = "김무환";
		f2.FriendPhoneNumber = "010-1111-1111";
		f2.Email = "qwe@ssss.net";
		f2.Weight = 81;
		f2.Height = 178;

		Friend f3 = new Friend();
		f3.FriendName = "박만희";
		f3.FriendPhoneNumber = "010-2222-2222";
		f3.Email = "qse@zxc.co.kr";
		f3.Weight = 72;
		f3.Height = 181;

		System.out.println(f1); // f1만 선언할 경우 16진수로 출력 'com.prod.Friend@34ce8af7'

		Friend[] friends = { f1, f2, f3 }; // friend를 class로 선언

		for (int i = 0; i < friends.length; i++) {
			if (friends[i].Height < 170) {
				System.out.println("이름: " + friends[i].FriendName); // 해당 변수만 찾아옴
				System.out.println("전화번호: " + friends[i].FriendPhoneNumber);
				System.out.println("신장 :" + friends[i].Height);
				System.out.println("==============================");
			}
		}
	}
}
