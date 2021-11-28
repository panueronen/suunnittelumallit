package com.company;

import com.company.state.Dying;
import com.company.state.HealthState;
import com.company.state.Healthy;
import com.company.state.Injured;
import com.company.visitor.BonusVisitor;
import com.company.visitor.Visitor;

public class Player {
    private HealthState healthState;
    private final String name;
    private int points;

    public Player(String name){
        this.name=name;
        this.healthState = Healthy.getInstance();
    }
    public HealthState getHealthState(){
        if (this.healthState == Healthy.getInstance()){
            return Healthy.getInstance();
        }else if(this.healthState == Injured.getinstance()){
            return Injured.getinstance();
        }else{
            return Dying.getinstance();
        }
    }
    public void accept(Visitor v){
        v.visit(this.healthState);
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

    public void takeDamage(){
        if(this.healthState == Healthy.getInstance()){
            this.healthState = Injured.getinstance();
        }else if(this.healthState == Injured.getinstance()){
            this.healthState = Dying.getinstance();
        }else if (this.healthState == Dying.getinstance()){
            System.out.println("You are practically dead and can't receive damage");
        }else{
            System.out.println("You have clearly ascended mortality or something, this should not be happening");
        }
    }

}
