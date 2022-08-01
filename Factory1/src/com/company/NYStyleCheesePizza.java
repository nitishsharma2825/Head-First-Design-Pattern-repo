package com.company;

import java.util.ArrayList;

public class NYStyleCheesePizza extends Pizza{
    public NYStyleCheesePizza() {
        setDough("NY dough");
        setName("NY style cheese pizza");
        ArrayList<String> tops=new ArrayList<String>();
        tops.add("NY top");
        setToppings(tops);
        setSauce("NY sauce");
    }
}
