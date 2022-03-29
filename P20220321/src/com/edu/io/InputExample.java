package com.edu.io;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.io.InputStream;

public class InputExample {
	public static void main(String[] args) {

		try {
			// 입력스트림을 생성(first.dat - 입력스트림의 소스로 읽어들임)
			InputStream is = new FileInputStream("first.dat"); // first.dat를 읽어옴
			int readByte = -1;
			while ((readByte = is.read()) != -1) {// is.read가 읽어들이는 변수를 readByte에 저장, -1이 아닌 동안에 읽어들임
				System.out.println(readByte);
			}
			is.close();
		} catch (IOException e) {
			e.printStackTrace();
		}
	}

}
