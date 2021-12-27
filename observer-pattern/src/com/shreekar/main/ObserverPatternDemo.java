package com.shreekar.main;

import java.util.concurrent.Executors;
import java.util.concurrent.ScheduledExecutorService;
import java.util.concurrent.TimeUnit;

import com.shreekar.observable.WeatherStation;
import com.shreekar.observer.LCDDisplay;
import com.shreekar.observer.PhoneDisplay;

public class ObserverPatternDemo {

	public static void main(String[] args) {

		WeatherStation weatherStation = new WeatherStation();
		PhoneDisplay phoneDisplay = new PhoneDisplay(weatherStation);
		LCDDisplay lcdDisplay = new LCDDisplay(weatherStation);

		ScheduledExecutorService executor = Executors.newSingleThreadScheduledExecutor();

		Runnable periodicTask = new Runnable() {

			public void run() {
				for (int i = 0; i <= 10; i++) {
					weatherStation.setTemprature(i * 32 + 70);
				}
			}
		};

		executor.scheduleAtFixedRate(periodicTask, 1, 5, TimeUnit.SECONDS);

		weatherStation.add(phoneDisplay);
		weatherStation.add(lcdDisplay);
	}
}
