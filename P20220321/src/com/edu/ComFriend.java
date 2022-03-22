package com.edu;

public class ComFriend extends Friend {
	private String company;
	private String job;
	
	public ComFriend() {
		
	} // super();
	
	public ComFriend(String name, int age, double height, double weight, String phone, String company, String job) {
		super(name, age, height, weight, phone); 
		this.company = company;
		this.job = job;
		
	}
	
	
	public String getCampany() {
		return company;
	}
	public void setCampany(String campany) {
		company = campany;
	}
	public String getJob() {
		return job;
	}
	public void setJob(String job) {
		this.job = job;
	}

	@Override
	public String toString() {
		String str = "친구의 이름은 " + super.getName() + "이고\n";
		str += "나이는 " + super.getAge() + "이고\n";
		str += "연락처는 " + super.getPhone() + "입니다.\n";
		str += "===========<추가 정보>===========\n";
		str += "회사이름은 " + this.getCampany() + "이고\n";
		str += "업무는" + this.getJob() + "입니다.\n";
		return str;
	}
	
	


}
