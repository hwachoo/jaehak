package com.edu.collect;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class StudentApp {

	List<Student> list = new ArrayList<Student>();// 컬렉션 생성
	Scanner scn = new Scanner(System.in);

	// 생성자
	public StudentApp() {
		list.add(new Student(101, "아무개", 80, 60));
		list.add(new Student(102, "감자바", 72, 81));
		list.add(new Student(103, "김철수", 56, 91));
		list.add(new Student(104, "김철수", 80, 92));
	}

	// 멤버클래스
	class StudentServiceImpl implements StudentService { // 기능생성

		@Override
		public void insertStudent(Student student) {
			list.add(student); // 추가.
		}

		@Override // 1건조회
		public Student getStudent(int sno) { // 학생번호를 통하여
			for (int i = 0; i < list.size(); i++) {
				if (list.get(i).getStudNum() == sno) { // StudNum과 sno의 값이 같을때
					return list.get(i); // 결과출력
				}
			}
			return null;
		}

		@Override // 전체리스트
		public List<Student> studentList() {
			return list;
		}

		@Override // 수정
		public void modifyStudent(Student student) { // 수정
			for (int i = 0; i < list.size(); i++) {
				if (list.get(i).getStudNum() == student.getStudNum()) {
					list.get(i).setEngSc(student.getEngSc());
					list.get(i).setKorSc(student.getKorSc());
				}
			}
		}

		@Override // 삭제
		public void deleteInfo(Student student) {
			for (int i = 0; i < list.size(); i++) {
				if (list.get(i).getStudNum() == student.getStudNum()) {
					list.remove(i);
				}
			}
		}

		@Override // 이름조회
		public List<Student> studentList(String name) {
			List<Student> searchList = new ArrayList<Student>();
			for (int i = 0; i < list.size(); i++) {
				if (list.get(i).getStudName().equals(name)) {
					searchList.add(list.get(i));
				}
				// 같은 이름이 있는지 탐색, 있으면 searchList.add()
			}
			return searchList;
		}
	} // end of StudentService

	public void execute()/* 실제 실행되는 내용, 다른 기능 불러옴 */ {
		StudentService/* 인터페이스 */ service/* 변수선언 */ = new StudentServiceImpl/* 인터페이스 구현 클래스 */();
		// 1.추가 2.리스트 3.한건조회 4.수정 5.삭제 9.종료
		int menu = 0;
		int studNum = 0;
		String studName;
		while (true) {
			System.out.println("1. 추가 2. 리스트 3. 한건조회 4. 수정 5. 삭제 6. 이름조회 9.종료");
			System.out.println("선택>> ");
			menu = scn.nextInt();

			if (menu == 1) {
				// 학생정보 추가 입력

				System.out.println("학번>> "); // Scanner?
				studNum = scn.nextInt();
				System.out.println("이름>> ");
				studName = scn.next();
				System.out.println("영어점수>> ");
				int EngSc = scn.nextInt();
				System.out.println("국어점수>> ");
				int KorSc = scn.nextInt();

				Student s1 = new Student(studNum, studName, EngSc, KorSc);
				service.insertStudent(s1);

			} else if (menu == 2) {
				List<Student> list = service.studentList();
				for (Student s : list) {
					System.out.println("===============");
					System.out.println(s.toString());
					System.out.println("===============");
					System.out.println();
				}

			} else if (menu == 3) {
				System.out.println("조회번호 입력(학생번호)>>");
				studNum = scn.nextInt();
				Student student = service.getStudent(studNum);
				if (student == null) {
					System.out.println("조회된 결과가 없습니다.");
				} else {
					System.out.println("===============");
					System.out.println(student.toString());
					System.out.println("===============");
					System.out.println();
				}
			} else if (menu == 4) {
				int EngSc, KorSc;
				while (true) {
					System.out.println("수정 대상 학번>> "); // Scanner?
					studNum = scn.nextInt();
					Student student = service.getStudent(studNum);
					if (student != null) {
						System.out.println("영어점수>> ");
						EngSc = scn.nextInt();
						System.out.println("국어점수>> ");
						KorSc = scn.nextInt();
						service.getStudent(studNum);
					} else {
						System.out.println("해당 학번이 존재하지 않습니다.");
						continue;
					}
					break;
				}
				Student s1 = new Student(studNum, null, EngSc, KorSc);
				service.modifyStudent(s1);
				System.out.println("처리가 완료되었습니다.");

			} else if (menu == 5) {
				while (true) {
					System.out.println("삭제 대상 학번>>");
					studNum = scn.nextInt();
					Student student = service.getStudent(studNum);
					if (student != null) {
						service.deleteInfo(student);
						System.out.println("삭제가 완료되었습니다.");
					} else {
						System.out.println("해당 학번이 존재하지 않습니다.");
						continue;
					}
					break;
				}
			} else if (menu == 6) {
				System.out.println("이름 입력>>");
				studName = scn.next();
				List<Student> student = service.studentList(studName);
				for (Student s : list) {
					System.out.println(student.toString());
					break;
				}

			} else if (menu == 9) {
				System.out.println("프로그램을 종료합니다.");
				break;
			}
		}
		System.out.println("end of program");

	}
}
