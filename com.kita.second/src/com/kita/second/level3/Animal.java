package com.kita.second.level3;

public abstract class Animal {
	String name;
	int age;
	
	public Animal(String name) {
		this.name = name;
	}
	
	void cry() {
		System.out.println("동물이 운다");
	}
	
}
