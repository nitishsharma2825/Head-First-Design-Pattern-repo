package com.company;

public class SortingDuck implements Comparable{
    private String name;
    private int weight;

    public SortingDuck(String name, int weight) {
        this.name = name;
        this.weight = weight;
    }

    public SortingDuck() {
        super();
    }

    @Override
    public String toString() {
        return name+" "+weight;
    }

    @Override
    public int compareTo(Object o) {
        SortingDuck d=(SortingDuck)o;
        // ascending order
        if(this.weight==d.weight){
            return 0;
        } else if(this.weight<d.weight){
            return -1;
        } else {
            return 1;
        }
    }
}
