package com.company;

public abstract class Pizza {
    private String name;
    private Dough dough;
    private Sauce sauce;
    private Cheese cheese;

    protected abstract void prepare();

    public void bake(){
        System.out.println("Baking");
    }
    public void cut(){
        System.out.println("Cutting");
    }
    public void box(){
        System.out.println("Boxing the pizza");
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public void setDough(Dough dough) {
        this.dough = dough;
    }

    public void setSauce(Sauce sauce) {
        this.sauce = sauce;
    }

    public void setCheese(Cheese cheese) {
        this.cheese = cheese;
    }
}
