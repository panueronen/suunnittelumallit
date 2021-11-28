package com.company.state;

import com.company.visitor.Visitor;

public class Healthy implements HealthState {

    private static Healthy instance = null;

    private Healthy(){};

    public static Healthy getInstance(){
        if (instance == null){
            instance = new Healthy();
        }
        return Healthy.instance;
    }

    @Override
    public double movementSpeed() {
        return 5;
    }

    @Override
    public Boolean breathingNoise() {
        return true;
    }

    @Override
    public Boolean gruntsOfPain() {
        return false;
    }

    @Override
    public void accept(Visitor v) {
        v.visit(this);
    }

}
