package projectSample;

import java.io.Serializable;

public class Quiz implements Serializable {

	private int Num;
	private String Quiz;
	private String Ans;
	private int Score;

	public Quiz() {

	}

	public Quiz(int Num, String Quiz, String Ans, int Score) {
		super();
		Num = Num;
		Quiz = Quiz;
		Ans = Ans;
		Score = Score;
	}

	public int getNum() {
		return Num;
	}

	public void setNum(int num) {
		Num = num;
	}

	public String getQuiz() {
		return Quiz;
	}

	public void setQuiz(String quiz) {
		Quiz = quiz;
	}

	public String getAns() {
		return Ans;
	}

	public void setAns(String ans) {
		Ans = ans;
	}

	public int getScore() {
		return Score;
	}

	public void setScore(int score) {
		Score = score;
	}

	@Override
	public String toString() {
		return "Quiz [번호= " + Num + ", 문제=" + Quiz + ", 정답=" + Ans + ", 점수=" + Score + "]";
	}

}
