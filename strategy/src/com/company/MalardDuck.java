package com.company;

public class MalardDuck extends Duck{
    public MalardDuck() {
        setFlyable(new NoFly());
        setQuackable(new MuteQuack());
    }

    @Override
    public void display() {
        System.out.println("Malard Duck");
    }
}
