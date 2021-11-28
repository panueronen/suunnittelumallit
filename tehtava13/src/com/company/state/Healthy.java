package com.company.state;

import com.company.Player;
import com.company.visitor.Visitor;

public class Healthy implements HealthState {
    private Player player;

    public Healthy(Player player){
        this.player = player;
    };


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
    public int accept(Visitor v) {
        return v.visit(this);
    }

}
