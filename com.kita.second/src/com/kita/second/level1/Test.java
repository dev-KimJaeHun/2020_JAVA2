package com.kita.second.level1;

import java.util.Scanner;

public class Test {
	public static void main(String[] args) {
		Calc myCalc = new Calc();
//		double pi = myCalc.pi;
		double pi = Calc.pi;
//		int num = Calc.num;
		int num = myCalc.num;
		myCalc.num = 15;
		System.out.println("myCalc.num: " + myCalc.num);
		
		Calc yourCalc = new Calc();
		System.out.println("yourCalc.num: " + yourCalc.num);
		
		Calc.pi = 3.14;
		System.out.println("Calc.pi: " + Calc.pi);
		
		System.out.println("------------------------");
//		Korean jh = new Korean("대한민국");
//		System.out.println(jh.nation);
//		
//		Korean ms = new Korean("미국");
//		System.out.println(ms.nation);
		
		Scanner sc = new Scanner(System.in);
		ClassEx c1 = new ClassEx();
		int result = c1.sum(3,8,4,1,2,6,7,3,1);	
		// int[] arr = {3,8,4,1,2,6,7,3,1};
		System.out.println("result: " + result);
		int result2 = c1.sum(4,5,6,7,8,9,10,11,2,3);
		System.out.println("result2: " + result2);
	}
}
