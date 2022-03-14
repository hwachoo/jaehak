package com.edu;

import java.util.Scanner;

public class RectangleExample {
public static void main(String[] args) {
	Scanner scn = new Scanner(System.in);
	int xLength, yLength, area;
	
	System.out.println("가로 길이:");
	int num1 = scn.nextInt();
	System.out.println("세로 길이:");
	int num2 = scn.nextInt();
	System.out.println("계산(너비) 결과: ");
	int num3 = num1 * num2;
	
	System.out.println( "너비값은" + num3 + "입니다." );
	
	scn.close();
	
}
}
