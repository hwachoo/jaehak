package com.prod;

public class Car {
	//모델, 현재속도, 최고속도, 가속도(), 감속(), 현재속도()
	private String model;
	private int speed;
	private int maxSpeed;
	private int minSpeed;
	
	public String getModel() {
		return model;
	}
	public void setModel(String model) {
		this.model = model;
	}
	public int getSpeed() {
		return speed;
	}
	public void setSpeed(int speed) {
		this.speed = speed;
	}
	public int getMaxSpeed() {
		return maxSpeed;
	}
	public void setMaxSpeed(int minSpeed) {
		this.minSpeed = minSpeed;
	}
	public int getMinSpeed() {
		return maxSpeed;
	}
	public void setMinSpeed(int minSpeed) {
		this.minSpeed = minSpeed;
	}
	
	public void addSpeed() {
		if(this.speed + 10 > this.maxSpeed) {
			System.out.println("최고속도를 초과할 수 없습니다.");
			return;
		}
		System.out.println("10km 가속합니다.");
		this.speed += 10;
		
	}
	public void breakSpeed( ) {
		if(this.speed - 10 < this.minSpeed) {
			System.out.println("후진합니다.");
		}
		System.out.println("10km 감속합니다.");
		this.speed -= 10;
	}
	
	
	
	
}
