package com.gonghan.designPatterns.factory;

public class LuxuryCar extends Car{
	
	LuxuryCar(){
		super(CarType.LUXURY);
		construct();
	}

	@Override
	public void construct() {
		System.out.println("Luxury car");	
	}

}
