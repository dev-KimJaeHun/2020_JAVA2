package com.kita.second.level1.practice;

public class Practice01 {
	// 구구단 2단찍기
	// 2 * 1 = 2
	// 2 * 2 = 4
	// ...
	// 2 * 9 = 18
	// 리턴타입 printGugudan(매개변수) {
	//	실행코드
	// }
	
	// 오버로딩
	// 1. 매개변수 갯수, 2. 리턴타입 3. 매개변수 위치
	
	public void printGugudan(int dan) {
		for(int i=1; i<10; i++) {
			System.out.printf("%d * %d = %d\n", dan, i, dan * i);
		}
	}
	
	// 별찍기 메소드
	// 내가 입력하는 값에 따라 Line(을)를과 star(별 개수)가 달라지도록
	// line: 3, star: 5
	// *****
	// *****
	// *****
	public void printStar(int line, int star) {
		System.out.printf("line: %d, star: %d\n", line, star);
		for(int i=0; i<line; i++) {
			for(int j=0; j<star; j++) {
				System.out.print("*");
			} System.out.println();
		}
	}
	
	public static int sum(int n1, int n2) {
		return n1+n2;
	}
	
	public static void main(String[] args) {
		Practice01 p = new Practice01();
		p.printGugudan(2);
		System.out.println();
		p.printGugudan(3);
		System.out.println();
		p.printStar(3, 5);
		int result = sum(1, 2);
		int result2 = sum(1, 3);
		System.out.println(result);
	}
}
