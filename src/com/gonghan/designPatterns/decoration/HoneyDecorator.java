package com.gonghan.designPatterns.decoration;

public class HoneyDecorator extends IceCreamDecorator {

	public HoneyDecorator(IceCream icecream) {
		super(icecream);
	}
	
	public String makeIceCream(){
		return this.icecream.makeIceCream()+addHoney();
	}

	private String addHoney() {
		return " + honey";
	}

}
