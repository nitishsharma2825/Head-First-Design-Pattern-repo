package com.company;

public abstract class PizzaStore {
    public Pizza orderPizza(String name){
        Pizza pizza=createPizza(name);
        pizza.prepare();
        pizza.bake();
        pizza.cut();
        pizza.box();
        return pizza;
    }
    protected abstract Pizza createPizza(String name);
}
