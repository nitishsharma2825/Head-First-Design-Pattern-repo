package com.company;

public class Goose implements QuackObservable{
    Observable observable;

    public Goose() {
        this.observable=new Observable(this);
    }

    public void honk(){
        System.out.println("Honk");
        notifyObservers();
    }

    @Override
    public void registerObserver(Observer observer) {
        observable.registerObserver(observer);
    }

    @Override
    public void notifyObservers() {
        observable.notifyObservers();
    }
}
