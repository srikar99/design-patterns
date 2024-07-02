package com.shreekar.invoker;

import com.shreekar.command.ICommand;

public class Invoker {

	private ICommand lightOn;
	private ICommand lightOff;
	
	public Invoker(ICommand lightOn, ICommand lightOff) {
		this.lightOn = lightOn;
		this.lightOff = lightOff;
	}
	
	public void lightOn() {
		this.lightOn.execute();
	}
	
	public void lightOff() {
		this.lightOff.execute();
	}
}
