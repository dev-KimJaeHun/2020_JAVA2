package com.kita.second.level2;

public class NetflixTest {
	public static void main(String[] args) {
		// 매개변수의 다형성
		ProGamer hong = new ProGamer();
		Game gm = new Game();
		BattleGround bg = new BattleGround();
		Overwatch ow = new Overwatch();
		
		hong.work(gm);
		hong.work(bg);
		hong.work(ow);
		
		
//		Viewer rv = new Viewer();
//		rv.chooseNew();
	
		
		
	}
}
