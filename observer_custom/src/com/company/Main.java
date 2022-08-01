package com.company;

public class Main {

    public static void main(String[] args) {
	// write your code here
        WeatherData weatherData=new WeatherData();
        CurrentConditionsDisplay current=new CurrentConditionsDisplay(weatherData);
        ForecastDisplay forecastDisplay=new ForecastDisplay(weatherData);
        StatisticsDisplay statisticsDisplay=new StatisticsDisplay(weatherData);
        HeatIndexDisplay heatIndexDisplay=new HeatIndexDisplay(weatherData);
        weatherData.setMeasurements(10,20,30);
        System.out.println("New State");
        weatherData.setMeasurements(20,100,3000);
    }
}
