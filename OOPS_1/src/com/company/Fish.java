package com.company;

public class Fish extends Animal{

    private int gills;
    private int eyes;
    private int fins;

    public Fish(int size, int weight, String name, int gills, int eyes, int fins) {
        super(1, 1, size, weight, name);
        this.gills = gills;
        this.eyes = eyes;
        this.fins = fins;
    }
    private void rest(){

    }

    @Override
    public void move() {
        swim();
        super.move();
    }

    private void swim(){
        moveMuscles();
        moveBackFins();
        super.move();
    }
    private void moveMuscles(){
        System.out.println("Fish.movemuscles() called");
    }
    private void moveBackFins(){
        System.out.println("Fish.moveBackFins() called");
    }


}
