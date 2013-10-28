package com.gonghan.designPatterns.observer;

public class MobileDisplay implements Observer {

	@Override
	public void update(int i) {
		System.out.println("Mobile Display: Updated Temp: " + i);
	}

}
