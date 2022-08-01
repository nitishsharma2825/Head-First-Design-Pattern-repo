package com.company;

public class CeilingFan {
    public static final int HIGH=3;
    public static final int MEDIUM=2;
    public static final int LOW=1;
    public static final int OFF=0;
    String location;
    int speed;

    public CeilingFan(String location) {
        this.location = location;
        this.speed = OFF;
    }
    public void low(){
        this.speed=LOW;
    }
    public void high(){
        this.speed=LOW;
    }
    public void medium(){
        this.speed=LOW;
    }
    public void off(){
        this.speed=OFF;
    }

    public int getSpeed() {
        return speed;
    }
}
