package com.kita.second.level3.cafe;

public class Customer {
	
	public MenuItem order(Menu menu) {
		return new MenuItem("아메리카노", 1500);
	}
	
	void drinkCoffee(Coffee coffee) {
		System.out.println(coffee.getName() + "를 마신다.");
	}
}
