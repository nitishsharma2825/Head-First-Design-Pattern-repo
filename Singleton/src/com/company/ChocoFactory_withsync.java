package com.company;

public class ChocoFactory_withsync {
    private static ChocoFactory_withsync uniqueInstance;
    private boolean empty;
    private boolean boiled;

    private ChocoFactory_withsync(){
        empty=true;
        boiled=false;
    }
    public static synchronized ChocoFactory_withsync getInstance(){
        if(uniqueInstance==null){
            uniqueInstance=new ChocoFactory_withsync();
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
