package com.shreekar.observable;

import java.util.ArrayList;
import java.util.List;

import com.shreekar.observer.IObserver;

public class WeatherStation implements IWeatherStation{

	private int temperature;
	
	private List<IObserver> observers = new ArrayList<>();

	@Override
	public void add(IObserver observer) {
		this.observers.add(observer);
	}

	@Override
	public void remove(IObserver observer) {
		this.observers.remove(observer);
	}

	@Override
	public void notifyObserver() {
		this.observers.forEach(observer -> observer.update());
	}

	public void setTemprature(int temparature) {
		
		if(this.temperature != temparature) {
			this.temperature = temparature;
			notifyObserver();
		}
		
	}
	
	@Override
	public int getTemprature() {
		return this.temperature;
	}

}
