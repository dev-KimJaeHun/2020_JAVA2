package com.kita.second.level3;

import java.util.Scanner;

public class TryCatch {
	public static void main(String[] args) {
		int[] arr = new int[2];
		
		try {
			// 에러가 날수 있는 코드
			System.out.println(arr[2]);
		} catch(NullPointerException e) {
			System.out.println("NullPointer 에러가 발생했습니다.");
		} catch(Exception e) {
			// 예외 발생 시 처리 코드
			System.out.println("예외가 발생했습니다.");
		}
//		finally {
//			System.out.println("예외처리구간끝");
//		}
		
		System.out.println("다음 코드");
		int num;
		Scanner sc = new Scanner(System.in);
		System.out.println("숫자를 입력하세요.");
		String strNum = sc.next();
		
		// 오류가 발생했습니다. - 2개 있음
		// 다른 모든 예외의 경우 - 알 수 없는 오류가 발생했습니다.
		try {
			num = Integer.parseInt(strNum);
			arr[2] = num;
		} catch(ArrayIndexOutOfBoundsException e) {
			System.out.println("ArrayIndexOutOfBounds 오류 발생");
		} catch(NumberFormatException e) {
			System.out.println("NumberFormat 오류 발생");
		} catch(Exception e) {
			System.out.println("알 수 없는 오류 발생");
		}
		

	}
}
