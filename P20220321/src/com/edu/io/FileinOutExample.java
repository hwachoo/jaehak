package com.edu.io;

import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;

public class FileinOutExample {
	public static void main(String[] args) {
		try {
			FileInputStream fis = new FileInputStream("C:/temp/test.jpg"); // 경로의 jpg를 읽어
			FileOutputStream fos = new FileOutputStream("C:/temp/copy2.jpg"); //경로의 jpg로 복사
			
			int readByte = -1;
			byte[] readBytes = new byte[100]; //100byte씩 읽어들임
			while((readByte = fis.read(readBytes)) != -1) {//read메소드 = 읽어들인 정수값 리턴
				//배열이 들어오면 읽어들인 배열만큼 리턴
				fos.write(readBytes, 0, readByte); //선언한 배열보다 작은 경우 그만큼만 읽음(낭비x) -> 읽어들인 만큼만 작성
			}
			fos.close();
			fis.close();
		} catch (IOException e) {
			e.printStackTrace();
		}
		System.out.println("end of prog");
	}
}
