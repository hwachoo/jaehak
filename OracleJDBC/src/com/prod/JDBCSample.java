package com.prod;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;

// ojdbc 라이브러리 추가, oracledb와 연결(db접속주소, hr, hr), Connection객체
// query 실행(Statement, PreparedStatement)
public class JDBCSample {
//	DriverManager
	static Connection conn;
	static Statement stmt;
	static ResultSet rs;
	static PreparedStatement psmt;

	public static Connection getConnect() {
		try {
			Class.forName("oracle.jdbc.driver.OracleDriver");
			conn = DriverManager.getConnection("jdbc:oracle:thin:@localhost:1521:xe", "hr", "hr");
		} catch (ClassNotFoundException | SQLException e) {
			e.printStackTrace();
		}
		System.out.println("연결성공!!");
		return conn;

	}

	public static void disconnect() {
		try {
			if (rs != null)
				rs.close();
			if (stmt != null)
				stmt.close();
			if (psmt != null)
				psmt.close();
			if (conn != null)
				conn.close();
		} catch (SQLException e) {
			e.printStackTrace();
		}
	}

	public static void main(String[] args) {
		conn = getConnect(); // connect 객체 생성
		// Statement 생성 query 호출
		try {

			// 입력 사원번호, last_name, 입사일, 이메일, job_id
			int emp_id = 301;
			String last_name = "홍길동";
			String hire_date = "2020-03-05";
			String email = "hgd@email.com";
			String job = "IT-PROG";

			String fn = "kildong";
			String pn = "010-xxxx-xxxx";
			int salary = 8000;

			String sql = "delete from emp_java --삭제\r\n"
					+ "where employee_id = ?";
			psmt = conn.prepareStatement(sql);// query 연결
//			psmt.setString(1, fn);
//			psmt.setString(2, pn);
//			psmt.setInt(3, salary);
			psmt.setInt(1, emp_id);

			int r = psmt.executeUpdate(); // 입력, 수정, 삭제(execute~~(query)
			System.out.println(r + "건 삭제됨.");

			// 조회
//			rs = stmt.executeQuery("select * from emp_java order by employee_id"); //order by ~ = 사원번호 순으로 정렬
//			while(rs.next()) { //next메소드 - 불러온 데이터 중 set컬렉션에 1건의 데이터를 확인하고 가져옴
//				System.out.println("사원번호: " + rs.getInt("employee_id"));
//				System.out.println("이름: " + rs.getString("first_name"));
//			}
		} catch (SQLException e1) {
			e1.printStackTrace();
		}

		disconnect();

	}
}
