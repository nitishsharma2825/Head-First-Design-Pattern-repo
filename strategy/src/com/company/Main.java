package com.company;

public class Main {

    public static void main(String[] args) {
	// write your code here
        Duck duck=new MalardDuck();
        duck.performFly();
        duck.performQuack();
        duck.setFlyable(new FlyWings());
        duck.setQuackable(new Squeak());
        duck.performFly();
        duck.performQuack();
    }
}
