package com.company;

import java.util.Random;

public class HasQuarterState implements State{
    GumballMachine gumballMachine;
    Random randomWinner=new Random(System.currentTimeMillis());

    public HasQuarterState(GumballMachine gumballMachine) {
        this.gumballMachine = gumballMachine;
    }

    @Override
    public void insertQuarter() {
        System.out.println("There is a quarter already in the machine, you can't insert another");
    }

    @Override
    public void ejectQuarter() {
        System.out.println("Ejecting your quarter");
        gumballMachine.setState(gumballMachine.getNoQuarterState());
    }

    @Override
    public void dispense() {
        System.out.println("You need to pay first");
    }

    @Override
    public void turnCrank() {
        System.out.println("You turned...");
        int winner= randomWinner.nextInt(10);
        if(winner==0 && gumballMachine.getCount()>1){
            gumballMachine.setState(gumballMachine.getWinnerState());
        } else {
            gumballMachine.setState(gumballMachine.getSoldState());
        }
    }
}
