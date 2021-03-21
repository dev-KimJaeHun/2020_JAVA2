package com.kita.second.level3.cafe2;

public class Menu {
	MenuItem[] arr = new MenuItem[4];

	public Menu() {
		arr[0] = new MenuItem("아메리카노",1500);
		arr[1] = new MenuItem("카푸치노",2000);
		arr[2] = new MenuItem("카라멜마끼아또",2500);
		arr[3] = new MenuItem("에스프레소",2500);
	}
	
	void showMenu() {
		System.out.println("--Menu--");
		for (int i = 0; i < arr.length; i++) {
			System.out.println(arr[i]);
		}
	}
	
}
