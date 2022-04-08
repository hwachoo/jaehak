package projectSample;

import java.io.Serializable;

public class Quiz implements Serializable{
	
	private int Num;
	private String Quiz;
	private String Choice;
	private int Answer;
	private String comm;

	

	public Quiz(int num, String quiz, String choice, int answer, String comm) {
		super();
		Num = num;
		Quiz = quiz;
		Choice = choice;
		Answer = answer;
		this.comm = comm;
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
	
	public String getComm() {
		return comm;
	}

	public void setComm(String comm) {
		this.comm = comm;
	}

	@Override
	public String toString() {
		return "No[" + Num + "]\n\r문제[" + Quiz + "]\n\r선택지[" + Choice + "]\n\r정답[" + Answer + "]\n\r[" + comm +"]";
	}



}
