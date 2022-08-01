package com.company;

public class Main {

    public static void main(String[] args) {
	    // write your code here
        BeverageComponent beverage=new DarkRoast(0);
        beverage=new Milk(beverage);
        System.out.println(beverage.getDescription()+" $"+beverage.cost());

        BeverageComponent beverage2=new Espresso(2);
        beverage2=new Whip(beverage2);
        System.out.println(beverage2.getDescription()+" $"+beverage2.cost());
    }
}
