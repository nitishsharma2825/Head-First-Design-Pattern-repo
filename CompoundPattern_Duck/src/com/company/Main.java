package com.company;

public class Main {

    static void simulate(Quackable duck){
        duck.quack();
    }
    static void simulate(AbstractDuckFactory duckFactory){

        Quackable mallardDuck=duckFactory.createDuck("MallardDuck");
        Quackable duckCall= duckFactory.createDuck("DuckCall");
        Quackable rubberDuck=duckFactory.createDuck("RubberDuck");
        Quackable goose=duckFactory.createDuck("Goose");
        Flock flock=new Flock();
        flock.add(mallardDuck);
        flock.add(rubberDuck);
        flock.add(duckCall);
        flock.add(goose);

        Quackologist quackologist=new Quackologist();
        flock.registerObserver(quackologist);

        flock.quack();
        System.out.println(QuackCounter.counter);
    }
    public static void main(String[] args) {
	// write your code here
        AbstractDuckFactory duckFactory=new CountingDuckFactory();
        simulate(duckFactory);
    }
}
