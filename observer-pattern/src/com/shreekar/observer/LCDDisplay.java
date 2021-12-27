package com.shreekar.observer;

import com.shreekar.observable.WeatherStation;

public class LCDDisplay implements IObserver, IDisplay {

	WeatherStation weatherStation;

	int temperature;
	IDisplay display;

	public LCDDisplay(WeatherStation weatherStation) {
		this.weatherStation = weatherStation;
	}

	@Override
	public void update() {
		temperature = weatherStation.getTemprature();
		System.out.println("Temperature on LCD: " + temperature);
	}

	@Override
	public void display() {
		System.out.println("LCD Display");
	}

}
