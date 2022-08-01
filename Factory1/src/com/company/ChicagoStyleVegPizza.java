package com.company;

import java.util.ArrayList;

public class ChicagoStyleVegPizza extends Pizza{
    public ChicagoStyleVegPizza() {
        setDough("Chicago dough");
        setName("Chicago style cheese pizza");
        ArrayList<String> tops=new ArrayList<String>();
        tops.add("Chicago top");
        setToppings(tops);
        setSauce("Chicago sauce");
    }
}
