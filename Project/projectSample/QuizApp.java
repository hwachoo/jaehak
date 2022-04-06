package projectSample;

import java.util.*;
import javax.swing.JLabel;
import java.awt.Font;
import java.io.*;

public class QuizApp extends DAO {
	QuizServiceOracle qso = new QuizServiceOracle();
	Scanner scn = new Scanner(System.in);
	String administrator, pw;


	public void execute() {

		while (true) {

			System.out.println("1. 전체 문제 풀어보기 | 2. 랜덤 문제 풀기 | 3. 문제 조회 \r\n4. 문제 생성 | 5. 문제 수정 | 6. 문제 삭제 | 9. 종료");
			System.out.print("선택>>");
			int menu = scn.nextInt();

			if (menu == 1) {
				int corrects = 0;
				int source = 0;
				List<Quiz> list = qso.Quizlist();
				Collections.shuffle(list);

				for (int i = 0; i < list.size(); i++) {

					System.out.println("====================================================================");
					System.out.println(list.get(i).getQuiz());
					System.out.println(list.get(i).getChoice());
					System.out.println("정답을 입력하세오.");
					int input = (scn.nextInt());

					if (list.get(i).getAnswer() == input) {
						corrects++;
						System.out.println("정답입니다.");
					} else {
						System.out.println("오답입니다.");
						System.out.println("정답 :" + list.get(i).getAnswer());
					}

					if (list.get(i).getAnswer() != 0) {
						source++;
					}
				}
				System.out.println("====================================================================");
				System.out.println();
				System.out.println("=========================");
				System.out.println("\t 맞춘 갯수");
				System.out.println("\t  " + corrects + "/" + source + "개"); // 맞춘 문제 개수/전체문제 개수 표기(list의 integer?)
				System.out.println("=========================");
				System.out.println();

			} else if (menu == 2) { // 랜덤 문제 풀기
				List<Quiz> list = qso.Quizlist();
				Collections.shuffle(list);

				System.out.println("1. 1문제 풀기 | 2. 3문제 풀기 | 3. 5문제 풀기");
				int menu2 = scn.nextInt();
				if (menu2 == 1) {
					for (int i = 0; i < 1; i++) {
						
						System.out.println("====================================================================");
						System.out.println(list.get(i).getQuiz());
						System.out.println(list.get(i).getChoice());
						System.out.println("정답을 입력하세오.");
						int input = (scn.nextInt());
						

						if (list.get(i).getAnswer() == input) {
							System.out.println("정답입니다.");
							System.out.println("====================================================================");
							System.out.println();
						} else {
							System.out.println("오답입니다.");
							System.out.println("정답 :" + list.get(i).getAnswer());
							System.out.println("====================================================================");
							System.out.println();
						}
					}
				} else if (menu2 == 2) {
					int corrects = 0;
					int source = 0;
					for (int i = 0; i < 3; i++) {

						System.out.println("====================================================================");
						System.out.println(list.get(i).getQuiz());
						System.out.println(list.get(i).getChoice());
						System.out.println("정답을 입력하세오.");
						int input = (scn.nextInt());

						if (list.get(i).getAnswer() == input) {
							corrects++;
						}

						if (list.get(i).getAnswer() != 0) {
							source++;
						}

						if (list.get(i).getAnswer() == input) {
							System.out.println("정답입니다.");
						} else {
							System.out.println("오답입니다.");
							System.out.println("정답 :" + list.get(i).getAnswer());
						}
					}
					System.out.println("====================================================================");
					System.out.println();
					System.out.println("=========================");
					System.out.println("\t 맞춘 갯수");
					System.out.println("\t " + corrects + "/" + source + "개"); // 맞춘 문제 개수/전체문제 개수 표기(list의 integer?)
					System.out.println("=========================");
					System.out.println();
				} else if (menu2 == 3) {
					int corrects = 0;
					int source = 0;
					for (int i = 0; i < 5; i++) {

						System.out.println("====================================================================");
						System.out.println(list.get(i).getQuiz());
						System.out.println(list.get(i).getChoice());
						System.out.println("정답을 입력하세오.");
						int input = (scn.nextInt());

						if (list.get(i).getAnswer() == input) {
							corrects++;
						}

						if (list.get(i).getAnswer() != 0) {
							source++;
						}

						if (list.get(i).getAnswer() == input) {
							System.out.println("정답입니다.");
						} else {
							System.out.println("오답입니다.");
							System.out.println("정답 :" + list.get(i).getAnswer());
						}
					}
					System.out.println("====================================================================");
					System.out.println();
					System.out.println("=========================");
					System.out.println("\t 맞춘 갯수");
					System.out.println("\t  " + corrects + "/" + source + "개"); // 맞춘 문제 개수/전체문제 개수 표기(list의 integer?)
					System.out.println("=========================");
					System.out.println();
				}

			} else if (menu == 3) { // 전체 리스트
				List<Quiz> list = qso.Quizlist();
				for (Quiz q : list) {
					System.out.println(q.toString());
				}

			} else if (menu == 4) { // 문제 생성
				List<Quiz> list = qso.Quizlist();
				Quiz quz = new Quiz();
				// 쿼리값을 이용하여 +1 할 수 있도록
				for (int i = 0; i < list.size(); i++) {
					quz.setNum(Math.max(list.get(i).getNum(), i) + 1);
				} // 중간 번호가 비었을 때 어떻게 작성하는가
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

			} else if (menu == 5) {
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

			} else if (menu == 6) {
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
