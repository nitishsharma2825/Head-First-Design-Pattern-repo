package com.company;

public class NYPizzaStore extends PizzaStore{
    @Override
    protected Pizza createPizza(String name) {
        PizzaIngredientFactory pizzaIngredientFactory=new NYPizzaIngredientFactory();
        if(name.equals("cheese")){
            return new CheesePizza(pizzaIngredientFactory);
        } else if (name.equals("veg")){
            return new VegPizza(pizzaIngredientFactory);
        }
        return null;
    }
}
