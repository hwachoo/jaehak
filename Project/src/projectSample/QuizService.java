package projectSample;

import java.util.List;

public interface QuizService {
	
	public void insertQuiz(Quiz quiz); //문제등록
	public Quiz getQuiz(int qn); //문제 풀어보기
	public List<Quiz> Quizlist(); //문제리스트
	public void modifyQuiz(Quiz quiz); //문제 수정
	public void deleteQuiz(int qn); //문제 삭제

}
