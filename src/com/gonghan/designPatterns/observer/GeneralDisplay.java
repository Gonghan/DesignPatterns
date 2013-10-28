package com.gonghan.designPatterns.observer;

import java.util.Observable;

interface Observer {
	void update(int i);
}

public class GeneralDisplay implements Observer {

	@Override
	public void update(int i) {
		System.out.println("General Display: Updated Temp: " + i);

	}

}
