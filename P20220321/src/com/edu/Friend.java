package com.edu;

public class Friend extends Person {
	//회사친구 : 회사이름, 회사업무
	//학교친구 : 학교이름, 전공
	private String phone;
	
	public Friend(){
	} //=> super();
	
	public Friend(String name, int age, double height, double weight, String phone) {
		super(name, age, height, weight);
		this.phone = phone;
	}

	public String getPhone() {
		return phone;
	}

	public void setPhone(String phone) {
		this.phone = phone;
	}
	
	//Overriding -> 부모 클래스의 메소드 - 자식 클래스가 새롭게 정의.
	@Override //annotation
	public String toString() {
		String str = "친구의 이름은 " + super.getName() + "이고\n";
		str += "나이는 " + super.getAge() + "이고\n";
		str += "연락처는 " + this.getPhone() + "입니다.\n";
		return str;
	} 
	
	

}
