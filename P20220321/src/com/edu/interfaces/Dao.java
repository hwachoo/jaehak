package com.edu.interfaces;

public interface Dao {
	
	public /*abstract가 기본으로 포함되어 있음*/void select();
	
	public void insert();
	
	public void update();
	
	public void delete();

}
