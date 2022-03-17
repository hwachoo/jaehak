package com.edu;

public class Student {
	// 학생번호, 학생이름, 국어점수, 수학점수, 영어점수
	private int studNo; //private = 은폐 public = 공개
	private String studName;
	private int korScore = -1;
	private int mathScore = -1;
	private int engScore = -1;
	
	double getAvgScore() {
		return getSumScore() / 3.0;
	}
	
	int getSumScore() {
		if(this.korScore !=-1 && this.engScore !=-1 &&this.mathScore != -1 ) {
			return this.korScore + this.engScore + this.mathScore;
		}
		return 0;
	}
	
	// 기능(method) => 규칙 - 반환값 메소드명 매개변수 {   }
	void setStudNo(int studNo) {
		this.studNo = studNo;
	}
	int getStudNo() {
		return this.studNo;
	}
	public String getStudName() {
		return studName;
	}
	public void setStudName(String studName) {
		this.studName = studName;
	}
	public int getKorScore() {
		return korScore;
	}
	public void setKorScore(int korScore) {
		this.korScore = korScore;
	}
	public int getMathScore() {
		return mathScore;
	}
	public void setMathScore(int mathScore) {
		this.mathScore = mathScore;
	}
	public int getEngScore() {
		return engScore;
	}
	public void setEngScore(int engScore) {
		this.engScore = engScore;
	}

}
