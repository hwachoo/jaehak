package com.prod;

public class User {
	private String userID;
	private String grade;
	private String phone;
	private int point;
	
	public String getUserID() {
		return userID;
	}
	public void setUserID(String userID) {
		this.userID = userID;
	}
	public String getGrade() {
		return grade;
	}
	public void setGrade(String grade) {
		this.grade = grade;
	}
	public String getPhone() {
		return phone;
	}
	public void setPhone(String phone) {
		this.phone = phone;
	}
	public int getPoint() {
		return point;
	}
	public void setPoint(int point) {
		this.point = point;
	}

	public String getUserInfo() {
		String result=this.userID + "의 등급은" + this.grade + "이고 연락처는"
				+ this.phone + "이며 포인트는" + this.point + "입니다." ;
				return result;
	}
	
}
