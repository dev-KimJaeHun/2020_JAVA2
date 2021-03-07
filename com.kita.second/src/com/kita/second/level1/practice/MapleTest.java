package com.kita.second.level1.practice;

import com.kita.second.level1.Adventurer;

public class MapleTest {
	public static void main(String[] args) {
		Adventurer adv1 = new Adventurer();
		Adventurer adv2 = new Adventurer(10, 20);
		adv1.attack();
		adv1.jump();
	}
}
