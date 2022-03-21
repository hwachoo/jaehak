package com.edu;

public class DriverExample {
	public static void main(String[] args) {

		Vehicle v1 = new Vehicle();
		v1 = new Taxi();
		v1 = new Bus();

		Driver driver = new Driver();
		driver.drive(v1); // 매개변수의 다형성

		Vehicle vehicle = new Vehicle();
		Taxi taxi = new Taxi();
		Bus bus = new Bus();

		System.out.println(vehicle.getMaxSpeed());
		System.out.println(taxi.getMaxSpeed());
		System.out.println(bus.getMaxSpeed());

		Vehicle[] vehicles = new Vehicle[3];
		vehicles[0] = vehicle;
		vehicles[1] = taxi;
		vehicles[2] = bus;

		int loopCnt = vehicles.length - 1; //
		for (int cnt = 0; cnt < loopCnt; cnt++) {
			Vehicle temp = vehicles[0]; // 첫번째 값으로 temp값 지정
			for (int i = 0; i < loopCnt; i++) {
				if (vehicles[i].getMaxSpeed() < vehicles[i + 1].getMaxSpeed()) {
					temp = vehicles[i];
					vehicles[i] = vehicles[i + 1];
					vehicles[i + 1] = temp;
				}
			}
		}
		System.out.println("가장 빠른 차량인 " + vehicles[0].toString()); 
		System.out.println("가장 느린 차량인 " + vehicles[2].toString());

	}
}
