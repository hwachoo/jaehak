package ProjectSample;

import java.util.List;
import java.util.Scanner;

public class QuizApp extends DAO {
	QuizServiceOracle qso = new QuizServiceOracle();
	Scanner scn = new Scanner(System.in);

	public void execute() {

		while (true) {

			System.out.println("1. 문제 풀어보기 2. 문제 조회 3. 문제 생성 4. 문제 수정 5. 문제 삭제 9. 종료");
			System.out.print("선택>>");
			int menu = scn.nextInt();

			if (menu == 1) {

				int corrects = 0; // 저장값 담을 변수 선언
				List<Quiz> list = qso.Quizlist();
				for (int i = 0; i < list.size(); i++) {

					System.out.println(list.get(i).getQuiz());
					System.out.println(list.get(i).getChoice());
					System.out.println("정답을 입력하세오.");
					int input = (scn.nextInt());

					if (list.get(i).getAnswer() == input) {
						corrects++;
					}
				}
				System.out.println("맞춘 갯수");
				System.out.println(corrects);

			} else if (menu == 2) {
				List<Quiz> quz1 = qso.Quizlist();
				for (Quiz q : quz1) {
					System.out.println(q.toString());
				}
			} else if (menu == 3) {

				Quiz quz = new Quiz();
				System.out.println("번호를 입력하세요.");
				quz.setNum(scn.nextInt());
				scn.nextLine();
				System.out.println("문제를 입력하세요.");
				quz.setQuiz(scn.nextLine());
				scn.nextLine();
				System.out.println("선택지를 입력하세요.");
				quz.setChoice(scn.nextLine());
				scn.nextLine();
				System.out.print("정답을 입력하세요.");
				quz.setAnswer(scn.nextInt());

				qso.insertQuiz(quz);

			} else if (menu == 4) {
				Quiz quz = new Quiz();

				System.out.println("번호를 입력하세요.");
				quz.setNum(scn.nextInt());
				scn.nextLine();
				System.out.println("문제를 입력하세요.");
				quz.setQuiz(scn.nextLine());
				scn.nextLine();
				System.out.println("선택지를 입력하세요.");
				quz.setChoice(scn.nextLine());
				scn.nextLine();
				System.out.print("정답을 입력하세요.");
				quz.setAnswer(scn.nextInt());

				qso.modifyQuiz(quz);

			} else if (menu == 5) {
				int qn = 0;
				System.out.println("문제번호 입력>> ");
				qn = scn.nextInt();

				qso.deleteQuiz(qn);

			} else if (menu == 9) {
				System.out.println("시스템을 종료합니다.");
				break;
			} else {
				System.out.println("잘못된 메뉴를 선택했습니다.");
			}
		} // end of while
	}// end of execute
}
