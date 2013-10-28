package com.gonghan.designPatterns.abstractFactory;

import static org.junit.Assert.*;

public class Test {

	@org.junit.Test
	public void test() {
		new Wonderland(SampleAbstractFactory.createAnimalFactory("water"));
	}

}
