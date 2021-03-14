package com.kita.second.level3;

public abstract class Phone {
	// 필드
	String model;
	int memory;
	String ai;
	
	// 생성자
	public Phone(String model, int memory, String ai) {
		this.model = model;
		this.memory = memory;
		this.ai = ai;
	}
	
	// 메소드
	void printModel() {
		System.out.println();
	}
	
	abstract void callAI();
}
