package com.company;

public class ChicagoPizzaStore extends PizzaStore{
    @Override
    protected Pizza createPizza(String name) {
        PizzaIngredientFactory pizzaIngredientFactory=new ChicagoPizzaIngredientFactory();
        if(name.equals("cheese")){
            return new CheesePizza(pizzaIngredientFactory);
        } else if (name.equals("veg")){
            return new VegPizza(pizzaIngredientFactory);
        }
        return null;
    }
}
