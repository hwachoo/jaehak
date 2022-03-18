package com.dev;

import java.util.Calendar;

public class WeekExample {
	public static void main(String[] args) {
		
		Week today = Week.MONDAY; // enum에 선언된 값밖에 취하지 못함
		
		Calendar day = Calendar.getInstance(); //오늘을 기준으로
		System.out.println(day.get(Calendar.DAY_OF_WEEK)); //연도,월,일 출력
		
		switch(day.get(Calendar.DAY_OF_WEEK)) {
		case 1:
			System.out.println(Week.SUNDAY);break;
		case 2:
			System.out.println(Week.MONDAY);break;
		case 3:
			System.out.println(Week.TUESDAY);break;
		case 4:
			System.out.println(Week.WEDNESDAY);break;
		case 5:
			System.out.println(Week.THURSDAY);break;
		case 6:
			System.out.println(Week.FRIDAY);break;
		case 7:
			System.out.println(Week.SATURDAY);break;
		}
		
		
		
		
		
	}
}
