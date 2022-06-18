package com.shreekar.main;

import com.shreekar.command.ICommand;
import com.shreekar.command.LightOffCommand;
import com.shreekar.command.LightOnCommand;
import com.shreekar.invoker.Invoker;
import com.shreekar.invoker.Light;

public class Main {

	public static void main(String[] args) {
		
		ICommand lightOn = new LightOnCommand(new Light());
		ICommand lightOff = new LightOffCommand(new Light());
		Invoker invoker = new Invoker(lightOn, lightOff);
		
		invoker.lightOn();
		invoker.lightOff();
		
	}
}
