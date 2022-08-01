package com.company;

import java.util.ArrayList;

public class Observable implements QuackObservable{
    ArrayList<Observer> observers;
    QuackObservable duck;

    public Observable(QuackObservable duck) {
        this.duck = duck;
        this.observers=new ArrayList<>();
    }

    @Override
    public void registerObserver(Observer observer) {
        observers.add(observer);
    }

    @Override
    public void notifyObservers() {
        for(Observer o:observers){
            o.update(duck);
        }
    }
}
