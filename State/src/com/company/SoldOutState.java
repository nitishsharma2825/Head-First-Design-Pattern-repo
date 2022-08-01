package com.company;

public class SoldOutState implements State{
    GumballMachine gumballMachine;

    public SoldOutState(GumballMachine gumballMachine) {
        this.gumballMachine = gumballMachine;
    }

    @Override
    public void insertQuarter() {
        System.out.println("You can't insert, machine is sold out");
    }

    @Override
    public void ejectQuarter() {
        System.out.println("There are no gumballs");
    }

    @Override
    public void dispense() {
        System.out.println("There are no gumballs");
    }

    @Override
    public void turnCrank() {
        System.out.println("There are no gumballs");
    }
}
