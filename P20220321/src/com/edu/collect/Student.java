package com.edu.collect;

import java.io.Serializable;

//상속 클래스
public class Student implements Serializable {
	//참조용, 학생번호(int 1,2,3 sno), 학생이름(String), 영어점수(int), 국어점수(int)
	
	private int StudNum;
	private String StudName;
	private int EngSc;
	private int KorSc;
	
	public Student( ) {
		
	}
	
	public Student(int studNum, String studName, int engSc, int korSc) {
		super();
		StudNum = studNum;
		StudName = studName;
		EngSc = engSc;
		KorSc = korSc;
	}
	
	public int getStudNum() {
		return StudNum;
	}
	public void setStudNum(int studNum) {
		StudNum = studNum;
	}
	public String getStudName() {
		return StudName;
	}
	public void setStudName(String studName) {
		StudName = studName;
	}
	public int getEngSc() {
		return EngSc;
	}
	public void setEngSc(int engSc) {
		EngSc = engSc;
	}
	public int getKorSc() {
		return KorSc;
	}
	public void setKorSc(int korSc) {
		KorSc = korSc;
	}
	
	//toString 재정의

	@Override
	public String toString() {
		return "[ 학번: " + StudNum + ", 이름: " + StudName + ", 영어점수: " + EngSc + ", 국어점수: " + KorSc + "]\n";
	}
	

}
