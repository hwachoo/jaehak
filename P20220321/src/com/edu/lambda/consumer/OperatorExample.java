package com.edu.lambda.consumer;

import java.util.function.IntBinaryOperator;

//Operator : 연산처리 결과
public class OperatorExample {
	public static void main(String[] args) {

		IntBinaryOperator intBin = (left, right) -> left + right; //수를 더하는 기능
		intBin.applyAsInt(10, 20);
		
		intBin = (num1, num2) -> num1>num2?num1:num2; //2개 중 큰 수를 구해오는 기능
		int result = maxOrMin(intBin); 
		System.out.println(result);

	}

	public static int maxOrMin/**/(IntBinaryOperator/*인터페이스, 값이 아닌 기능 선언*/ intBin) {
		int[] intAry = { 85, 47, 92 };
		int result = intAry[0];
		for(int num : intAry) {
			result = intBin.applyAsInt(result, num);
			}
		return result;
	}
}
