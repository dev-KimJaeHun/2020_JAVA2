package com.kita.second.level2.sogilli;

public class Sangsun {
	
	void method() {
		Hyori hr = new Hyori("유고걸");
		String music = hr.music;
		int follower = hr.follower;
//		boolean star = hr.star;
		
		Hyori hr2 = new Hyori(150); // defalut 생성자
//		Hyori hr3 = new Hyori(true); // private 생성자
		
		hr.sing();
		hr.drinkTea();
//		hr.yoga();
		
	}
}
