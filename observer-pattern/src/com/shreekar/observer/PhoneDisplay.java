package com.shreekar.observer;

import com.shreekar.observable.WeatherStation;

public class PhoneDisplay implements IObserver, IDisplay{

	WeatherStation weatherStation;
	
	int temperature;
	IDisplay display;
	
	public PhoneDisplay(WeatherStation weatherStation) {
		this.weatherStation = weatherStation;
	}
	
	@Override
	public void update() {
		temperature = weatherStation.getTemprature();
		System.out.println("Temperature on Phone: " + temperature);
	}

	@Override
	public void display() {
		System.out.println("Phone Display");
	}

}
