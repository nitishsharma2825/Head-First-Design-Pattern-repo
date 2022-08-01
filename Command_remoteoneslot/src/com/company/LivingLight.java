package com.company;

public class LivingLight implements Light{
    public LivingLight() {
    }

    @Override
    public void on() {
        System.out.println("living light is on");
    }

    @Override
    public void off() {
        System.out.println("Living light is off");
    }
}
