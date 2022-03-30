package com.prod.emp;

import java.util.List;
import java.util.Scanner;

public class EmpExe {
	public static void main(String[] args) {
		EmpDAO dao = new EmpDAO(); // 인스턴스 선언
		Scanner scn = new Scanner(System.in);
		// 메뉴: 1. 리스트, 2. 입력, 3. 수정, 4. 삭제 5. 한건조회 9. 종료
		while (true) {
			System.out.println("1. 리스트 2. 입력 3. 수정 4. 삭제 5. 한건조회 9. 종료");
			System.out.println("메뉴선택>>");
			int menu = scn.nextInt();

			if (menu == 1) { // 리스트
				List<Employee> list = dao.empList(); // 전체 조회기능

				System.out.println("사원리스트");
				for (Employee emp : list) {
					System.out.println(emp.toString());
				}
			} else if (menu == 2) { // 입력
				// 사원번호, lastname, email, hiredate, jobid

				Employee emp = new Employee();

				System.out.println("사원번호입력>> ");
				emp.setEmployeeId(scn.nextInt());
				System.out.println("lastname입력>> ");
				emp.setLastName(scn.next());
				System.out.println("이메일입력>> ");
				emp.setEmail(scn.next());
				System.out.println("입사일입력>> ");
				emp.setHireDate(scn.next());
				System.out.println("직무명입력>> ");
				emp.setJobId(scn.next());
				;

				boolean result = dao.insertEmp(emp);
				if(result)
					System.out.println("정상적으로 처리되었습니다.");
				else
					System.out.println("입력에 오류가 발생했습니다.");

			} else if (menu == 3) { // 수정
				// 사원번호 전화번호 성 급여
				Employee emp = new Employee();

				System.out.println("사원번호입력>> ");
				emp.setEmployeeId(scn.nextInt());
				System.out.println("전화번호입력>> ");
				emp.setPhoneNumber(scn.next());
				System.out.println("firstname입력>> ");
				emp.setFirstName(scn.next());
				System.out.println("급여입력>> ");
				emp.setSalary(scn.nextInt());

				boolean result = dao.updateEmp(emp);
				if(result)
					System.out.println("정상적으로 처리되었습니다.");
				else
					System.out.println("오류가 발생했습니다.");

			} else if (menu == 4) { // 삭제
				int empId = 0;
				System.out.println("사원번호 입력>> ");
				empId = scn.nextInt();

				dao.deleteEmp(empId);

			} else if (menu == 5) { // 한건조회
				int eid = 0;
				System.out.println("사원번호 입력>> ");
				eid = scn.nextInt();

				Employee emp = dao.searchEmp(eid);
				if (emp == null) {
					System.out.println("조회결과가 없습니다.");
				}else {
					System.out.println(emp.toString());
				}

			} else if (menu == 9) { // 종료
				System.out.println("프로그램을 종료합니다.");
				break;
			} else {
				System.out.println("잘못된 메뉴를 선택했습니다.");
			}

		} // end of while
		System.out.println("end of program");
		scn.close();
	}// end of main
}// end of class
