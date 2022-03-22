package com.edu.interfaces;

public class MySqlDao implements Dao {

	@Override
	public void select() {
		System.out.println("MySQLDB에서 조회합니다.");
	}

	@Override
	public void insert() {
		System.out.println("MySQLDB에서 입력합니다.");
	}

	@Override
	public void update() {
		System.out.println("MySQLDB를 수정합니다.");
	}

	@Override
	public void delete() {
		System.out.println("MySQLDB를 삭제합니다.");
	}

}
