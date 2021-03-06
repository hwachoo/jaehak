package com.edu.api;

import java.util.ArrayList;
import java.util.HashSet;

public class MemberExample {
	public static void main(String[] args) {
		Member obj1 = new Member("blue", "아무개"); //member에서 선언한 순서대로 작성
		Member obj2 = new Member("blue", "김철수");
		Member obj3 = new Member("blue", "아무개");
		
		if(obj1.equals(obj2)) {
			System.out.println("obj1과 obj2는 동등합니다.");
		} else {
			System.out.println("obj1과 obj2는 동등하지 않습니다.");
		}
		
		if(obj1 == obj3) {
			System.out.println("obj1과 obj3는 동등합니다.");
		} else {
			System.out.println("obj1과 obj3는 동등하지 않습니다.");
		}
		
		// 배열 -> 컬렉션(ArrayList, HashSet, HashMap) : 여러 개의 값
		Member[] memberAry = new Member[5]; //Member클래스의 인스턴스 최대 5개 저장
											// 크기 초과하면 새로운 배열 선언, 복사.
		ArrayList<Member> memList = new ArrayList<Member>();
		memList.add(new Member("user1", "홍길동"));
		memList.add(new Member("user1", "홍길동"));
		
		for(int i=0; i<memList.size(); i++) {
			System.out.println(memList.get(i));
		}
		
		HashSet<Member> memSet = new HashSet<Member>();
		memSet.add(new Member("user1", "홍길동")); //hashCode(), equals()
		memSet.add(new Member("user1", "홍길동"));
		
		System.out.println(memSet.size());
	}

}
