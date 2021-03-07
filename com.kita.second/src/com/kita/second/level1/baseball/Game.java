package com.kita.second.level1.baseball;

import java.util.Arrays;

public class Game {
	// 실제 게임 실행하는 클래스
	public static void main(String[] args) {
		int gameCnt = 3;
		Baseball ball = new Baseball(gameCnt);
		MyBall myball = new MyBall(gameCnt);
		
		System.out.println(Arrays.toString(ball.getRNum()));
		System.out.println(Arrays.toString(myball.getRNum()));
		
		
	}
}
