package com.prod;

public class ArrayExample2 {
	public static void main(String[] args) {
		//ages(나이, 3개) 정수를 담을 수 있는 배열
		int[] ages = new int [3];
		int ages1 = 20;
		int ages2 = 23;
		int ages3 = 27;
		int sumages = 0;
		double avgages = sumages / (double) 3;

		ages[0] = 20;
		ages[1] = 23;
		ages[2] = 27;
		sumages=0;
		

		for(int i = 0; i < 3; i++) {
			System.out.println("나이는" + ages[i] + "입니다.");
			sumages += ages[i];
			
			
			
		}
		System.out.println("합계는" + sumages + "입니다.");
		avgages = sumages / (double) 3;
		System.out.printf("평균은" + avgages + "입니다.");
		
	}
}
