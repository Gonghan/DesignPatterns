package com.gonghan.designPatterns.factory;

public class CarFactory {
	public static Car build(CarType model) {
		Car car = null;
		switch (model) {
		case LUXURY:
			car = new LuxuryCar();
			break;
		case SMALL:
			car = new SmallCar();
			break;
		case LARGE:
			car = new LargeCar();
			break;
		}
		return car;
	}
}
