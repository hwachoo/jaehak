package com.dev;

public class ForExample5 {
	public static void main(String[] args) {
		int num=48; // 약수를 구하는 프로그램
		int sum=0; //; = 앞 명령을 종결
		
		for(int i = 1; i <= 48; i++) {
			if(48 % i ==0) {
				System.out.println(i);
				sum = sum + i;
	}
}
		System.out.println("약수의 합" + sum);

}
}