package com.edu.nested;

public class Outer {
	// 메소드, 필드 = 멤버

	private String field1;
	private int field2;

	class Inner { // 멤버 클래스, 클래스 안의 클래스
		String field3;
		int field4;

		void method2() {
			System.out.println("Inner.method2()");
		}
	}
	//함수적 인터페이스 : 구현해야 할 메소드가 1개인 것
	interface Runnable {
		void run();
	}

	class Bus implements Runnable {

		@Override
		public void run() {
			System.out.println("\"Bus가 달립니다.\"");
		}

	}

	public String getField1() {
		return field1;
	}

	public void method1() {
		System.out.println("Outer.method1()");
		Inner inner = new Inner();
		inner.method2();
	}

	public void method3() {
		System.out.println("Outer.method3()");

		class Local { // 로컬 클래스, 메소드 안의 클래스 선언

			void method4() {
				System.out.println("Local.method4()");
			}
		}
		Local local = new Local();
		local.method4();
	}

	public void method4() {
		Runnable runnable = new Bus(); // 인터페이스의 구현객체여서 가능
		runnable.run();

		//익명구현객체.(람다표현식에서 자주 사용) 일회성
		runnable = new Runnable() {//runnable의 구현객체를 중괄호 안에 선언
			
			@Override
			public void run() {
				System.out.println("임의의 객체가 실행됩니다.");
			}
		};
		
		runnable.run();
		
	}

}
