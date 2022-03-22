package com.edu;

public class UnivFriend extends Friend {
	private String univ;
	private String major;
	
	
	
	public UnivFriend() {
		super(); // Friend();
	}
	
	public UnivFriend(String name, int age, double height, double weight, String phone) {
		super(name, age, height, weight, phone); 
		
	}
	
	public UnivFriend(String name, int age, double height, double weight, String phone, String univ, String major) {
		super(); //부모클래스가 가지고 있는 메소드 중 ()안의 것을 취해옴
		this.univ = univ;
		this.major = major;
	}
	
	public String getUniv() {
		return univ;
	}
	public void setUniv(String univ) {
		this.univ = univ;
	}
	public String getMajor() {
		return major;
	}
	public void setMajor(String major) {
		this.major = major;
	}

	@Override
	public String toString() {
		String str = "친구의 이름은 " + super.getName() + "이고\n";
		str += "나이는 " + super.getAge() + "이고\n";
		str += "연락처는 " + super.getPhone() + "입니다.\n";
		str += "===========<추가 정보>===========\n";
		str += "회사이름은 " + this.getUniv() + "이고\n";
		str += "업무는" + this.getMajor() + "입니다.\n";
		return str;
	}
	
	

}
