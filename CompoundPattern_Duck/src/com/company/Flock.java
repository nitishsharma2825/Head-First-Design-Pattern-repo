package com.company;

import java.util.ArrayList;
import java.util.Iterator;

public class Flock implements Quackable{
    ArrayList<Quackable> ducks;
    public Flock() {
        this.ducks = new ArrayList<>();
    }

    @Override
    public void registerObserver(Observer observer) {
        for(Quackable duck:ducks){
            duck.registerObserver(observer);
        }
    }

    @Override
    public void notifyObservers() {
    }

    public void add(Quackable duck) {
        ducks.add(duck);
    }

    @Override
    public void quack() {
        for(Quackable duck:ducks){
            duck.quack();
        }
    }
}
