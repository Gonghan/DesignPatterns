package com.gonghan.designPatterns.decoration;

public class NuttyDecorator extends IceCreamDecorator{
	public NuttyDecorator(IceCream icecream){
		super(icecream);
	}
	
	public String makeIceCream(){
		return icecream.makeIceCream()+addNutty();
	}

	private String addNutty() {
		return " + nuts";
	}
	
}
