package com.kita.second.level2;

public class Magician extends Adventurer{
	// Adventurer 클래스를 상속 받아서
	// mp 필드 추가
	// attack메소드를 "마법공격"
	// teleport 메소드 추가 - "텔레포트를 한다"
	
	int mp;
	
	public Magician() {
		super();
	}
	
	@Override
	public void attack() {
		System.out.println("마법공격");
	}
	
	public void teleport() {
		System.out.println("텔레포트를 한다.");
	}
	
	
	
	
}
