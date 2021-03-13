package com.kita.second.level2.sogilli;

public class Hyori {
	// public : 제한 x
	// protected : 동일 패키지와 동일 패키지에 포함되지는 않지만 하위 클래스 관계에 있는 클래스도 접근.
	// default : 본인 패키지 내부 
	// private : 자신 클래스 내부
	
	public String music;
	int follower;
	private boolean star = true;
	
	public Hyori(String music) {
		this.music = music;
		follower = 100;
		star = true;
	}
	
	Hyori(int follwer) {
		this.sing();
		drinkTea();
		yoga();
		
	}
	
	private Hyori(boolean star) {
		
	}
	
	public void sing() {}
	void drinkTea() {}
	private void yoga() {}
}
