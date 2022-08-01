package com.company;

import java.util.ArrayList;
import java.util.Iterator;

public class Menu extends MenuComponent{
    ArrayList<MenuComponent> menus;
    String name;
    String description;
    Iterator iterator=null;

    public Menu(String name, String description) {
        menus=new ArrayList<>();
        this.name = name;
        this.description = description;
    }

    @Override
    public void add(MenuComponent m) {
        menus.add(m);
    }

    @Override
    public void remove(MenuComponent m) {
        menus.remove(m);
    }

    @Override
    public MenuComponent getChild(int i) {
        return menus.get(i);
    }

    @Override
    public String getName() {
        return name;
    }

    @Override
    public String getDescription() {
        return description;
    }

    @Override
    public void print() {
        System.out.println(name+" "+description);
        for(MenuComponent menu:menus){
            menu.print();
        }
    }

    public Iterator createIterator() {
        if(iterator==null){
            return new CompositeIterator(menus.iterator());
        }
        return iterator;
    }
}
