package com.company.state;

import com.company.visitor.Visitor;

public interface HealthState {
    public double movementSpeed();
    public Boolean breathingNoise();
    public Boolean gruntsOfPain();
    public abstract void accept(Visitor v);
}
