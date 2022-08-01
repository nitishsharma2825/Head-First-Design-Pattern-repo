package com.company;

public class CurrentConditionsDisplay implements Observer, Display{
    private float temp;
    private float humidity;
    private float pressure;

    private Subject weatherData;
    public CurrentConditionsDisplay(Subject s) {
        this.weatherData=s;
        weatherData.registerObserver(this);
    }

    @Override
    public void display() {
        System.out.println("Current Temp: "+temp);
        System.out.println("Current Humidity: "+humidity);
        System.out.println("Current Pressure: "+pressure);
    }

    @Override
    public void update(float temp, float humidity, float pressure) {
        this.temp = temp;
        this.pressure=pressure;
        this.humidity=humidity;
        display();
    }
}
