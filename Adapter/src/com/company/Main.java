package com.company;

public class Main {

    public static void main(String[] args) {
	// write your code here
        Duck duck=new MallardDuck();
        duck.fly();
        WildTurkey turkey=new WildTurkey();
        turkey.fly();
        Turkey duckAdapter=new DuckAdapter(duck);
        duckAdapter.fly();
        Duck turkeyAdapter=new TurkeyAdapter(turkey);
        turkeyAdapter.fly();

    }
}
