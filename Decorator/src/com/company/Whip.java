package com.company;

public class Whip extends CondimentDecorator{
    private final BeverageComponent beverage;
    public Whip(BeverageComponent b) {
        this.beverage = b;
    }

    @Override
    public double cost() {
        double ans=0.10+ beverage.cost();
        if(getSize()==0){
            ans+=0.10;
        } else if (getSize()==1){
            ans+=0.15;
        } else {
            ans+=0.20;
        }
        return ans;
    }

    @Override
    public String getDescription() {
        return beverage.getDescription()+" with whip";
    }

    @Override
    public int getSize() {
        return beverage.getSize();
    }
}
