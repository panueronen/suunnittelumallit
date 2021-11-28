package com.company.state;

import com.company.visitor.Visitor;

public class Dying implements HealthState {


    private static Dying instance = null;

    private Dying(){

    }

    public static Dying getinstance(){
        if(instance == null){
            Dying.instance = new Dying();
        }
        return Dying.instance;
    }



    @Override
    public double movementSpeed() {
        return 0.1;
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
