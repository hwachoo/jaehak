package com.edu.api;

import java.util.Calendar;

public class CalendarExample {
	public static void main(String[] args) {

		int year = 2022;
		int month = 7; // 5월 +1 해야함

		createCalendar(year, month);
	}

	public static void createCalendar(int y, int m) {
		Calendar today = Calendar.getInstance();
		today.set(y, m - 1, 1); //today.set(y, m, d)7월 d일부터 1을 시작함

		System.out.println("년: " + today.get(Calendar.YEAR));
		System.out.println("월: " + (today.get(Calendar.MONTH) + 1)); // 1월이 0부터 시작함
		System.out.println("일: " + today.get(Calendar.DATE));
		System.out.println("요일: " + today.get(Calendar.DAY_OF_WEEK)); // 일요일부터 0~6
		System.out.println(today.getActualMaximum(Calendar.DATE));

		int gapDay = today.get(Calendar.DAY_OF_WEEK);
		int lastDate = today.getActualMaximum(Calendar.DATE);
		// 요일정보 출력
		String[] days = { "Sun", "Mon", "Tue", "Wed", "Thu", "Fri", "Sat" };
		for (int i = 0; i < days.length; i++) {
			System.out.printf("%4s", days[i]);
		}
		System.out.println();
		// 1일의 위치 지정
		for (int i = 1; i < gapDay; i++) {
			System.out.printf("%4s", "");
		}
		// 날짜 출력
		for (int i = 1; i <= lastDate; i++) {
			System.out.printf("%4d", i);
			if ((i + gapDay - 1) % 7 == 0) {
				System.out.println();
			}
		}
		// 프로그램 끝
		System.out.println("end");

	}
}
