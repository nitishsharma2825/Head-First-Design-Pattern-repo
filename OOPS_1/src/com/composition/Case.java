package com.composition;

public class Case {
    private String model;
    private String manufacturer;
    private Dimensions dimension;

    public Case(String model, String manufacturer, Dimensions dimension) {
        this.model = model;
        this.manufacturer = manufacturer;
        this.dimension = dimension;
    }
    public void pressPowerButton(){
        System.out.println("Power Button Pressed");
    }

    public String getModel() {
        return model;
    }

    public String getManufacturer() {
        return manufacturer;
    }

    public Dimensions getDimension() {
        return dimension;
    }
}
