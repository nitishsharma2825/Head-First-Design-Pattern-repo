package com.company;

public class WinnerState implements State{
    GumballMachine gumballMachine;

    public WinnerState(GumballMachine gumballMachine) {
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
        System.out.println("You are a winner, you get 2 gumballs");
        gumballMachine.releaseBall();
        if(gumballMachine.getCount()==0){
            gumballMachine.setState(gumballMachine.getSoldOutState());
        } else {
            gumballMachine.releaseBall();
            if(gumballMachine.getCount()>0){
                gumballMachine.setState(gumballMachine.getNoQuarterState());
            } else {
                System.out.println("Out of gumballs");
                gumballMachine.setState(gumballMachine.getSoldOutState());
            }
        }
    }

    @Override
    public void turnCrank() {
        System.out.println("Turning twice doesn't help");
    }
}
