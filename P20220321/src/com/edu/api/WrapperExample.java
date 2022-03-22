package com.edu.api;

import java.util.ArrayList;

public class WrapperExample {
	public static void main(String[] args) {
		
		//기본타입(int, long, double, boolean etc)
		//참조타입(Integer, Long, Double, Boolean etc)
		//int -> Integer (boxing), Integer -> int (unboxing) 
		
		ArrayList<Integer> ary = new ArrayList<Integer>();
		ary.add(100); 
		ary.add(new Integer/*error는 아니지만 프로그램에서 제거하겠다는 표시*/(200));
		new Integer(100).floatValue(); //-> 100.0
		
	}

}
