package com.abstractclass_prac;

public class Bird extends Animal implements canFly{
    public Bird(String name) {
        super(name);
    }

    @Override
    public void eat() {
        System.out.println("Bird is eating");
    }

    @Override
    public void breathe() {
        System.out.println("Bird is breathing");
    }

    @Override
    public void fly() {
        System.out.println("Bird is flying");
    }

//    public abstract void fly();  better to make an interface for this
}
