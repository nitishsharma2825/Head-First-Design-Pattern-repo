package com.company;

import java.util.Scanner;

public class Coffee extends CaffeineBeverage{
    public Coffee() {
    }

    @Override
    void brew() {
        System.out.println("Coffee is preparing");
    }

    @Override
    void addCondiments() {
        System.out.println("Adding lemon");
    }

    @Override
    boolean userWantsCondiments(){
        System.out.println("Do you need condiments");
        Scanner sc=new Scanner(System.in);
        int ans=sc.nextInt();
        if(ans==1){
            return true;
        }
        return false;
    }
}
