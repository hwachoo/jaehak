package com.edu.stream;

import java.util.ArrayList;
import java.util.List;
import java.util.OptionalDouble;
import java.util.function.Consumer;
import java.util.stream.Stream;

class Student implements Comparable<Student> {
	String name;
	String gender;
	int score;
	int point;

	// 생성자
	public Student(String name, String gender, int score) {
		this.name = name;
		this.gender = gender;
		this.score = score;
	}

	public Student(String name, String gender, int score, int point) {
		super();
		this.name = name;
		this.gender = gender;
		this.score = score;
		this.point = point;
	}

	@Override
	public String toString() {
		return "Student [name=" + name + ", gender=" + gender + ", score=" + score + ", point=" + point + "]";
	}

	@Override
	public int compareTo(Student student) {
		// this 와 student 비교: this, student -> 음수 내림차순(student, this):양수
//		if (this.score < student.score) {
//			return -1;
//		} else {
//			return 1;
//		}
		return (this.score + this.point) - (student.score + student.point); // 60, 70->음수, 오름차순
	}
}

public class StreamExample {
	public static void main(String[] args) {
		List<Student> list = new ArrayList<Student>();
		list.add(new Student("홍길동", "남자", 70));
		list.add(new Student("김말자", "여자", 80));
		list.add(new Student("김무식", "남자", 85));
		list.add(new Student("박한나", "여자", 88));
		// 평균 구하기
		int sum = 0, cnt = 0;
		double avg = 0;
		for (Student/* 컬렉션 안의 타입과 같아야함 */ student : list) {
			if (student.gender.equals("남자")) {
				sum += student.score;
				cnt++;
			}
		}
		avg = sum / (double) cnt;
		System.out.println("컬렉션 평균값: " + avg);

		Stream<Student> stream = list.stream(); // 스트림생성. 크래스에 있는 데이터를 하나씩 처리
		OptionalDouble od = stream.filter((s) -> s.gender.equals("남자"))//
				.mapToInt(s -> s.score).average();

		avg = od.getAsDouble();
		System.out.println("스트림 평균값: " + avg);
//		stream.forEach/*stream 각각의 요소에 대해서 괄호 안의 기능을*/ ((Student t) -> {
//				System.out.println("이름: " + t.name + ", 성별: " + t.gender + ", 점수: " + t.score);
//			
//			});
	}
}
