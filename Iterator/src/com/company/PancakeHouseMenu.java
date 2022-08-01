package com.company;

import java.util.ArrayList;

public class PancakeHouseMenu implements Menu{
    ArrayList<MenuItem> items;

    public PancakeHouseMenu() {
        items=new ArrayList<>();
        addItem("A","first pan item",true,2.89);
        addItem("B","second pan item",false,3.49);
        addItem("C","third pan item",true,5.49);
        addItem("D","fourth pan item",false,2.29);
    }
    public void addItem(String a,String b,boolean c,double d){
        MenuItem item=new MenuItem(a,b,c,d);
        items.add(item);
    }
    public Iterator createIterator(){
        return new PancakeHouseIterator(items);
    }
}
