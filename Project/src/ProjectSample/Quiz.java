package ProjectSample;

import java.io.Serializable;

public class Quiz implements Serializable {

	private int Num;
	private String Quiz;
	private String Choice;
	private int Answer;

	
	
	
	public Quiz(int num, String quiz, String choice, int answer) {
		super();
		Num = num;
		Quiz = quiz;
		Choice = choice;
		Answer = answer;
		
	}

	public Quiz( ) {
		
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
	public String getChoice() {
		return Choice;
	}
	public void setChoice(String choice) {
		Choice = choice;
	}
	public int getAnswer() {
		return Answer;
	}
	public void setAnswer(int answer) {
		Answer = answer;
	}

	@Override
	public String toString() {
		return "Quiz [No=" + Num + ", 문제=" + Quiz + ", 선택지=" + Choice + ", 정답=" + Answer + "]";
	}

}
