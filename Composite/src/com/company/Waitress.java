package com.company;

import java.util.Iterator;

public class Waitress {
    MenuComponent allMenus;

    public Waitress(MenuComponent allMenus) {
        this.allMenus = allMenus;
    }
    public void printMenus(){
        allMenus.print();
    }
    public void printAllVeg(){
        Iterator iterator=allMenus.createIterator();
        while(iterator.hasNext()){
            MenuComponent component= (MenuComponent) iterator.next();
            try{
                if(component.isVegetarian()){
                    component.print();
                }
            } catch (UnsupportedOperationException e){}
        }
    }
}
