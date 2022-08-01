package com.company;

import java.util.ArrayList;

public abstract class Pizza {
    private String name;
    private String dough;
    private String sauce;
    private ArrayList<String> toppings=new ArrayList<>();


    public void prepare(){
        System.out.println("Preparing");
    }
    public void cut(){
        System.out.println("Cutting");
    }
    public void box(){
        System.out.println("Boxing the Pizza");
    }
    public void bake(){
        System.out.println("Baking");
    }

    public String getName() {
        return name;
    }
    public void setName(String name) {
        this.name = name;
    }

    public void setDough(String dough) {
        this.dough = dough;
    }

    public void setSauce(String sauce) {
        this.sauce = sauce;
    }

    public void setToppings(ArrayList<String> toppings) {
        this.toppings = toppings;
    }
}
