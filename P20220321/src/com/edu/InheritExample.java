package com.edu;

public class InheritExample {
//학생, 직장인, 친구 정보 -> 정보를 저장
//이름, 나이, 키, 몸무게
//학생의 경우 학교, 학년
//직장인의 경우 직장명, 직급
//친구의 경우  전화번호
	public static void main(String[] args) {
		Students student = new Students();
		student.setName("홍길동");
		student.setAge(15);
		student.setSchool("중앙고등학교");
		student.setGrade(2);
		student.setHeight(0);
		student.setWeight(0);
		
		Worker work = new Worker();
		work.setName("아무개");
		work.setAge(35);
		work.setCompany("중앙개발");
		work.setJob("개발팀장");
		
		Friend fri = new Friend();
		fri.setName("김철수");
		fri.setAge(15);
		
		//부모클래스의 참조변수에 자식클래스의 참조변수 자동형변환(Promotion)
		Person p1 = new Person();
		p1 = (Person) student;
		p1 = work;
//		student = worker; 서로 자식관계이기 때문에 자동형변환 되지 않음
		
	}
}
