package com.gonghan.designPatterns.abstractFactory;

public class SampleAbstractFactory{

	public static AnimalFactory createAnimalFactory(String type){
		if(type.equals("water")){
			return new SeaAnimalFactory();
		}else{
			return new LandAnimalFactory();
		}
	}
}
