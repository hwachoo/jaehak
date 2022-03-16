package com.prod;

public class ArrayExample4 {
	public static void main(String[] args) {
		int[] numbers = { 35, 22, 17, 40, 28, 33, 36 };
		int sum = 0;
		int cnt = 0;
		for(int i = 0; i < numbers.length; i++) { //**.length로 할 경우 인수가 추가되어도 자동으로 적용됨
			if(numbers[i] % 2 == 0) { //짝수일 경우
				sum += numbers[i];
				cnt++; //if문이 실행될 때마다 카운트
			}
		}
		System.out.println("짝수 값의 합:" + sum);
		System.out.println("짝수 값의 평균:" + (sum / (double) cnt));
	}
}
