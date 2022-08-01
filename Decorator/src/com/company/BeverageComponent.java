package com.company;

public abstract class BeverageComponent {
    private String description="Plain Beverage";
    private int size; // 0 - small, 1- medium, 2-large

    public BeverageComponent(){
    }

    public abstract double cost();

    public String getDescription(){
        return description;
    }

    public void setDescription(String s){
        this.description = s;
    }

    public void setSize(int size) {
        this.size = size;
    }

    public int getSize() {
        return size;
    }


}
