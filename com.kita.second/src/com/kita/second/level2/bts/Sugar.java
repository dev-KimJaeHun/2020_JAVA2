package com.kita.second.level2.bts;

//import com.kita.second.level2.sogilli.Hyori;
//import com.kita.second.level2.sogilli.Sangsun;
import com.kita.second.level2.sogilli.*;

public class Sugar {
	void method() {
		Hyori hr = new Hyori("유고걸");
//		Hyori hr2 = new Hyori(150);
//		Hyori hr3 = new Hyori(false);
		
		hr.sing();
//		hr.drinkTea(); // default 메소드
//		hr.yoga(); // private 메소드
		
		
		String music = hr.music;
//		int follower = hr.follower; // 다른 패키지라서 에러
//		boolean star = hr.star;
		Sangsun ss = new Sangsun();
	}
	
	
}
