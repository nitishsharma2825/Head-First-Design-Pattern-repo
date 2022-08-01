package com.company;

public class SoldState implements State{
    GumballMachine gumballMachine;

    public SoldState(GumballMachine gumballMachine) {
        this.gumballMachine = gumballMachine;
    }

    @Override
    public void insertQuarter() {
        System.out.println("Please wait, we are giving a gumball");
    }

    @Override
    public void ejectQuarter() {
        System.out.println("Sorry you already turned the crank");
    }

    @Override
    public void dispense() {
        System.out.println("Here's your gumball");
        gumballMachine.releaseBall();
        if(gumballMachine.getCount()>0){
            gumballMachine.setState(gumballMachine.getNoQuarterState());
        } else {
            System.out.println("Out of gumballs");
            gumballMachine.setState(gumballMachine.getSoldOutState());
        }
    }

    @Override
    public void turnCrank() {
        System.out.println("Turning twice doesn't help");
    }
}
