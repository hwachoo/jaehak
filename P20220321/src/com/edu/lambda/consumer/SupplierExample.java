package com.edu.lambda.consumer;

import java.util.function.IntSupplier;
// supplier 인터페이스 : 매개값이 없음 -> 반환값 
public class SupplierExample {
	public static void main(String[] args) {
		
		IntSupplier intSup = () -> (int) (Math.random() * 10);
			
			int result = intSup.getAsInt();
			System.out.println(result);
	}
	
}
