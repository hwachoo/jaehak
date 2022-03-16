package com.prod;

public class UserExample {
	public static void main(String[] args) {
		User u1 = new User();
		u1.setUserID("아무개");
		u1.setGrade("A");
		u1.setPhone("010-1111-1111");
		u1.setPoint(2000);

		User u2 = new User();
		u2.setUserID("김유식");
		u2.setGrade("B");
		u2.setPhone("010-2222-2222");
		u2.setPoint(800);

		User u3 = new User();
		u3.setUserID("박나리");
		u3.setGrade("A");
		u3.setPhone("010-3333-3333");
		u3.setPoint(1800);

		User[] users = { u1, u2, u3 };
		for (int i = 0; i < users.length; i++) {
			if (users[i].getGrade() == "A" && users[i].getPoint() >= 1000) {
				System.out.println("UserID는" + users[i].getUserID() + "연락처는" + users[i].getPhone() + "이며" 
						+ "등급: " + users[i].getGrade()
						+ "포인트: " + users[i].getPoint());

			}

		}
	}

}
