package com.company;

import java.util.ArrayList;

public class ChicagoStyleCheesePizza extends Pizza{
    public ChicagoStyleCheesePizza() {
        setDough("Chicago dough");
        setName("Chicago style cheese pizza");
        ArrayList<String> tops=new ArrayList<String>();
        tops.add("Chicago top");
        setToppings(tops);
        setSauce("Chicago sauce");
    }

    @Override
    public void cut() {
        System.out.println("Cutting in 4 pieces");
    }
}
