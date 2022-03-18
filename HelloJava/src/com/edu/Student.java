package com.edu;

public class Student {

	private int studNo; //private = 은폐 public = 공개
	private String studName;
	private int korScore = -1;
	private int mathScore = -1;
	private int engScore = -1;
	
	//생성자 : 필드의 값을 초기화..
	public Student() {
		this.studNo = 1;
		this.studName = "nobody";
		this.korScore = 0;
		this.engScore = 0;
	}
	
	Student(int studNo) {
		this.studNo = studNo;
	}
	public Student(int studNo, String studName) {
		this.studNo = studNo;
		this.studName = studName;
	}
	
	public Student(int studNo, String studName, int korScore, int mathScore, int engScore) {
		super();
		this.studNo = studNo;
		this.studName = studName;
		this.korScore = korScore;
		this.mathScore = mathScore;
		this.engScore = engScore;
	}
	
	public static void callStatic() {
		System.out.println("정적메소드 실행...");
	}
	
	public double getAvgScore() {
		return getSumScore() / 3.0;
	}
	
	int getSumScore() {
		if(this.korScore !=-1 && this.engScore !=-1 &&this.mathScore != -1 ) {
			return this.korScore + this.engScore + this.mathScore;
		}
		return 0;
	}
	
	// 기능(method) => 규칙 - 반환값 메소드명 매개변수 {   }
	public void setStudNo(int studNo) {
		this.studNo = studNo;
	}
	public int getStudNo() {
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
	
	public String getStudInfo() { //return입력 전까진 오류로 표시
		//Formatter f = new Formatter(new StringBufer());
	    //f.format("%.2f", this.getAvgScore());
		
		String str = "==============================";
		str += "\n 학생명: " + this.getStudName() + "이고"; //'\n' = 줄바꿈
		str += "\n 학번: " + this.getStudNo() + "이고";
		str += "\n 평균: " + String.format("%.2f",this.getAvgScore()) + "이다.";
		str += "\n==============================\n";
		return str;
	}
		

}
