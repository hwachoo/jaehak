package com.edu.collect;

import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;
import java.util.Set;

public class MapExample {
	public static void main(String[] args) {
		// Map : {key:value}, {key1:value1} key와 value 각각 선언
		Map<String, Integer>  map = new HashMap<String, Integer>();
		map.put("홍길동", 100);
		map.put("아무개", 90);
		map.put("김복자", 78);
		map.put("김복자", 80);
		//컬렉션: 여러값을 저장 => 여러 요소에 접근.
		
		Integer val = map.get("김복자");
		System.out.println(val);
		
		Set<String> keySet = map.keySet(); //map컬렉션에 저장된 요소들의 키에 해당 값을Set컬렉션에 담아줌.
		// 1)
		Iterator<String> iter = keySet.iterator();
		
		while(iter.hasNext()) {
			String key = iter.next();
			Integer value = map.get(key);
			System.out.printf("key: %5s, value: %5d\n", key, value);
		}
		
		//2) for( : ) 확장for
		for(String key : keySet)/*set collection만큼 반복*/ {
			Integer value = map.get(key);
			System.out.printf("key: %5s, value: %5d\n", key, value);
		}
		
		System.out.println("end of prog");
		
	}

}
