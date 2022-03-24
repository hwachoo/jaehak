package com.edu.api;

import java.util.Scanner;

public class ApiExample {
	public static void main(String[] args) {
		Scanner scn = new Scanner(System.in);
	
	IDCheck idcheck = new IDCheck();
	String result = idcheck.getGender("951111-1734567");
	System.out.println(result);
	result = idcheck.getGender("980000-3852184");
	System.out.println(result);
	
	
	System.out.println("end of prog");
	}
}
