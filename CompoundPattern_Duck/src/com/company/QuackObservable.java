package com.company;

public interface QuackObservable {
    void registerObserver(Observer observer);
    void notifyObservers();
}
