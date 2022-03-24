package com.edu.generic;

import java.util.ArrayList;

public class BoxExample {
	public static void main(String[] args) {
//		Box box = new Box();
//		box.setObj("Hello");
//		String result = (String) box.getObj(); // String 클래스
//		System.out.println(result);
//		
//		Integer result1 = (Integer) box.getObj(); //String클래스 -> Integer로 변환하는데 실행단계에서 에러발생
//		System.out.println(result1);
		
		Box<String> stringBox = new Box<String>();
		stringBox.setObj("Hello");
		String result = stringBox.getObj();
		System.out.println(result);
		
		Box<Integer> intBox = new Box<Integer>();
		intBox.setObj(100);
		Integer result1 = intBox.getObj();
		System.out.println(result1);
		
		ArrayList<Integer> intAry = new ArrayList<Integer>();
		
	}

}
