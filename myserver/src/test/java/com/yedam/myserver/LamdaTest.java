package com.yedam.myserver;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;

import com.yedam.myserver.emp.vo.Employee;

public class LamdaTest {
	public static void main(String[] args) {
		List<Employee> list = new ArrayList<>();

		// .build쓸 경우 앞에 선언한 내용들로 객체를 생성함
		list.add(Employee.builder().email("a@a.c").salary(1000).build());
		list.add(Employee.builder().email("z@a.c").salary(300).build());
		list.add(Employee.builder().email("s@a.c").salary(2000).build());
		list.add(Employee.builder().email("w@a.c").salary(1900).build());

		// 인수, 정렬기준
		//익명 클래스로 선언과 생성 한번에 해결(class선언x)
		Collections.sort(list, new Comparator<Employee>() { 
			@Override
			public int compare(Employee o1, Employee o2) {
				return o1.getSalary() - o2.getSalary();
			}});
		//람다식 조건 : 부모 인터페이스의 오버라이딩해야할 method가 1개일 경우
		//실행해야할 메소드의 인수만 작성(o1, o2만 작성해도 됨)
		Collections.sort(list, (Employee o1, Employee o2)
				-> o1.getSalary() - o2.getSalary());
		
		
		for(Employee emp : list) {
			System.out.println(emp.getEmail()+ ", "+ emp.getSalary());
		}
	}
}

class EmpComp implements Comparator<Employee> {

	@Override
	public int compare(Employee o1, Employee o2) {
		return o1.getEmail().compareTo(o2.getEmail());
	}

}