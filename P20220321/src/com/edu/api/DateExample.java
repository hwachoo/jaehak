package com.edu.api;

import java.text.SimpleDateFormat;
import java.time.LocalDate;
import java.time.LocalDateTime;
import java.util.Date;

public class DateExample {
	public static void main(String[] args) {
		
		Date today = new Date();
		today.getYear(); //1900년 기준 ()값을 더함
		System.out.println(today);
		
		SimpleDateFormat sdf = new SimpleDateFormat("yyyy년MM월dd일 hh시 mm분ss초");
		System.out.println(sdf.format(today));
		
		LocalDateTime time = LocalDateTime.now();
		System.out.println(time.getYear());
	}

}
