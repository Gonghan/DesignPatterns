package com.gonghan.designPatterns.factory;

public abstract class Car {

	protected CarType model;
	
	public Car(CarType model){
		this.model=model;
	}
	
	public abstract void construct();

	public CarType getModel() {
		return model;
	}

	public void setModel(CarType model) {
		this.model = model;
	}
	
	
}
