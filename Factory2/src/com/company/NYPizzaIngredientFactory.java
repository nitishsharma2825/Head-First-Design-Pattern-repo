package com.company;

public class NYPizzaIngredientFactory implements PizzaIngredientFactory{
    @Override
    public Dough createDough() {
        return new NYDough();
    }

    @Override
    public Cheese createCheese() {
        return new NYCheese();
    }

    @Override
    public Sauce createSauce() {
        return new NYSauce();
    }
}
