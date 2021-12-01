package com.company;

public class AdapterImpl implements Adapter {

    //autokauppa haluaa auton kaikki auton tiedot String muodossa Eurooppalaisissa yksiköissä joiden perässä on tunnus
    private AmericanCar car;

    public AdapterImpl(AmericanCar car) {
        this.car = car;
    }

    @Override
    public String getModel() {
        return car.getModel();
    }

    @Override
    public String getModelYear() {
        return String.valueOf(car.getModelyear());
    }

    @Override
    public String getWeight() {
        return String.valueOf(car.getWeight() * 0.45359237) + " Kg";
    }

    @Override
    public String getLenght() {
        return String.valueOf(car.getLength() * 2.54 + " Cm");
    }

    @Override
    public String getWidth() {
        return car.getWidth() * 2.54 + " Cm";
    }

    @Override
    public String getHeight() {
        return String.valueOf(car.getHeight() * 2.54 + " Cm");
    }


}
