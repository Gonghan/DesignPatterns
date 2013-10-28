package com.gonghan.designPatterns.decoration;

public class IceCreamDecorator implements IceCream {
	
	protected IceCream icecream;
	
	public IceCreamDecorator(IceCream icecream){
		this.icecream=icecream;
	}

	@Override
	public String makeIceCream() {
		return this.icecream.makeIceCream();
	}

}
