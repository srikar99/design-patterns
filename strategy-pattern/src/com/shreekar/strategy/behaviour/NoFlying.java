package com.shreekar.strategy.behaviour;

public class NoFlying implements IFlyBehaviour{

	@Override
	public void fly() {
		System.out.println("No Flying");
		
	}

}
