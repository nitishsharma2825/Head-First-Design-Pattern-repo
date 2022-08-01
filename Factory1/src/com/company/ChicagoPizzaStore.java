package com.company;

public class ChicagoPizzaStore extends PizzaStore{
    @Override
    protected Pizza createPizza(String name) {
        if(name.equals("cheese")){
            return new ChicagoStyleCheesePizza();
        } else if (name.equals("veg")){
            return new ChicagoStyleVegPizza();
        }
        return null;
    }
}
