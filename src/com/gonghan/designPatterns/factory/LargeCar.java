package com.gonghan.designPatterns.factory;

public class LargeCar extends Car{

	LargeCar(){
		super(CarType.LARGE);
		construct();
	}

	@Override
	public void construct() {
		System.out.println("Large car");
		
	}
}
