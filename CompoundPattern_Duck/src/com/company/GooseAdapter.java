package com.company;

public class GooseAdapter implements Quackable{
    Goose goose;

    public GooseAdapter(Goose goose) {
        this.goose = goose;
    }

    @Override
    public void registerObserver(Observer observer) {
        goose.registerObserver(observer);
    }

    @Override
    public void notifyObservers() {

    }

    @Override
    public void quack() {
        goose.honk();
    }
}
