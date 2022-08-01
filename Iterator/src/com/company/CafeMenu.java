package com.company;

import java.util.Hashtable;

public class CafeMenu implements Menu{
    Hashtable items;

    public CafeMenu() {
        items=new Hashtable();
        addItem("A","first cafe item",true,2.89);
        addItem("B","second cafe item",false,3.49);
        addItem("C","third cafe item",true,5.49);
        addItem("D","fourth cafe item",false,2.29);
    }
    public void addItem(String a,String b,boolean c,double d){
        MenuItem item=new MenuItem(a,b,c,d);
        items.put(item.getName(),item);
    }
    @Override
    public Iterator createIterator() {
        return null;
    }

}
