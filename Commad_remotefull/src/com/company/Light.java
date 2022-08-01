package com.company;

public class Light {
    private String type;

    public Light(String type) {
        this.type = type;
    }
    public void on(){
        System.out.println(type+" is on");
    }
    public void off(){
        System.out.println(type+" is off");
    }
}
