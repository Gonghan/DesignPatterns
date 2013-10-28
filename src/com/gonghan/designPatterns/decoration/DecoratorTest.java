package com.gonghan.designPatterns.decoration;

import static org.junit.Assert.*;

import org.junit.Test;

public class DecoratorTest {

	@Test
	public void test() {
		IceCream icecream=new HoneyDecorator(new NuttyDecorator(new SimpleIceCream()));
		System.out.println(icecream.makeIceCream());
	}

}
