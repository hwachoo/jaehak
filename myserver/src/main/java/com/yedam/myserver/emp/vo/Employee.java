package com.yedam.myserver.emp.vo;

import java.util.Date;

import com.fasterxml.jackson.annotation.JsonFormat;
import com.fasterxml.jackson.annotation.JsonIgnore;
import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

//null이 아닌 경우, null인 경우 제외
@JsonInclude(JsonInclude.Include.NON_NULL)
//data 있을 경우 get set 선언할 필요 없이 자동으로 됨
@Data
//생성자 생성
@Builder
//빈 생성자 생성시
@NoArgsConstructor
//빈 생성자, 자동생성자 모두 지원
@AllArgsConstructor
public class Employee {

	private Integer department_id;
	private Integer manager_id;
	private Integer commission_pct;
	private Integer salary;
	private String job_id;
	//date형태를 지정
	@JsonFormat(pattern = "yyyy-MM-dd")
	private Date hire_date;
	// 해당 필드는 출력하지 않음
	@JsonIgnore
	private String phone_number;
	private String email;
	private String last_name;
	//필드의 이름을 ("")와 같이 변경
	@JsonProperty("fname")
	private String first_name;
	private Integer employee_id;
	
	//변수타입에 테이블명 작성 가능
	private Departments department;
	
	
}
