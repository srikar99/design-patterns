package com.shreekar.strategy;

import com.shreekar.strategy.behaviour.IDisplayBehaviour;
import com.shreekar.strategy.behaviour.IFlyBehaviour;
import com.shreekar.strategy.behaviour.IQuackBehaviour;

public class Duck {

	IDisplayBehaviour displayBehaviour;
	IFlyBehaviour flyBehaviour;
	IQuackBehaviour quackBehaviour;

	public Duck(IDisplayBehaviour displayBehaviour, IFlyBehaviour flyBehaviour, IQuackBehaviour quackBehaviour) {
		this.displayBehaviour = displayBehaviour;
		this.flyBehaviour = flyBehaviour;
		this.quackBehaviour = quackBehaviour;
	}

	public void display() {
		displayBehaviour.display();
	}

	public void fly() {
		flyBehaviour.fly();
	}

	public void quack() {
		quackBehaviour.quack();
	}
}
