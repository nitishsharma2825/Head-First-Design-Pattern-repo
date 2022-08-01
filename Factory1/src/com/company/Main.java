package com.company;

public class Main {

    public static void main(String[] args) {
	// write your code here
        PizzaStore nyPizzaStore=new NYPizzaStore();
        Pizza pizza=nyPizzaStore.orderPizza("cheese");

        System.out.println("Nitesh ordered a+ "+pizza.getName());
        PizzaStore chPizzaStore=new ChicagoPizzaStore();
        pizza=chPizzaStore.orderPizza("cheese");
        System.out.println("John ordered a "+pizza.getName());

    }
}
