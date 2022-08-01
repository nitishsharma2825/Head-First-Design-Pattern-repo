package com.company;

public class NYPizzaStore extends PizzaStore{
    @Override
    protected Pizza createPizza(String name) {
        if(name.equals("cheese")){
            return new NYStyleCheesePizza();
        } else if (name.equals("veg")){
            return new NYStyleVegPizza();
        }
        return null;
    }
}
