package com.gonghan.designPatterns.factory;

import static org.junit.Assert.*;

import org.junit.Test;

public class CarFactoryTest {

	@Test
	public void test() {
		Car small_car=CarFactory.build(CarType.SMALL);
		Car large_car=CarFactory.build(CarType.LARGE);
		Car luxury_car=CarFactory.build(CarType.LUXURY);
	}

}
