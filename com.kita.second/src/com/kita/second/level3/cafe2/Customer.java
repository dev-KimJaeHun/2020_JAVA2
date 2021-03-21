package com.kita.second.level3.cafe2;

import java.util.Scanner;

public class Customer {
	
	public MenuItem order(Menu m) {
		Scanner sc = new Scanner(System.in);
		m.showMenu();
		MenuItem mi = null;
		while(mi == null) {
			System.out.println("메뉴 번호를 선택하세요.");
			try {
				int mNum = sc.nextInt();
			} catch(Exception e) {
				System.out.println("숫자를 입력하세요");
				continue;
			}
		}
		return mi;
	}
}
