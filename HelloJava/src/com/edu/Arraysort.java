package com.edu;

public class Arraysort {
	public static/*main메소드의 내용을 가져옴*/ void sorting(int[] ary) {
		int loopCnt = ary.length - 1; // 마지막값이 제일 처음 위치로 이동하려면 배열크기 -1;
		for (int cnt = 0; cnt < loopCnt; cnt++) {
			int temp = ary[0]; // 첫번째 값으로 temp값 지정
			for (int i = 0; i < loopCnt; i++) {
				if (ary[i] > ary[i + 1]) {
					//354 25 => 25 34로 위치 변경
					temp = ary[i];
					ary[i] = ary[i + 1];
					ary[i + 1] = temp;
				}

			}

		}
		
	}

	public static void main(String[] args) {
		int[] intAry = { 34, 25, 48, 12 };
		int[] intAry2 = { 22, 56, 99, 12 };
		int[] intAry3 = { 22, 56, 99, 12 };
//		intAry[i] -> intArt[i+1]; 34, 25
//		intAry = new int[4];
		
//		int loopCnt = intAry.length - 1; // 마지막값이 제일 처음 위치로 이동하려면 배열크기 -1;
//		for (int cnt = 0; cnt < loopCnt; cnt++) {
//			int temp = intAry[0]; // 첫번째 값으로 temp값 지정
//			for (int i = 0; i < loopCnt; i++) {
//				if (intAry[i] > intAry[i + 1]) {
//					//354 25 => 25 34로 위치 변경
//					temp = intAry[i];
//					intAry[i] = intAry[i + 1];
//					intAry[i + 1] = temp;
//				}
//
//			}
//
//		}
		sorting(intAry);
		
		//변경된 결과 출력
		for (int i = 0; i < intAry.length; i++) {
			System.out.println(intAry[i] + "");
		}
		sorting(intAry2);
		for (int i = 0; i < intAry.length; i++) {
			System.out.println(intAry2[i] + "");
		}
		sorting(intAry3);
		for (int i = 0; i < intAry.length; i++) {
			System.out.println(intAry3[i] + "");
			
		System.out.println("end of Program");

	}

	}
}
