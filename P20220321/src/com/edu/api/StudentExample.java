package com.edu.api;

import java.util.ArrayList;
import java.util.List;

import com.edu.collect.Student;

public class StudentExample {
	public static void main(String[] args) {
		List<Student> list = new ArrayList<Student>();
		
		Student s1 = new Student(101, "홍길동", 60, 70);
		Student s2 = new Student(102, "아무개", 64, 81);
		Student s3 = new Student(103, "박복한", 92, 88);
		
		list.add(s1);
		list.add(s2);
		list.add(s3);
		
		Student result = list.get(0); //첫번째 학생 정보
		System.out.println("첫번째학생: " + result.toString());
		
		list.set(0, new Student(104, "강공만", 55, 60)); // 첫번째 인스턴스 변경
		result = list.get(0);
		
		list.get(0).setKorSc(100); //첫번째 인스턴스의 값 변경
		list.get(0).setEngSc(100);
	
		list.remove(0); //삭제처리
		
		System.out.println("첫번째학생: " + list.get(0).toString());
	}
}
