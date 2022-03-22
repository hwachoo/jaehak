package com.edu;

public class Person extends Object {
	//필드, 클래스에 값을 담아놓기 위한 용도
	private String name;
	private int age;
	private double height;
	private double weight;//private에 직접 접근하지 못하도록 숨김
	
	//constructor 생성자 - 인스턴스를 만들 때 필드의 값을 초기화할 목적
	//overloading  중복하여 같은 값을 선언, 구성은 달라야 함
	public Person/*클래스 이름과 같은 메소드 생성*/() {
		//private로 선언되어 있을 경우 해당 클래스 외에는 열람 불가, 자식 클래스 오류 출력
	}
	public Person(String name) {
		this.name = name;
	}
	public Person(String name, int age, double height, double weight) {
		this.name = name;
		this.age = age;
		this.height = height;
		this.weight = weight;
	}
	//method. 필드의 값을 지정하거나 읽을 때 메소드를 통해서 불러옴
	public void setName(String name) {
		this.name = name;
	}
	public String getName() {
		return this.name;
	}
	public int getAge() {
		return age;
	}
	public void setAge(int age) {
		this.age = age;
	}
	public double getHeight() {
		return height;
	}
	public void setHeight(double height) {
		this.height = height;
	}
	public double getWeight() {
		return weight;
	}
	public void setWeight(double weight) {
		this.weight = weight;
	}

}
