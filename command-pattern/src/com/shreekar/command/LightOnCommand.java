package com.shreekar.command;

import com.shreekar.invoker.Light;

public class LightOnCommand implements ICommand {

	Light light;
	
	public LightOnCommand(Light light) {
		this.light = light;
	}
	
	@Override
	public void execute() {
		light.turnLightOn();
	}

	@Override
	public void unExecute() {
		light.turnLightOff();
	}

}
