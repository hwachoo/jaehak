package com.edu;

public class Vehicle {
	
	private int maxSpeed;
	
	public Vehicle() {
		this.maxSpeed = 100;
	}
	
	public int getMaxSpeed() {
		return maxSpeed;
	}
	
	
	@Override
	public String toString() {
		return "자동차의 최고속도는 " + getMaxSpeed() + "입니다.";
	}

	public void setMaxSpeed(int maxSpeed) {
		this.maxSpeed = maxSpeed;
	}

	public void run() {
		System.out.println("탈것이 달립니다.");
	}
	
	public void stop() {
		System.out.println("탈것이 멈춥니다.");
	}

}
