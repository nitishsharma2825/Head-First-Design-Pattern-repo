package com.company;

import java.util.Arrays;
import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
	// write your code here
        Tea tea=new Tea();
        tea.prepare();
        Coffee coffee=new Coffee();
        coffee.prepare();

        SortingDuck[] ducks=new SortingDuck[5];
        Scanner sc=new Scanner(System.in);
        for(int i=0;i<5;i++){
            ducks[i]=new SortingDuck(sc.next(),sc.nextInt());
        }
        Arrays.sort(ducks);
        for(int i=0;i<5;i++){
            System.out.println(ducks[i].toString());
        }
    }
}
