package projectSample;

import java.io.Serializable;

public class Quiz implements Serializable {

	private int Num;
	private String Quiz;
	private String Choice;
	private int Answer;
	private int input;
	public static int lastIndex = 1;
	//1번부터 생성하고 싶은데 0번부터 생성됨, DB에 등록된 값이 있으면 어떻게 되는지 물어볼 것
	
	
	
	public Quiz(int num, String quiz, String choice, int answer, int input) {
		super();
		Num = num;
		Quiz = quiz;
		Choice = choice;
		Answer = answer;
		this.input = input;
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
	public int getInput() {
		return input;
	}
	public void setInput(int input) {
		this.input = input;
	}
	@Override
	public String toString() {
		return "Quiz [No=" + Num + ", 문제=" + Quiz + ", 선택지=" + Choice + ", 정답=" + Answer + ", 선택=" + input
				+ "]";
	}

	

	
	

}
