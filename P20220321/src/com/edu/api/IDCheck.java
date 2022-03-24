package com.edu.api;

public class IDCheck {
	// 주민번호 입력 -> 남자인지 여자인지 확인
	// -, 공백, 붙여쓰기

	public String getGender(String sno) {
		String result = null;
		String newSno = sno.replace("-", "");
		newSno = newSno.replace(" ", "");
		char gender = newSno.charAt(6);
		switch (gender) {
		case '1':
		case '3':
			return "남자";
		case '2':
		case '4':
			return "여자";

		}
		return result;
	}

}
