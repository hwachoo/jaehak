package com.edu.collect;

import java.util.Hashtable;
import java.util.Map;
import java.util.Scanner;

public class HashTableExample {
	public static void main(String[] args) {
		Map<String, String> map = new Hashtable<String, String>();
		//key값과 value값을 String타입으로 받음
		
		map.put("spring", "12"); // 컬렉션에 데이터 추가
		map.put("summer", "123");
		map.put("fall", "1234");
		map.put("winter", "12345");
		
		Scanner scn = new Scanner(System.in); //사용자 입력값 받아들이기
		
		while(true) {
			System.out.println("아이디와 비밀번호를 입력하세요."); //사용자에게 출력
			System.out.println("아이디: ");
			String id = scn.nextLine(); //사용자 직접 입력
			System.out.println("비밀번호: ");
			String pw = scn.nextLine();
			System.out.println();
			
			if(map.containsKey(id)) { //key(id)가 존재하는지 확인
				if(map.get(id).equals(pw)) { //비밀번호 비교
					System.out.println("로그인 성공");
					break;
				} else {
					System.out.println("비밀번호가 일치하지 않습니다.");
				}
				
			} else {
				System.out.println("아이디가 존재하지 않습니다.");
			}
			
		}
		
		
	}

}
