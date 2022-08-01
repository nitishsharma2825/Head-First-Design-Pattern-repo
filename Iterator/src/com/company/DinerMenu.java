package com.company;

public class DinerMenu implements Menu{
    static final int MAX_ITEMS=6;
    int numberOfItems=0;
    MenuItem[] items;

    public DinerMenu() {
        items=new MenuItem[MAX_ITEMS];
        addItem("A","first dinner item",true,2.89);
        addItem("B","second dinner item",false,3.49);
        addItem("C","third dinner item",true,5.49);
        addItem("D","fourth dinner item",false,2.29);
    }
    public void addItem(String a,String b,boolean c,double d){
        MenuItem item=new MenuItem(a,b,c,d);
        if(numberOfItems>=MAX_ITEMS){
            System.out.println("Max limit reached");
        } else {
            items[numberOfItems++]=item;
        }
    }

    public Iterator createIterator(){
        return new DinerMenuIterator(items);
    }

}
