package org.home.spring.client;

import net.webservicex.GlobalWeather;
import net.webservicex.GlobalWeatherSoap;

public class WeatherFinder {
	public static void main(String[] args){
		GlobalWeather gw = new GlobalWeather();
		GlobalWeatherSoap soap = gw.getGlobalWeatherSoap();
		
		String cities = soap.getCitiesByCountry("INdia");
		System.out.println(cities);
	}
}
