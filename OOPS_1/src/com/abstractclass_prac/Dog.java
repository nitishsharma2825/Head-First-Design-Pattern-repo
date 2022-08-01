package com.abstractclass_prac;

public class Dog extends Animal{
    public Dog(String name) {
        super(name);
    }

    @Override
    public void eat() {
        System.out.println(super.getName()+"is "+"Eating");
    }

    @Override
    public void breathe() {
        System.out.println("Breathing");
    }
}
