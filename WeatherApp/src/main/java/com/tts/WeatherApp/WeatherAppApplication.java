package com.tts.WeatherApp;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
public class WeatherAppApplication {

	public static void main(String[] args) {
	//	SpringApplication.run(WeatherAppApplication.class, args);
		System.out.println("Hey, here we are");
		WeatherService ws = new WeatherService();
		Response resp = ws.getForecast("28115");
		System.out.println("Forecast for " + resp.getName());
	}

}
