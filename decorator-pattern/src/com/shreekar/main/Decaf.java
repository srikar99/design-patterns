package com.shreekar.main;

public class Decaf extends Beverage{

	@Override
	public int cost() {
		return 2;
	}

	@Override
	public String getDescription() {
		return "Decaf";
	}

}
