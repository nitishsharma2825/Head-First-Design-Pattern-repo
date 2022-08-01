package com.company;

public class QuackCounter implements Quackable{
    Quackable duck;
    static int counter;
    public QuackCounter(Quackable duck) {
        this.duck = duck;
    }

    @Override
    public void quack() {
        duck.quack();
        counter++;
    }

    @Override
    public void registerObserver(Observer observer) {
        duck.registerObserver(observer);
    }

    @Override
    public void notifyObservers() {
        duck.notifyObservers();
    }

    public int getNumberOfQuacks(){
        return counter;
    }
}
