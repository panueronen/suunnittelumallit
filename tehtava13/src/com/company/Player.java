package com.company;

import com.company.state.Dying;
import com.company.state.HealthState;
import com.company.state.Healthy;
import com.company.state.Injured;
import com.company.visitor.BonusVisitor;
import com.company.visitor.Visitor;

public class Player {
    private HealthState healthState;
    private Healthy healthy = new Healthy(this);
    private Injured injured = new Injured(this);
    private Dying dying = new Dying(this);


    private final String name;
    private int points;

    public Player(String name){
        this.name=name;
        this.healthState = healthy;
    }
    public HealthState getHealthState(){
        return this.healthState;
    }

    public String getName(){
        return this.name;
    }
    public int getPoints(){
        return this.points;
    }

    public void addPoints(int points){
        this.points += points;
    }
    public void accept(Visitor v){
        healthState.accept(v);
        addPoints(healthState.accept(v));
    }

    public void takeDamage(){
        if(this.healthState == healthy ){
            this.healthState = injured;
        }else if(this.healthState == injured){
            this.healthState = dying;
        }else if (this.healthState == dying){
            System.out.println("You are practically dead and can't receive damage");
        }else{
            System.out.println("You have clearly ascended mortality or something, this should not be happening");
        }
    }

}
