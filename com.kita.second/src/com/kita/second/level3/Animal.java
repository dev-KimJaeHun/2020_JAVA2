package com.kita.second.level3;

public abstract class Animal {
	String name;
	int age;
	
	public Animal(String name) {
		this.name = name;
	}
	
	void breathe() {
		System.out.println("숨을 쉰다.");
	}
	
	abstract void cry();
	
}
