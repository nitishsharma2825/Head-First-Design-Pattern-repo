package com.company;

public class GumballMachine {
    private State noQuarterState;
    private State hasQuarterState;
    private State soldOutState;
    private State soldState;
    private State winnerState;

    private State state;
    private int count=0;

    public GumballMachine(int numberGumballs) {
        noQuarterState=new NoQuarterState(this);
        hasQuarterState=new HasQuarterState(this);
        soldOutState=new SoldOutState(this);
        soldState=new SoldState(this);
        winnerState=new WinnerState(this);
        this.count = numberGumballs;
        if(count>0){
            state=noQuarterState;
        } else {
            state=soldOutState;
        }
    }

    public void refill(int gumballs){
        this.count=gumballs;
        state=noQuarterState;
    }
    public State getWinnerState() {
        return winnerState;
    }

    public void insertQuarter(){
        state.insertQuarter();
    }

    public void ejectQuarter(){
        state.ejectQuarter();
    }

    public void turnCrank(){
        state.turnCrank();
        state.dispense();
    }

    public void releaseBall(){
        System.out.println("A gumball comes rolling into the slot...");
        if(count>0){
            count--;
        }
    }

    public State getNoQuarterState() {
        return noQuarterState;
    }

    public State getHasQuarterState() {
        return hasQuarterState;
    }

    public State getSoldOutState() {
        return soldOutState;
    }

    public State getSoldState() {
        return soldState;
    }

    public State getState() {
        return state;
    }

    public void setState(State state) {
        this.state = state;
    }

    public int getCount() {
        return count;
    }

}
