package com.company;

public class Espresso extends BeverageComponent {
    public Espresso(int size) {
        this.setDescription("Espresso");
        this.setSize(size);
    }

    @Override
    public double cost() {
        return 1.99;
    }
}
