package com.prod;

import java.util.Scanner;

public class ArrayExample8 {
	public static void main(String[] args) {
		Scanner scn = new Scanner(System.in);
		int[] numbers = new int[2];
		
		System.out.println("첫번째 값을 입력하시오");
		numbers[0] = scn.nextInt();
		System.out.println("두번째 값을 입력하시오");
		numbers[1] = scn.nextInt();
		
		if(numbers[0] > numbers[1]) {
			int tmp = numbers[0];
			numbers[0] = numbers[1];
			numbers[1] = tmp;
		}
		
		System.out.println("낮은 값" + numbers[0]);
		System.out.println("높은 값" + numbers[1]);
	}


}
