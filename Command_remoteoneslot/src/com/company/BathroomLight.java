package com.company;

public class BathroomLight implements Light{
    public BathroomLight() {

    }
    @Override
    public void on() {
        System.out.println("Bathroom light is on");
    }

    @Override
    public void off() {
        System.out.println("Bathroom light is off");
    }
}
