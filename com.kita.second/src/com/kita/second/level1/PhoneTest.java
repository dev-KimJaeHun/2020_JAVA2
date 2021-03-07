package com.kita.second.level1;

import java.util.Scanner;

public class PhoneTest {
	public static void main(String[] args) {
		
		Phone myPhone = new Phone();
		Scanner sc = new Scanner(System.in);
		
		myPhone.call("엄마");
		myPhone.setColor("파랑");
		myPhone.phoneName = "아이폰 12";
		myPhone.owner = "김재훈";
		myPhone.setMemory(512);
		
		Phone p1 = new Phone("갤럭시 S20", "빨강", 256);
		
		Phone yourPhone = new Phone();
		
		sc.close();
	}
}
