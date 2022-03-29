package com.edu.collect;

import java.util.List;
//인터페이스
public interface StudentService {
	
	public void insertStudent(Student student); //입력
	public Student getStudent(int sno); //한건조회
	public List<Student> studentList(); //전체목록
	public void modifyStudent(Student student); //수정
	public void deleteInfo(Student student); //삭제
	public List<Student> studentList(String name); //이름조회
	public void saveToFile(); //파일로 저장
	

}
