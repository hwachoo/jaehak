package com.prod.emp;

import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;

public class EmpDAO extends DAO {

	// 전체 조회
	public List<Employee> empList() {
		List<Employee> employees = new ArrayList<Employee>();

		conn = getConnect();
		try {
			psmt = conn.prepareStatement("select * from emp_java");
			rs = psmt.executeQuery("select * from emp_java order by employee_id");
			while (rs.next()) {
				Employee emp = new Employee();
				emp.setEmployeeId(rs.getInt("employee_id")); // employees.employee_id 칼럼의 값 읽어옴
				emp.setFirstName(rs.getString("first_name"));
				emp.setLastName(rs.getString("last_name"));
				emp.setEmail(rs.getString("email"));
				emp.setHireDate(rs.getString("hire_date").substring(0, 10));
				emp.setSalary(rs.getInt("salary"));
				emp.setJobId(rs.getString("job_id"));

				boolean tOrF = employees.add(emp); //boolean 타입으로 결과값받아옴
				if(tOrF) {
					System.out.println("정상");
				}else
					System.out.println("오류");
			}
		} catch (SQLException e) {
			e.printStackTrace();
		} finally {
			disconnect();
		}
		return employees;
	}
	// 1건 조회

	public Employee searchEmp(int eid) {
		conn = getConnect();
		Employee emp = null;
		String sql = "select *\r\n"
				+ "from emp_java\r\n"
				+ "where employee_id = ?";
		try {
			psmt = conn.prepareStatement(sql);
			psmt.setInt(1, eid);
			rs = psmt.executeQuery();
			while (rs.next()) {
				emp = new Employee();
				emp.setEmployeeId(rs.getInt("employee_id")); // employees.employee_id 칼럼의 값 읽어옴
				emp.setFirstName(rs.getString("first_name"));
				emp.setLastName(rs.getString("last_name"));
				emp.setEmail(rs.getString("email"));
				emp.setHireDate(rs.getString("hire_date").substring(0, 10));
				emp.setSalary(rs.getInt("salary"));
				emp.setJobId(rs.getString("job_id"));

			}
		} catch (SQLException e) {
			e.printStackTrace();
		} finally {
			disconnect();
		}
		return emp;
		
	}

	// 입력 처리 executeUpdate()
	public boolean insertEmp(Employee emp) {
		conn = getConnect();
		String sql = "insert into emp_java (employee_id, last_name, email, hire_date, job_id)\r\n"
				+ "values (?, ?, ?, ?, ?)";
		try {
			psmt = conn.prepareStatement(sql);
			psmt.setInt(1, emp.getEmployeeId()); // ? <= 매개변수(Employee emp)가 가지고 있는 employeeId 필드값
			psmt.setString(2, emp.getLastName());
			psmt.setString(3, emp.getEmail());
			psmt.setString(4, emp.getHireDate());
			psmt.setString(5, emp.getJobId());
			int r = psmt.executeUpdate(); // 쿼리가 실행된 건수를 리턴해줌
			System.out.println(r + "건 입력됨.");
			if(r > 0) {
				return true;
			}

		} catch (SQLException e) {
			e.printStackTrace();
		} finally {
			// 정상실행여부 관계 없이 반드시 실행할 코드
			disconnect();
		}
		return false;
	}

	// 수정 처리
	public boolean updateEmp(Employee emp) {
		conn = getConnect();
		String sql = "update emp_java " 
				+ "set first_name = ?, " 
				+ "    phone_number = ?, " 
				+ "    salary = ? "
				+ "where employee_id = ?";
		// 쿼리 작성 완료 => 파라미터(?) 작성.
		try {
			psmt = conn.prepareStatement(sql);
			// 파라미터 값을 지정
			psmt.setString(1, emp.getFirstName());
			psmt.setString(2, emp.getPhoneNumber());
			psmt.setInt(3, emp.getSalary());
			psmt.setInt(4, emp.getEmployeeId());

			int r = psmt.executeUpdate(); // 실행
			System.out.println(r + "건 수정됨.");
			if(r>0) {
				return true;
			}
			
		} catch (SQLException e) {
			e.printStackTrace();
		} finally {
			disconnect();
		}
		return false;
	}

	// 삭제 처리
	public boolean deleteEmp(int empId) { // id기준으로 삭제
		conn = getConnect();
		String sql = "delete from emp_java\r\n" + "where employee_id = ?";
		try {
			psmt = conn.prepareStatement(sql);
			psmt.setInt(1, empId);

			int r = psmt.executeUpdate();
			System.out.println(r + "건 삭제됨.");
			if(r>0) {
				return true;
			}
		} catch (SQLException e) {
			e.printStackTrace();
		} finally {
			disconnect();
		}
		return false;
	}
}
