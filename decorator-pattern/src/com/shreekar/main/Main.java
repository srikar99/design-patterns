package com.shreekar.main;

import com.shreekar.decorator.MochaDecorator;

public class Main {

	public static void main(String[] args) {
	
		Beverage beverage = new Decaf();
		beverage = new MochaDecorator(beverage);
		
		System.out.println(beverage.getDescription());
		System.out.println(beverage.cost());
	}
}
