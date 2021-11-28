package com.company.state;

import com.company.Player;
import com.company.visitor.Visitor;

public class Injured implements HealthState {

    private Player player;


    public Injured(Player player){
        this.player = player;
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
    public int accept(Visitor v) {
        return v.visit(this);
    }

}
