package com.gonghan.designPatterns.observer;

import static org.junit.Assert.*;

import org.junit.Test;

public class ObserverTest {

	@Test
	public void test() {
		Weather weather=new Weather(25);
		GeneralDisplay gd=new GeneralDisplay();
		MobileDisplay md=new MobileDisplay();
		weather.register(gd);
		weather.register(md);
		weather.setTemp(26);
		weather.remote(gd);
		weather.setTemp(25);
	}

}
