package com.kita.second.level2;

public class Singleton {
	private static Singleton sg = null;		// 1단계
	
	private Singleton() {}	// 2단계
	
	public static Singleton getInstance() {	// 3단계
		if(sg == null) {
			sg = new Singleton();
		}
		return sg;
	}
}
