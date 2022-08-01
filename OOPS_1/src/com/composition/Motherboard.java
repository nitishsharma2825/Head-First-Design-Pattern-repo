package com.composition;

public class Motherboard {
    private String model;
    private String manufacturer;
    private int ramSlots;

    public Motherboard(String model, String manufacturer, int ramSlots) {
        this.model = model;
        this.manufacturer = manufacturer;
        this.ramSlots = ramSlots;
    }

    public void loadProgram(String a){
       System.out.println(a+" is loading");
    }
    public String getModel() {
        return model;
    }

    public void setModel(String model) {
        this.model = model;
    }

    public String getManufacturer() {
        return manufacturer;
    }

    public void setManufacturer(String manufacturer) {
        this.manufacturer = manufacturer;
    }

    public int getRamSlots() {
        return ramSlots;
    }

    public void setRamSlots(int ramSlots) {
        this.ramSlots = ramSlots;
    }
}
