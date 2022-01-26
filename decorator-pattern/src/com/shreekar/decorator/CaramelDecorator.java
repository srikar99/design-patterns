package com.shreekar.decorator;

import com.shreekar.main.Beverage;

public class CaramelDecorator extends CondimentDecorator{

	Beverage beverage;
	
	public CaramelDecorator(Beverage beverage) {
		this.beverage = beverage;
	}
	
	@Override
	public int cost() {
		return 5 + beverage.cost();
	}

	@Override
	public String getDescription() {
		
		return beverage.getDescription() + " , Caramel";
	}

}
