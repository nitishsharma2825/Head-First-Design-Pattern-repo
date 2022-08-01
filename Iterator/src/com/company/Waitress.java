package com.company;

import java.util.ArrayList;

public class Waitress {
    ArrayList<Menu> menus;

    public Waitress(ArrayList<Menu> menus) {
        this.menus=menus;
    }

    public void printMenu(){
        for(Menu menu:menus){
            printMenu(menu.createIterator());
        }
    }
    public void printMenu(Iterator iterator){
        while(iterator.hasNext()){
            System.out.println(iterator.next());
        }
    }
}
