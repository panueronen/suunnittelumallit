package com.company;

public class AmericanCar {
    private String model;
    private int modelyear;
    //So far so good but the next units are in freedom units and they are no go for our european customers
    private int weight;
    private double length;
    private double width;
    private double height;

    public AmericanCar(String model, int modelyear, int weight, double length, double width,double height){
        this.model=model;
        this.modelyear=modelyear;
        this.weight=weight;
        this.length=length;
        this.width=width;
        this.height=height;
    }

    public double getHeight() {
        return height;
    }

    public double getLength() {
        return length;
    }

    public double getWidth() {
        return width;
    }

    public int getModelyear() {
        return modelyear;
    }

    public String getModel() {
        return model;
    }

    public int getWeight() {
        return weight;
    }
}
