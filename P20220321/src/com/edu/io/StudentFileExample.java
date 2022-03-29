package com.edu.io;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class StudentFileExample {
	static Scanner scn = new Scanner(System.in);
	static List<Student> list = new ArrayList<Student>();
	
	public static void main(String[] args) {
//		writeStudent();
		readStudent(); // 텍스트 101 홍길동 30 50 -> new Student(101, 홍길동, 30, 50)
		
		for(Student student : list) {
			System.out.println(student.toString());
		}
		
		System.out.println("end of prog");
	} //end of main
	
	public static void readStudent() {
		try {
			FileReader fr = new FileReader("student.txt");
			BufferedReader br = new BufferedReader(fr);
			String readStr = null;
			
			while((readStr = br.readLine()) != null) {
				String[] contents = readStr.split(" "); //읽어들인 문자열에서 공란을 기준으로 자르겠다 선언
				list.add( new Student(Integer.parseInt(contents[0])
						, contents[1]
						, Integer.parseInt(contents[2])
						, Integer.parseInt(contents[3])) );
				
				
				System.out.println(readStr);
			}
			
			br.close();
			fr.close();
			
		} catch (IOException e) {
			e.printStackTrace();
		}
	}
	
	public static void writeStudent() {
		try {
			FileWriter fw = new FileWriter("student.txt");
			BufferedWriter bw = new BufferedWriter(fw);
		
			while(true) {
				System.out.println("이름입력>> 101 HONG 20 30");
				String name = scn.nextLine(); //한 라인 전체를 읽음
				if(name.equals("stop")) {
					break;
				}
				bw.write(name + "\n");	
			}
			
			bw.close();
		} catch (IOException e) {
			e.printStackTrace();
		}
	}
}
