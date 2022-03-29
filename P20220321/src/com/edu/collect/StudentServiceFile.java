package com.edu.collect;

import java.io.*;
import java.util.*;
//기능 구현 클래스
public class StudentServiceFile implements StudentService{
	
	List<Student> list = new ArrayList<Student>();
	File file;
	
	//생성자
	//기본 생성자에 파일에 저장되어 있는 파일 읽어서 list collection에 값을 저장
	public StudentServiceFile() {//기본 생성자
		try {
		FileReader fr = new FileReader("studentList.data");
		BufferedReader br = new BufferedReader(fr);
		String readBuffer = null;
		while((readBuffer = br.readLine()) != null) {
			String[] contents = readBuffer.split(",");
//			contents[0] <=101, contents[1] <= 홍길동, contents[2] <= 80, contents[3] <=90
			list.add(
					new Student(Integer.parseInt(contents[0]),
					contents[1],
					Integer.parseInt(contents[2]),
					Integer.parseInt(contents[3])
					));
		}
		br.close();
		fr.close();
		
		}catch(IOException e) {
			e.printStackTrace();
		}
		
	}
	
	
	@Override //추가
	public void insertStudent(Student student) {
		list.add(student);// 추가.
	}

	@Override //1건조회
	public Student getStudent(int sno) {
		for (int i = 0; i < list.size(); i++) {
			if (list.get(i).getStudNum() == sno) { // StudNum과 sno의 값이 같을때
				return list.get(i); // 결과출력
			}
		}
		return null;
	}

	@Override //전체리스트
	public List<Student> studentList() {
		return list;
	}

	@Override //수정
	public void modifyStudent(Student student) {
		for (int i = 0; i < list.size(); i++) {
			if (list.get(i).getStudNum() == student.getStudNum()) {
				list.get(i).setEngSc(student.getEngSc());
				list.get(i).setKorSc(student.getKorSc());
			}
		}
	}

	@Override //삭제
	public void deleteInfo(Student student) {
		for (int i = 0; i < list.size(); i++) {
			if (list.get(i).getStudNum() == student.getStudNum()) {
				list.remove(i);
			}
		}
	}

	@Override //이름조회
	public List<Student> studentList(String name) {
		List<Student> searchList = new ArrayList<Student>();
		for (int i = 0; i < list.size(); i++) {
			if (list.get(i).getStudName().equals(name)) {
				searchList.add(list.get(i));
			}
			// 같은 이름이 있는지 탐색, 있으면 searchList.add()
		}
		return searchList;
	}

	@Override //저장
	public void saveToFile() {
		//ArrayList<Student> list =:> 파일 저장.
		try {
			FileWriter fw = new FileWriter("studentList.data");
			BufferedWriter bw = new BufferedWriter(fw); //보조스트림의 생성자의 매개값으로 기본스트림
			
			for(Student stud : list) {
				bw.write(stud.getStudNum() +"," + stud.getStudName() + "," + stud.getEngSc() + "," + stud.getKorSc() + "\n");
			}
			bw.close();
			fw.close();
			
			
		} catch (IOException e) {
			e.printStackTrace();
		}
	}
	

}
