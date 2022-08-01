package com.company;

public class MallardDuck implements Duck{
    public MallardDuck() {
    }
    @Override
    public void fly() {
        System.out.println("I am flying");
    }

    @Override
    public void quack() {
        System.out.println("quack");
    }
}
