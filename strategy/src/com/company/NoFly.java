package com.company;

public class NoFly implements Flyable{
    @Override
    public void fly() {
        System.out.println("I can't fly");
    }
}
