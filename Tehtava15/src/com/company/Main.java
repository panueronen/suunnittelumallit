package com.company;

public class Main {

    public static void main(String[] args) {

        //American car with american units
	AmericanCar acar = new AmericanCar("Cadillac xt4", 2020, 5181, 181.1, 83.5,64.1);

    //Adapter and car it adapts
    AdapterImpl adapter = new AdapterImpl(acar);

    
    System.out.println(adapter.getModel());
    System.out.println(adapter.getModelYear());
    System.out.println(adapter.getWeight());
    System.out.println(adapter.getLenght());
    System.out.println(adapter.getWidth());
    System.out.println(adapter.getHeight());
    }
}
