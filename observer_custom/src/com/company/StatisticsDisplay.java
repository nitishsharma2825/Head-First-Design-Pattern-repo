package com.company;

public class StatisticsDisplay implements Display, Observer {
    private float temp;
    private float humidity;
    private float pressure;

    private Subject weatherData;

    public StatisticsDisplay(Subject s) {
        this.weatherData = s;
        weatherData.registerObserver(this);
    }

    @Override
    public void display() {
        System.out.println("this is statistics class");
    }

    @Override
    public void update(float temp, float humidity, float pressure) {
        this.temp = temp;
        this.pressure = pressure;
        this.humidity = humidity;
        display();
    }
}
