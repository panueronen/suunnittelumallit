package com.company.state;

import com.company.visitor.Visitor;

public class Injured implements HealthState {

    private static Injured instance = null;

    private Injured(){

    }
    public static Injured getinstance(){
        if(instance == null){
            Injured.instance = new Injured();
        }
        return Injured.instance;
    }

    @Override
    public double movementSpeed() {
        return 4.5;
    }

    @Override
    public Boolean breathingNoise() {
        return true;
    }

    @Override
    public Boolean gruntsOfPain() {
        return true;
    }

    @Override
    public void accept(Visitor v) {
        v.visit(this);
    }

}
