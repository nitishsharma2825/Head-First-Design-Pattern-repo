package com.abstractclass_prac;

public class Parrot extends Bird{
    public Parrot(String name) {
        super(name);
    }

    @Override
    public void fly() {
        System.out.println("Parrot is flying");
    }
}
