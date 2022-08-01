package com.company;

public class CheesePizza extends Pizza{
    PizzaIngredientFactory pizzaIngredientFactory;

    public CheesePizza(PizzaIngredientFactory pizzaIngredientFactory) {
        this.pizzaIngredientFactory = pizzaIngredientFactory;
        setName("Cheese Pizza");
    }

    @Override
    protected void prepare() {
        System.out.println("Preparing "+getName());
        setDough(pizzaIngredientFactory.createDough());
        setCheese(pizzaIngredientFactory.createCheese());
        setSauce(pizzaIngredientFactory.createSauce());
    }
}
