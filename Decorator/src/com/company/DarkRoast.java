package com.company;

public class DarkRoast extends BeverageComponent {
    public DarkRoast(int size) {
        this.setDescription("DarkRoast");
        this.setSize(size);
    }

    @Override
    public double cost() {
        return 0.99;
    }
}
