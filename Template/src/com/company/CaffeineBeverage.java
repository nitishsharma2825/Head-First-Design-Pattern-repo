package com.company;

public abstract class CaffeineBeverage {
    // templateMethod - represents some algorithm
    final void prepare(){
        boilWater();
        brew();
        pourInCup();
        // hooks can be added for subclasses to hook into the algo
        if(userWantsCondiments()){
            addCondiments();
        }
    }

    abstract void brew();
    abstract void addCondiments();

    void boilWater(){
        System.out.println("Water in Boiling");
    }
    void pourInCup(){
        System.out.println("Pouring in the Cup");
    }

    // default implementation of a hook
    boolean userWantsCondiments(){
        return true;
    }
}
