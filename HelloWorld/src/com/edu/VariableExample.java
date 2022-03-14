package com.edu;

public class VariableExample {
	public static void main(String[] args) {
		// 변수의 타입.
		int num1 = 100; // int 정수를 지정. 4byte 표현
		double num2 = 100.5; // 소수점까지 표현. 8byte 표현
		double result = num1 * num2; // 10050;
		// 자동형변환(promotion): 작은 범위를 큰 범위로 변환
		System.out.println("결과: " + num1);
		// 강제형변환(casting): 큰 범위를 작은 범위로 변환
		int val1 = 100;
		double val2 = 20.5; //20
		int sum = val1 + (int) val2;
		System.out.println("결과: " + sum);
		
		int n1 = 11;
		double n2 = 4;
		
		double n3 = n1 / n2; // 10/4 => 2로 출력 double로 입력할 경우 2.0으로 출력, 정수와 정수를 처리한 결과이기 때문에 소수점 표현하고 싶다면 둘 중 하나를 double로 해야함 
		System.out.println("나눈 결과: " + n3);
		
		// 나머지 연산식 - 10을 3으로 나눈 나머지 -> 1(이하)
		double n4 = n1 % n2; //정수를 대상으로 결과값 도출
		System.out.println("나머지: " + n4);
		
		//짝홀수
		if(n1 % 2 == 1) { //'==' 왼쪽과 오른쪽 값을 비교
			System.out.println(n1 + "의 값은 홀수입니다.");
		}
	}
		
}
