package com.company;

public interface PizzaIngredientFactory {
    Dough createDough();
    Cheese createCheese();
    Sauce createSauce();
}
