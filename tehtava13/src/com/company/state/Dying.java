package com.company.state;

import com.company.Player;
import com.company.visitor.Visitor;

public class Dying implements HealthState {
private Player player;

    public Dying(Player player){
        this.player = player;
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
    public int accept(Visitor v) {
        return v.visit(this);
    }


}
