package com.edu;
// Object(객체) -> class(도면, 틀) -> 인스턴스 생성(초기화(생성))
// 학생(객체:Object) -> Class Student -> instance(new Student())
public class ObjectExample {
	public static void main(String[] args) {
		//int num1 = 10.5; 이 경우 타입이 맞지 않아 오류 뜸
		//int는 정수로 반드시 지정
		int num1 = 10;
		double num2 = 12.34;
		double num3 = 20; //double은 자동형변환(Promotion)
		int num4 = (int) 23.4; //강제형변환(Casting)
		
		String  str1 = "Hello"; //heap(인스턴스)생성
		String str2 = new String("Hello"); //해당형식으로도 가능
//		Car car1 = "Hello"; //정수도 문자도 담을 수 있어서 선언 시 타입이 맞지 않음
		Car car1 = new Car (); //초기화(인스턴스 생성)
		car1.setModel("Sonata");
		car1.setPrice(10000000);
		
		Student s1 = new Student();
		s1.setStudNo(100);
		s1.setStudName("김수한");
		s1.setEngScore(80);
		s1.setKorScore(90);
		s1.setMathScore(85);
		System.out.println("영어점수 초기값 : " + s1.getEngScore());
		System.out.println("이름 초기값 : " + s1.getStudName());
		System.out.println(s1.getStudName() + "의 합계: " + s1.getSumScore());
		System.out.println(s1.getStudName() + "의 평균: " + s1.getAvgScore());
		
	}

}
