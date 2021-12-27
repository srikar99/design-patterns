package com.shreekar.strategy;

import com.shreekar.strategy.behaviour.DisplayAsGraphics;
import com.shreekar.strategy.behaviour.DisplayAsText;
import com.shreekar.strategy.behaviour.IDisplayBehaviour;
import com.shreekar.strategy.behaviour.IFlyBehaviour;
import com.shreekar.strategy.behaviour.IQuackBehaviour;
import com.shreekar.strategy.behaviour.NoFlying;
import com.shreekar.strategy.behaviour.NoQuacking;
import com.shreekar.strategy.behaviour.NormalFlying;
import com.shreekar.strategy.behaviour.NormalQuacking;

public class Main {

	public static void main(String[] args) {
		normalDuck();
		rubberDuck();
		woodenDuck();
		noDuck();
	}
	
	static void normalDuck() {
		IDisplayBehaviour displayBehaviour = new DisplayAsGraphics();
		IFlyBehaviour flyBehaviour = new NormalFlying();
		IQuackBehaviour quackBehaviour = new NormalQuacking();
		Duck normalDuck = new Duck(displayBehaviour, flyBehaviour, quackBehaviour);
		
		normalDuck.display();
		normalDuck.fly();
		normalDuck.quack();
	}
	
	static void rubberDuck() {
		IDisplayBehaviour displayBehaviour = new DisplayAsGraphics();
		IFlyBehaviour flyBehaviour = new NoFlying();
		IQuackBehaviour quackBehaviour = new NormalQuacking();
		Duck rubberDuck = new Duck(displayBehaviour, flyBehaviour, quackBehaviour);
		
		rubberDuck.display();
		rubberDuck.fly();
		rubberDuck.quack();
	}
	
	static void woodenDuck() {
		IDisplayBehaviour displayBehaviour = new DisplayAsGraphics();
		IFlyBehaviour flyBehaviour = new NoFlying();
		IQuackBehaviour quackBehaviour = new NoQuacking();
		Duck woodenDuck = new Duck(displayBehaviour, flyBehaviour, quackBehaviour);
		
		woodenDuck.display();
		woodenDuck.fly();
		woodenDuck.quack();
	}
	
	static void noDuck() {
		IDisplayBehaviour displayBehaviour = new DisplayAsText();
		IFlyBehaviour flyBehaviour = new NoFlying();
		IQuackBehaviour quackBehaviour = new NoQuacking();
		Duck noDuck = new Duck(displayBehaviour, flyBehaviour, quackBehaviour);
		
		noDuck.display();
		noDuck.fly();
		noDuck.quack();
	}
}
