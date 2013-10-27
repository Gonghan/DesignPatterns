package com.gonghan.designPatterns.observer;

import java.util.ArrayList;

interface Observable {
	void register(Observer observer);

	void remote(Observer observer);

	public void notifyObservers();
}

public class Weather implements Observable {

	private ArrayList<Observer> observerList;
	private int temp;

	public Weather(int temp) {
		this.temp = temp;
		this.observerList = new ArrayList<Observer>();

	}

	public void setTemp(int temp) {
		this.temp = temp;
		this.notifyObservers();
	}

	@Override
	public void register(Observer observer) {
		this.observerList.add(observer);
	}

	@Override
	public void remote(Observer observer) {
		this.observerList.remove(observer);
	}

	@Override
	public void notifyObservers() {
		for(Observer observer:this.observerList){
			observer.update(this.temp);
		}
	}

}
