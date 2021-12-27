package com.shreekar.observable;

import com.shreekar.observer.IObserver;

public interface IWeatherStation {

	void add(IObserver observer);
	
	void remove(IObserver observer);
	
	void notifyObserver();
	
	int getTemprature();
}
