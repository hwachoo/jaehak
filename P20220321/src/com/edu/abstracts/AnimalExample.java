package com.edu.abstracts;

public class AnimalExample {
	public static void main(String[] args) {
//		Animal animal = new Animal();  추상클래스는 인스턴스 생성불가
		Animal animal = null;
		animal = new Dog(); //자식 클래스의 super을 막으면 부모 클래스의 생성자 먼저 호출
		animal.setName("바둑이");
		animal.eat();
		animal.speak();
		
		animal = new Cat();
		animal.setName("치즈");
		animal.eat();
		animal.speak();
	}

}
