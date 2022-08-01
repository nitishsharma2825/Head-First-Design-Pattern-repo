package com.company;

public class ChocoFactory1 {
    private static ChocoFactory1 uniqueInstance;
    private boolean empty;
    private boolean boiled;

    private ChocoFactory1(){
        empty=true;
        boiled=false;
    }
    public static ChocoFactory1 getInstance(){
        if(uniqueInstance==null){
            uniqueInstance=new ChocoFactory1();
        }
        return uniqueInstance;
    }
    public void fill(){
        if(isEmpty()){
            empty=false;
            boiled=false;
        }
    }
    public boolean isEmpty(){
        return empty;
    }
}
