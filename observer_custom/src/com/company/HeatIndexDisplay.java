package com.company;

public class HeatIndexDisplay implements Display, Observer{
    private float temp;
    private float humidity;
    private float pressure;
    private Subject weatherData;

    public HeatIndexDisplay(Subject s) {
        this.weatherData=s;
        weatherData.registerObserver(this);
    }
    @Override
    public void display() {
        System.out.println("Temp+Pressure+Humidity= "+(temp+humidity+pressure));
    }

    @Override
    public void update(float temp, float humidity, float pressure) {
        this.temp=temp;
        this.humidity=humidity;
        this.pressure=pressure;
        display();
    }


}
