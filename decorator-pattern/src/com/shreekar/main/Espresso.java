package com.shreekar.main;

public class Espresso extends Beverage{

	@Override
	public int cost() {
		return 1;
	}

	@Override
	public String getDescription() {
		return "Espresso";
	}

}
