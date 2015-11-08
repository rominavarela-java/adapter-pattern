package mx.iteso.adapter.temperature.impl;

import junit.framework.Assert;

import org.junit.Before;
import org.junit.Test;

import mx.iteso.adapter.temperature.TemperatureInfo;
import mx.iteso.adapter.temperature.adapters.TemperatureClassReporter;

public class TemperatureClassReporterTest {
	TemperatureInfo tempInfo;
	double celsius;
	double fahrenheit;
	
	@Before
	public void setup() {
		tempInfo = new TemperatureClassReporter();
		celsius= 0.0;
		fahrenheit= 32.0;
	}
	
	@Test
	public void fahrenheitToCelsius() {
		tempInfo.setTemperatureInFahrenheit(fahrenheit);
		Assert.assertEquals(celsius, tempInfo.getTemperatureInCelsius());
	}

	@Test
	public void celsiusToFahrenheit() {
		tempInfo.setTemperatureInCelsius(celsius);
		Assert.assertEquals(fahrenheit, tempInfo.getTemperatureInFahrenheit());
	}
}
