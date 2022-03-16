package com.prod;

public class ArrayExample {
	public static void main(String[] args) {
		long l1 = 123456543341234L; // 8byte
		int i1 = 100; // 4byte
		byte b1 = 127; // 1byte -128 ~ -1/0 ~ 127
		b1++;
		b1++;
		short s1 = 100; // 2byte -32768 ~ -1 / 0 ~ 32767
		System.out.println(Long.MAX_VALUE);
		
		int sum = 0;
		int score1 = 80;
		int score2 = 90;
		int score3 = 85;
		int score4 = 95;
		int score5 = 88;
		
		sum += score1;
		sum += score2;
		sum += score3;
		sum += score4;
		sum += score5;
		
		double avg = sum / (double) 5;
		
		int[] scores = new int [5]; //int형 변수를 [n]개 만큼 가질 수 있는 변수
		// [index] = 0부터 시작(0이 1번째 수)
		scores[0] = 80;
		scores[1] = 90;
		scores[2] = 85;
		scores[3] = 95;
		scores[4] = 88;
		
//		System.out.println(scores[0] + scores[1]);
		//배열을 활용하여 avg 산출
		sum = 0;
		
		for (int i = 0; i < 5; i++) {
			System.out.println(scores[i]); //scores[n]번째 값 호출
			sum += scores[i];
		}
		avg = sum / (double) 5;
		System.out.println(avg);
	}
}
