package com.company;

public class Dog extends Animal {
    private int eyes;
    private int legs;
    private int tail;
    private int teeth;
    private String coat;

    public Dog(int size, int weight, String name,int eyes,int tail,int teeth,String coat) {
        super(1, 1, size, weight, name);
        this.eyes=eyes;
        this.legs=legs;
        this.tail=tail;
        this.teeth=teeth;
        this.coat=coat;
    }

    private void chew(){
        System.out.println("Dog chews not eats");
    }

    @Override
    public void eat() {
        chew();
        super.eat();
    }

    public void walk(){
        System.out.println("Dog.walk() called");
        move();
    }
    public void run(){
        System.out.println("Dog.run() called");
        super.move();
    }
}
