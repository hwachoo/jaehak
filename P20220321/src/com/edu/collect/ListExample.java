package com.edu.collect;

import java.util.ArrayList;

public class ListExample {
	public static void main(String[] args) {
		String[] strings = new String[10];
		for(int i=0; i < strings.length; i++) {
			if (strings[i] == null) {
				strings[i] = "hello";
				break;
			}
		}
		
		ArrayList<String> strAry = new ArrayList<String>();
		strAry.add("hello");
		strAry.add("world");
		
		strAry.get(1); // 해당 인덱스 값을 가져옴
		strAry.set(1, "월드"); //인덱스 값에 있는 내용 수정
		strAry.remove(1); // 0번째 인덱스 제거, "문자"로도 제거가능
		strAry.clear(); //인덱스값을 모두 지움
		System.out.println(strAry.size());
		
		for(int i = 0; i < strAry.size(); i++) {
			String  result = strAry/*문자열을 담는 메소드*/.get(i);
			System.out.println(result);
		} 
		
		
//		ArrayList<Integer> numAry = new ArrayList<Integer>();
//		for(int i = 0; i < numAry.size(); i++) {
//			Integer  result = numAry.get(i);
//		} 
		
	}
}
