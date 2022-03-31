package projectSample;

import java.util.*;
import java.io.*;

public class QuizApp extends DAO {
	QuizServiceOracle qso = new QuizServiceOracle();
	Scanner scn = new Scanner(System.in);

	public void execute() {

		while (true) {

			System.out.println("1. 문제 풀어보기 2. 문제 조회 3. 문제 생성 4. 문제 수정 5. 문제 삭제 9. 종료");
			System.out.print("선택>>");
			int menu = scn.nextInt();

			if (menu == 1) {

			} else if (menu == 2) {
				List<Quiz> quz1 = qso.Quizlist();
				for (Quiz q : quz1) {
					System.out.println(q.toString());
				}
			} else if (menu == 3) {
			
				Quiz quz = new Quiz();
				System.out.println("번호를 입력하세요.");
				quz.setNum(scn.nextInt());
				scn.next();
				System.out.println("문제를 입력하세요.");
				quz.setQuiz(scn.nextLine());
				scn.next();
				System.out.print("정답을 입력하세요.");
				quz.setAns(scn.nextLine());
				System.out.println("점수를 입력하세요.");
				quz.setScore(scn.nextInt());
				
				qso.insertQuiz(quz);

			} else if (menu == 4) {

			} else if (menu == 5) {

			} else if (menu == 9) {
				System.out.println("시스템을 종료합니다.");
				break;
			} else {
				System.out.println("잘못된 메뉴를 선택했습니다.");
			}
		} // end of while
	}// end of execute
}
