package com.shreekar.strategy.behaviour;

public class NoQuacking implements IQuackBehaviour {

	@Override
	public void quack() {
		System.out.println("No Quacking");

	}

}
