package com.edu.collect;

import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;


public class StudentServiceOracle extends DAO implements StudentService {

	@Override
	public void insertStudent(Student student) {
		conn = getConnect();
		String sql = "insert into student_info (student_no, student_name, eng_score, kor_score) \r\n"
				+ "values (?, ?, ?, ?)";
		try {
			psmt = conn.prepareStatement(sql);
			psmt.setInt(1, student.getStudNum()); // ? <= 매개변수(Employee emp)가 가지고 있는 employeeId 필드값
			psmt.setString(2, student.getStudName());
			psmt.setInt(3, student.getEngSc());
			psmt.setInt(4, student.getKorSc());

			int r = psmt.executeUpdate(); // 쿼리가 실행된 건수를 리턴해줌
			System.out.println(r + "건이 입력됨.");

		} catch (SQLException e) {
			e.printStackTrace();
		} finally {
			// 정상실행여부 관계 없이 반드시 실행할 코드
			disconnect();
		}
	}

	@Override //1건 조회
	public Student getStudent(int sno) {
		conn = getConnect();
		Student stud = null;
		String sql = "SELECT * " + "FROM student_info " + "WHERE student_no = ?";
		try {
			psmt = conn.prepareStatement(sql);
			psmt.setInt(1, sno);
			rs = psmt.executeQuery();
			while (rs.next()) {
				stud = new Student();
				stud.setStudNum(rs.getInt("student_no"));
				stud.setStudName(rs.getString("student_name"));
				stud.setEngSc(rs.getInt("eng_score"));
				stud.setKorSc(rs.getInt("kor_score"));
			}
		} catch (SQLException e) {
			e.printStackTrace();
		} finally {
			disconnect();
		}
		return stud;
	}

	@Override //학생리스트
	public List<Student> studentList() {
		List<Student> list = new ArrayList<Student>(); // 조회된 결과값을 담기 위한 컬렉션
		conn = getConnect();
		String sql = "select * from student_info order by student_no";
		try {
			psmt = conn.prepareStatement(sql);
			rs = psmt.executeQuery(); // 실행건수만큼 반복자
			while (rs.next()) { // 반복자를 통해 요소를 가지고 올 수 있는지 확인, 있을 경우 하나 가지고 옴.
				Student student = new Student();
				student.setStudNum(rs.getInt("student_no"));
				student.setStudName(rs.getString("student_name"));
				student.setEngSc(rs.getInt("eng_score"));
				student.setKorSc(rs.getInt("kor_score"));

				list.add(student);
			}
		} catch (SQLException e) {
			e.printStackTrace();
		} finally {
			disconnect();
		}
		return list;
	}

	@Override //수정
	public void modifyStudent(Student student) {
		conn = getConnect();
		String sql = "UPDATE student_info " 
				+ "SET eng_score = ?, " 
				+ "	   kor_score = ? " 
				+ "WHERE student_no = ?";
		try {
			psmt = conn.prepareStatement(sql);
			psmt.setInt(1, student.getEngSc());
			psmt.setInt(2, student.getKorSc());
			psmt.setInt(3, student.getStudNum());

			int r = psmt.executeUpdate();
			System.out.println(r + "건이 수정되었습니다.");
			if (r > 0) {
			} 
		} catch (SQLException e) {
			e.printStackTrace();
		} finally {
			disconnect();
		}
	}

	@Override //삭제
	public void deleteInfo(int sno) {
		conn = getConnect();
		String sql = "DELETE FROM student_info\r\n" 
					+ "WHERE student_no = ?";
		try {
			psmt = conn.prepareStatement(sql);
			psmt.setInt(1, sno);

			int r = psmt.executeUpdate();
			System.out.println(r + "건 삭제됨.");
		} catch (SQLException e) {
			e.printStackTrace();
		} finally {
			disconnect();
		}

	}

	@Override
	public Student getoneStudent(String name) {
		conn = getConnect();
		Student stud = null;
		String sql = "SELECT *\r\n"
				+ "FROM student_info\r\n"
				+ "WHERE student_name LIKE '%'||?||'%'";
		try {
			psmt = conn.prepareStatement(sql);
			psmt.setString(1, name);
			rs = psmt.executeQuery();
			while (rs.next()) {
				stud = new Student();
				stud.setStudNum(rs.getInt("student_no"));
				stud.setStudName(rs.getString("student_name"));
				stud.setEngSc(rs.getInt("eng_score"));
				stud.setKorSc(rs.getInt("kor_score"));
			}
		} catch (SQLException e) {
			e.printStackTrace();
		} finally {
			disconnect();
		}
		return stud;
	}

	@Override
	public void saveToFile() {

	}

	@Override
	public List<Student> studentList(String name) {
		return null;
	}

}
