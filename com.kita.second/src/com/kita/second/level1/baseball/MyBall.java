package com.kita.second.level1.baseball;

import java.util.Scanner;

public class MyBall {
	// 내가 숫자값 입력하고 메모 처리하는 클래스
	// 필드
	
	private int[] myArr;
	private Scanner sc;
	
	public MyBall(int gameCnt) {
		myArr = new int[gameCnt];
		setRandom();
		
	}

	public int[] getRNum() {
		return myArr;
	}

	public void setRandom() {
		sc = new Scanner(System.in);
		int max = 9;
		int min = 1;
		System.out.println("숫자야구게임 시작!");
			// 내가 정수값 3개 입력받아서 myArr에 넣기
			for(int i=0; i<myArr.length; i++) {
				System.out.printf("값%d: \n", i+1);
				myArr[i] = sc.nextInt(); 
				if(myArr[i] < min || myArr[i] > max) {
					System.out.println("범위 밖의 숫자입니다.");
					i--;
					continue;
				}
				for(int z=0; z<i; z++) {
					if(myArr[i] == myArr[z]) {
						System.out.println("중복된 숫자입니다.");
						i--;
						break;
					}
				}
			} sc.close();
	}


}
