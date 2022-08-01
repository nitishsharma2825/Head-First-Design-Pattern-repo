package com.innerclass_prac;

import java.util.ArrayList;

public class GearBox {
    private ArrayList<Gear> gears;
    private int maxGears;
    private int curGear=0;

    public GearBox(int maxGears) {
        this.gears = new ArrayList<Gear>();
        this.maxGears = maxGears;
        Gear neutral=new Gear(0,0.0);
        this.gears.add(neutral);
    }

//    public class Gear{
//        private int gearNumber;
//        private double ratio;
//
//        public Gear(int gearNumber, double ratio) {
//            this.gearNumber = gearNumber;
//            this.ratio = ratio;
//        }
//    }
    private class Gear{
        private int gearNumber;
        private double ratio;

        public Gear(int gearNumber, double ratio) {
            this.gearNumber = gearNumber;
            this.ratio = ratio;
        }
    }
    public void addGear(int a,double b){
        this.gears.add(new Gear(a,b));
    }

}
