package com.company;

import java.util.Scanner;

public class Tea extends CaffeineBeverage{
    public Tea() {
    }

    @Override
    void brew() {
        System.out.println("Preparing tea");
    }

    @Override
    void addCondiments() {
        System.out.println("Adding Sugar and milk");
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
