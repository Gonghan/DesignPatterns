package com.gonghan.designPatterns.abstractFactory;

public class SeaAnimalFactory implements AnimalFactory{

	@Override
	public Animal createAnimal() {
		return new Shark();
	}

}
