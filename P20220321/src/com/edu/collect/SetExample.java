package com.edu.collect;

import java.util.HashSet;
import java.util.Iterator;
import java.util.Set;

public class SetExample {
	public static void main(String[] args) {

		Set<String> set = new HashSet<String>(); // Set : 중복값은 허용하지 않음
		set.add("Hello");
		set.add("World");
		set.add("Good");
		set.add("World"); //중복으로 추가 안 됨
		
		set.remove("Good");

		System.out.println(set.size());

		Iterator<String> iter = set.iterator();
		while (iter.hasNext()) {
			String result = iter.next();
			System.out.println(result);
		}
		System.out.println("end of prog");
	}
}
