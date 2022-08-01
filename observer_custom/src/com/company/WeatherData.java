package com.company;

import java.util.ArrayList;

public class WeatherData implements Subject{
    private float temp;
    private float humidity;
    private float pressure;
    private ArrayList<Observer> observers;
    public WeatherData() {
        observers=new ArrayList<>();
    }

    @Override
    public void registerObserver(Observer o) {
        observers.add(o);
    }

    @Override
    public void removeObserver(Observer o) {
        int idx=observers.indexOf(o);
        if(idx>=0){
            observers.remove(idx);
        }
    }

    @Override
    public void notifyObservers() {
        for(Observer o:observers){
            o.update(temp,humidity,pressure);
        }
    }

    public void setMeasurements(float a,float b,float c){
        this.temp=a;
        this.humidity=b;
        this.pressure=c;
        notifyObservers();
    }
    public float getTemp() {
        return temp;
    }

    public float getHumidity() {
        return humidity;
    }

    public float getPressure() {
        return pressure;
    }
}
