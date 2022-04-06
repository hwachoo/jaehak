package projectSample;

import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class QuizServiceOracle extends DAO implements QuizService {

	Scanner scn = new Scanner(System.in);

	@Override // 문제 생성
	public void insertQuiz(Quiz quiz) {
		conn = getConnect();
		String sql = "insert into quiz_info(no, quiz, choice, answer)\r\n" + "values(?, ?, ?, ? )";
		try {
			psmt = conn.prepareStatement(sql);
			psmt.setInt(1, quiz.getNum());
			psmt.setString(2, quiz.getQuiz());
			psmt.setString(3, quiz.getChoice());
			psmt.setInt(4, quiz.getAnswer());

			int r = psmt.executeUpdate(); // 쿼리가 실행된 건수를 리턴해줌
			System.out.println(r + "건이 입력됨.");

		} catch (SQLException e) {
			e.printStackTrace();
		} finally {
			// 정상실행여부 관계 없이 반드시 실행할 코드
			disconnect();
		}
	}


	@Override // 퀴즈 전체 리스트
	public List<Quiz> Quizlist() {
		List<Quiz> quz = new ArrayList<Quiz>();
		// 조회된 결과값을 담기 위한 컬렉션
		conn = getConnect();
		String sql = "select * " + "from quiz_info " + "where no !=0" + "order by no";
		try {
			psmt = conn.prepareStatement(sql);
			rs = psmt.executeQuery();
			while (rs.next()) {
				Quiz quiz = new Quiz();
				quiz.setNum(rs.getInt("no"));
				quiz.setQuiz(rs.getString("quiz"));
				quiz.setChoice(rs.getString("choice"));
				quiz.setAnswer(rs.getInt("answer"));

				quz.add(quiz);
			}
		} catch (SQLException e) {
			e.printStackTrace();
		} finally {
			disconnect();
		}
		return quz;
	}

	@Override // 문제 수정
	public void modifyQuiz(Quiz quiz) {
		conn = getConnect();
		String sql = "update quiz_info  " + "set quiz = ?, " + "    choice = ?, " + "    answer = ?   "
				+ "where no = ?";
		try {
			psmt = conn.prepareStatement(sql);
			psmt.setString(1, quiz.getQuiz());
			psmt.setString(2, quiz.getChoice());
			psmt.setInt(3, quiz.getAnswer());
			psmt.setInt(4, quiz.getNum());

			int r = psmt.executeUpdate();
			System.out.println(r + "건이 수정되었습니다.");
		} catch (SQLException e) {
			e.printStackTrace();
		} finally {
			disconnect();
		}
	}

	@Override // 삭제
	public void deleteQuiz(int qn) {
		conn = getConnect();
		String sql = "DELETE FROM quiz_info\r\n" + "WHERE no = ?";
		try {
			psmt = conn.prepareStatement(sql);
			psmt.setInt(1, qn);

			int r = psmt.executeUpdate();
			System.out.println(r + "건 삭제됨.");
		} catch (SQLException e) {
			e.printStackTrace();
		} finally {
			disconnect();
		}
	}
}// end of class
