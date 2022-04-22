package projectSample;

import java.util.*;
//import javax.swing.JLabel;
//import java.awt.Font;
//import java.io.*;

public class QuizApp {
	QuizServiceOracle qso = new QuizServiceOracle();
	Scanner scn = new Scanner(System.in);

	public void execute() {
		System.out.println("┌-------------------------------------------------------------------------------------┐");
		System.out.println(" 1.해당 프로그램은 별도의 회원가입 없이 자유롭게 이용가능합니다.");
		System.out.println(" 2.모든 문제는 랜덤하게 출력됩니다.");
		System.out.println(" 3.문제의 양이 많아지면 랜덤문제의 메뉴가 더욱 늘어날 예정입니다.");
		System.out.println(" 4.문제를 생성할 때에는 문제와 선택지는 enter를 한 번 더 입력해야 하며");
		System.out.println("   해설은 enter를 통해 줄바꿈이 가능하고 입력 완료 시 'enter' -> '-' -> 'enter'순으로 입력하여야 완료됩니다");
		System.out.println(" 5.문제를 수정하거나 삭제할 때에는 리스트에서 확인 가능한 문제번호를 입력하여야 가능합니다.");
		System.out.println("└-------------------------------------------------------------------------------------┘");

		while (true) {
			System.out.println("┌-------------------------------------------------------┐");
			System.out.println("|1.전체 문제 풀어보기 |2.랜덤 문제 풀기 |3.문제 조회 |4.문제 생성      |\r\n|5.문제 수정 |6.문제 삭제 |9.종료 \t\t\t\t|");
			System.out.println("└-------------------------------------------------------┘");
			System.out.print("선택>>");
			int menu = 0;

			try {
				menu = scn.nextInt();
			} catch (InputMismatchException e) {
				System.out.println("숫자를 입력하세요.");
				scn.nextLine();

			}

			if (menu == 1) {
				int corrects = 0;
				int source = 0;
				List<Quiz> list = qso.Quizlist();
				Collections.shuffle(list);

				for (int i = 0; i < list.size(); i++) {
					System.out.println("====================================================================");
					System.out.println(list.get(i).getQuiz());
					System.out.println(list.get(i).getChoice());
					System.out.println("정답을 입력하세요.");
					int input = (scn.nextInt());

					if (list.get(i).getAnswer() == input) {
						corrects++;
						System.out.println("정답입니다.");
					} else {
						System.out.println("오답입니다.");
						System.out.println("정답 :" + list.get(i).getAnswer());
						System.out.println("해설 :" + list.get(i).getComm());
					}

					if (list.get(i).getAnswer() != 0) {
						source++;
					}
				}
				System.out.println("====================================================================");
				System.out.println();
				System.out.println("┌-----------------------┐");
				System.out.println("\t 맞춘 갯수");
				System.out.println("\t  " + corrects + "/" + source + "개"); // 맞춘 문제 개수/전체문제 개수 표기(list의 integer?)
				System.out.println("└-----------------------┘");
				System.out.println();

			} else if (menu == 2) { // 랜덤 문제 풀기
				List<Quiz> list = qso.Quizlist();
				

				while (true) {
					Collections.shuffle(list);
					System.out.println("┌----------------------------------------------┐");
					System.out.println("|1.1문제 풀기 | 2.3문제 풀기 | 3.5문제 풀기 | 0.돌아가기  |");
					System.out.println("└----------------------------------------------┘");
					System.out.print("선택>>");
					int menu2 = 0;
					try {
						menu2 = scn.nextInt();
					} catch (InputMismatchException e) {
						System.out.println("숫자를 입력하세요.");
						scn.nextLine();
						continue;
					}

					if (menu2 == 1) {
						for (int i = 0; i < 1; i++) {
							while (true) {
								int input = 0;
								System.out.println(
										"====================================================================");
								System.out.println(list.get(i).getQuiz());
								System.out.println(list.get(i).getChoice());
								System.out.println("정답을 입력하세요.");
								try {
									input = scn.nextInt();

									if (list.get(i).getAnswer() == input) {
										System.out.println("정답입니다.");
										System.out.println(
												"====================================================================");
										System.out.println();
									} else {
										System.out.println("오답입니다.");
										System.out.println("정답 :" + list.get(i).getAnswer());
										System.out.println("해설 :" + list.get(i).getComm());
										System.out.println(
												"====================================================================");
										System.out.println();
									}
									break;
								} catch (InputMismatchException e) {
									System.out.println("숫자를 입력하세요.");
									scn.nextLine();
								}
							}
						}
					} else if (menu2 == 2) {
						int corrects = 0;
						int source = 0;
						int input = 0;
						for (int i = 0; i < 3; i++) {

							System.out.println("====================================================================");
							System.out.println(list.get(i).getQuiz());
							System.out.println(list.get(i).getChoice());
							System.out.println("정답을 입력하세오.");
							
							try {
								input = (scn.nextInt());
								
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
									System.out.println("해설 :" + list.get(i).getComm());
								}
							}catch(InputMismatchException e) {
								System.out.println("숫자를 입력하세요.");
								scn.nextLine();
								i--;
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
						int input = 0;
						for (int i = 0; i < 5; i++) {

							System.out.println("====================================================================");
							System.out.println(list.get(i).getQuiz());
							System.out.println(list.get(i).getChoice());
							System.out.println("정답을 입력하세요.");
							try {
								input = (scn.nextInt());

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
									System.out.println("해설 :" + list.get(i).getComm());
								}
							}catch(InputMismatchException e) {
								System.out.println("숫자를 입력하세요.");
								scn.nextLine();
								i--;
							}
						}
						System.out.println("====================================================================");
						System.out.println();
						System.out.println("┌-----------------------┐");
						System.out.println("\t 맞춘 갯수");
						System.out.println("\t  " + corrects + "/" + source + "개"); // 맞춘 문제 개수/전체문제 개수 표기(list의
																					// integer?)
						System.out.println("└-----------------------┘");
						System.out.println();
					} else if (menu2 == 0) {
						break;
					} else {
						System.out.println("잘못된 메뉴를 선택했습니다.");
					}
				}

			} else if (menu == 3) { // 전체 리스트
				List<Quiz> list = qso.Quizlist();
				for (Quiz q : list) {
					System.out.println("====================================================================");
					System.out.println(q.toString());
					System.out.println("====================================================================");
				}

			} else if (menu == 4) { // 문제 생성
				List<Quiz> list = qso.Quizlist();
				Quiz quz = new Quiz();
				String insert = ""; // 해설 개행을 위한 변수 선언
				String s = "-";
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
				scn.nextLine();
				System.out.println("해설을 입력하세요."); // 한자 입력 정상적으로 됨
				System.out.println("(입력완료 시 엔터-> - -> 엔터)");
				while (true) {
					String insert1 = scn.nextLine();
					if (insert1.equals(s)) {
						break;
					} else {
						insert = insert + "\n" + insert1;
					}
				}
				quz.setComm(insert); // 현재 -만 입력됨

				qso.insertQuiz(quz);

			} else if (menu == 5) { // 문제 수정
				String insert = ""; // 해설 개행을 위한 변수 선언
				String s = "-";
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
				scn.nextLine();
				System.out.println("해설을 입력하세요.");
				System.out.println("(입력완료 시 엔터 -> - -> 엔터)");
				while (true) {
					String insert1 = scn.nextLine();
					if (insert1.equals(s)) {
						break;
					} else {
						insert = insert + "\n" + insert1;
					}
				}
				quz.setComm(insert); // 현재 -만 입력됨

				qso.modifyQuiz(quz);

			} else if (menu == 6) {
				while (true) {
					int qn = 0;
					System.out.println("문제번호 입력>> ");
					try {
						qn = scn.nextInt();
					} catch (InputMismatchException e) {
						System.out.println("숫자를 입력하세요.");
						scn.nextLine();
						continue;
					}
//					qn = scn.nextInt();
					System.out.println("삭제할 문제 [" + qn + "]이 맞습니까?");
					System.out.println("1.YES 2.NO");
					int tof = scn.nextInt();
					if (tof == 1) {
						qso.deleteQuiz(qn);
						break;
					} else if (tof == 2) {
						continue;
					}
				}
			} else if (menu == 9) {
				System.out.println("시스템을 종료합니다.");
				break;
			} else {
				System.out.println("잘못된 메뉴를 선택했습니다.");
			}
		} // end of while
		scn.close();
	}// end of execute
}
