package com.edu.abstracts;

public class Dog extends Animal {
//부모클래스에서 추상선언을 했으면 자식 클래스에서 오버라이딩을통해 구현해야함
	
	public Dog(/*부모가 가지고 있는 기능(인스턴스) + 자신이 가지고 있는 인스턴스 보유*/) {
		super();
		System.out.println("Dog() 생성자 호출");
	}
	
	@Override
	public void eat() {
		System.out.println("강아지가 먹습니다.");
	}

	@Override
	public void speak() {
		System.out.println("멍멍");
		
	}

}
