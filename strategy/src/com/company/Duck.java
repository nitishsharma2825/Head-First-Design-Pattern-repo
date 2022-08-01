package com.company;

public abstract class Duck {
    private Flyable flyable;
    private Quackable quackable;
    public Duck() {
    }
    public void swim(){
        System.out.println("All ducks swim, the functionality is same");
    }
    public void performFly(){
        flyable.fly();
    }
    public void performQuack(){
        quackable.quack();
    }

    public void setFlyable(Flyable flyable) {
        this.flyable = flyable;
    }

    public void setQuackable(Quackable quackable) {
        this.quackable = quackable;
    }
    public abstract void display();
}
