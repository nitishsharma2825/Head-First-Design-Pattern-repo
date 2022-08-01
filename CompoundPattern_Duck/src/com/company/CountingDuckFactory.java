package com.company;

public class CountingDuckFactory extends AbstractDuckFactory{

    @Override
    Quackable createDuck(String name) {
        if(name.equals("MallardDuck")){
            return new QuackCounter(new MallardDuck());
        } else if(name.equals("RubberDuck")){
            return new QuackCounter(new RubberDuck());
        } else if(name.equals("DuckCall")){
            return new QuackCounter(new DuckCall());
        } else if(name.equals("Goose")){
            return new QuackCounter(new GooseAdapter(new Goose()));
        }
        return null;
    }
}
