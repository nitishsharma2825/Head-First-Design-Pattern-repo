package com.company;

public class ChocoFactory_withdoublecheckedlocking {
    private volatile static ChocoFactory_withdoublecheckedlocking uniqueInstance;
    private boolean empty;
    private boolean boiled;

    private ChocoFactory_withdoublecheckedlocking(){
        empty=true;
        boiled=false;
    }
    public static ChocoFactory_withdoublecheckedlocking getInstance(){
        if(uniqueInstance==null){
            synchronized(ChocoFactory_withdoublecheckedlocking.class){
                if(uniqueInstance==null){
                    uniqueInstance=new ChocoFactory_withdoublecheckedlocking();
                }
            }
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
