package com.shreekar.decorator;

import com.shreekar.main.Beverage;

public class MochaDecorator extends CondimentDecorator{

	Beverage beverage;
	
	public MochaDecorator(Beverage beverage) {
		this.beverage = beverage;
	}
	
	@Override
	public int cost() {
		return 10 + beverage.cost();
	}

	@Override
	public String getDescription() {
		return beverage.getDescription() + " , Mocha";
	}

}
