package com.shreekar.command;

import com.shreekar.invoker.Light;

public class LightOffCommand implements ICommand{

	Light light;
	
	public LightOffCommand(Light light) {
		this.light = light;
	}
	
	@Override
	public void execute() {
		light.turnLightOff();
	}

	@Override
	public void unExecute() {
		light.turnLightOn();
	}

}
