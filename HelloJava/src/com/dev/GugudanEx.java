package com.dev;

public class GugudanEx {

	public static void main(String[] args) { // static = instance를 안 만들어도 실행 가능
		for (int i = 1; i <= 5; i++) {
			printStar(i, "★");
			System.out.println();
		}
//		gududan(5);
//		int result = sum(sum(10, 20), sum(5, 7));
//		int[] newAry = { 10, 20, 30 };
//		sum(newAry);
//		result = sum(newAry);
////		double result = divide(2, 5);
//
//		System.out.println("결과는" + result);
	} // end of main()

	public static int sum(int[] ary) {
		//배열매개변수 각 요소 합
		int sum = 0;
		for(int i = 0; i < ary.length; i++){
			sum += ary[i];
		}
		return sum;
		
	}

	// 나눗셈 (int, int ) 반환값 double
	public static double divide(int v1, int v2) {
		if (v2 == 0) {
			return 0;
		}
		return (double) v1 / v2;
	}

	public static int sum(int n1, int n2) {
		return n1 + n2;
	}

	public static void printStar(int runCnt, String shape) { // 메소드 안에 메소드가 들어가면 안됨
		for (int i = 0; i < runCnt; i++) {
			System.out.println(shape);
		}
	}

	public static void gududan(int dan) {
		System.out.println("[" + dan + "단]");
		for (int i = 1; i <= 9; i++) {
			System.out.printf("%2d * %2d = %2d\n", dan, i, (i * dan));
		}
		System.out.println();
	}

	public static void printGugudan() {
		// 메소드 실행하려면 new 'class();'로 초기화
		// ex) Student s1 = new Student(); -> s1 필드나 메소드 활용가능
//				Student.callStatic();
		for (int j = 1; j <= 9; j++) {
			int cnt = j;
//					System.out.println("[" + cnt + "단]");
			for (int i = 2; i <= 9; i++) {
				System.out.printf("%2d * %2d = %2d / ", i, cnt, (i * cnt));
			}
			System.out.println();
			///
		}
	} // end of printGugudan()

} // end of GugudanEx