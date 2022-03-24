package com.edu.stream;

import java.util.ArrayList;
import java.util.List;

public class StreamExample2 {
	

	public static void main(String[] args) {
		List<Student> list = new ArrayList<Student>();
		list.add(new Student("홍길동", "남자", 70, 100));
		list.add(new Student("김말자", "여자", 80, 120));
		list.add(new Student("김무식", "남자", 85, 110));
		list.add(new Student("박한나", "여자", 88, 90));
		
		//남녀 상관없이 score+point -> 180점보다 높은 경우 출력
		list.stream() //스트림 생성
//		.filter(student -> (student.score + student.point) > 180)
		.sorted() //오름차순, 내림차순 구현 클래스
		.forEach(student ->  System.out.println(student)); //필터링 된 대상 sysout
		
		
		
		
//		list/*컬렉션으로부터*/.stream()//스트림생성
//		.filter(student -> student.score >= 80) //80점 이상인 대상만 저장
//		.filter(student -> student.gender.equals("여자")) //& 성별인 여자인 대상만 저장
//		.forEach(student -> System.out.println(student)); //필터링된 대상을 출력
	}

}
