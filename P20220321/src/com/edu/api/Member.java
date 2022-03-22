package com.edu.api;

public class Member {
	private String id;
	private String name; //id와 name도 같을 때 true
	
	public Member(String id, String name) {
		this.id = id;
		this.name = name;
	}

	@Override
	public int hashCode() {
		return 1111;
	}

	@Override //memberexample의 논리 정립
	public boolean equals(Object obj) {
//		Member member = null; 초기값 설정
		if(obj instanceof Member) {
			Member member = (Member) obj;
//			if(this.id == member.id && this.name == member.name) {
			if(id.equals(member.id) && name.equals(member.name)) {
				return true;
			}
		}
		return false;
	}

}
