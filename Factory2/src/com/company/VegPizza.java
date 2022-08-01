package com.company;

public class VegPizza extends Pizza{
    PizzaIngredientFactory pizzaIngredientFactory;

    public VegPizza(PizzaIngredientFactory pizzaIngredientFactory) {
        this.pizzaIngredientFactory=pizzaIngredientFactory;
        setName("Veg Pizza");
    }

    @Override
    protected void prepare() {
        System.out.println("Preparing "+getName());
        setDough(pizzaIngredientFactory.createDough());
        setCheese(pizzaIngredientFactory.createCheese());
        setSauce(pizzaIngredientFactory.createSauce());
    }
}
