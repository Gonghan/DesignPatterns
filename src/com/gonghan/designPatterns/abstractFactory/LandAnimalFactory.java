package com.gonghan.designPatterns.abstractFactory;

public class LandAnimalFactory implements AnimalFactory {

	@Override
	public Animal createAnimal() {
		return new Elephant();
	}

}
