package com.edu.lambda.consumer;

import java.util.function.ToIntFunction;

import com.edu.collect.Student;
// function 인터페이스 : 매핑작업.(student -> int)
public class FunctionExample {
	public static void main(String[] args) {
		ToIntFunction<Student> func = (student) -> student.getEngSc() + student.getKorSc();
		
			int result = func.applyAsInt(new Student(101, "asd", 90, 90));
			System.out.println(result);
		}
	}

