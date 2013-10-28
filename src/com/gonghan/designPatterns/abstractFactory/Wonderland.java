package com.gonghan.designPatterns.abstractFactory;

public class Wonderland {
	public Wonderland(AnimalFactory factory){
		Animal animal=factory.createAnimal();
		animal.breathe();
	}
}
