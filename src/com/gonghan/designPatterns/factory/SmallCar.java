package com.gonghan.designPatterns.factory;

public class SmallCar extends Car{
	
	SmallCar(){
		super(CarType.SMALL);
		construct();
	}

	@Override
	public void construct() {
		System.out.println("Small car");
		
	}

}
