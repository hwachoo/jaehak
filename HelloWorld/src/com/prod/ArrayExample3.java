package com.prod;

public class ArrayExample3 {
	public static void main(String[] args) {
		String[] names = new String[5]; // 5로 설정했을 때 값이 4개면 1개는 null로 표시
		names[0] = "홍길동";
		names[1] = "234";
		names[2] = "이재학";
		names[3] = "김마";

		names[1] = "이삼사";
		names[4] = "김갑산";
		names[0] = null;
		
		String searchName = "김마";

		for (int i = 0; i < 5; i++) {
//			if (names[i] != null) {
//				System.out.println("이름:" + names[i]);
//
//			}
			if(names[i] != null && names[i].equals(searchName)) {
				System.out.println(i+1+"번째 위치에 있습니다."); //+1한 이유는 인덱스값 때문에
			}
		}
	}
}
