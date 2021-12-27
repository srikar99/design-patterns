package com.shreekar.strategy.behaviour;

public class NormalFlying implements IFlyBehaviour{

	@Override
	public void fly() {
		System.out.println("Normal Flying");
	}

}
