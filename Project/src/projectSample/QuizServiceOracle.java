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
		String sql = "insert into quiz_info(no, quiz, answer, score)\r\n" 
				+ "values(?, ?, ?, ? )";
		try {
			psmt = conn.prepareStatement(sql);
			psmt.setInt(1, quiz.getNum());
			psmt.setString(2, quiz.getQuiz());
			psmt.setString(3, quiz.getAns());
			psmt.setInt(4, quiz.getScore());

			int r = psmt.executeUpdate(); // 쿼리가 실행된 건수를 리턴해줌
			System.out.println(r + "건이 입력됨.");

		} catch (SQLException e) {
			e.printStackTrace();
		} finally {
			// 정상실행여부 관계 없이 반드시 실행할 코드
			disconnect();
		}
	}

	@Override // 퀴즈 1건 조회 및 풀이
	public Quiz getQuiz(int qn) {
		return null;
	}

	@Override // 퀴즈 전체 리스트
	public List<Quiz> Quizlist() {
		List<Quiz> quz = new ArrayList<Quiz>(); // 조회된 결과값을 담기 위한 컬렉션
		conn = getConnect();
		String sql = "select * " 
				+ "from quiz_info " 
				+ "order by no";
		try {
			psmt = conn.prepareStatement(sql);
			rs = psmt.executeQuery(); 
			while (rs.next()) { 
				Quiz quiz = new Quiz();
				quiz.setNum(rs.getInt("no"));
				quiz.setQuiz(rs.getString("quiz"));
				quiz.setAns(rs.getString("answer"));
				quiz.setScore(rs.getInt("score"));

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
		String sql = "update qiuz_info \r\n"
				+ "set quiz = ?, \r\n" 
				+ "    answer = ?\r\n" 
				+ "where no = ?";
		try {
			psmt = conn.prepareStatement(sql);
			psmt.setString(1, quiz.getQuiz());
			psmt.setString(2, quiz.getAns());
			psmt.setInt(3, quiz.getNum());

			int r = psmt.executeUpdate();
			System.out.println(r + "건이 수정되었습니다.");
		} catch (SQLException e) {
			e.printStackTrace();
		} finally {
			disconnect();
		}
	}

	@Override
	public void deleteQuiz(int qn) {
		conn = getConnect();
		String sql = "DELETE FROM quiz_info\r\n" 
					+ "WHERE no = ?";
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
