package com.company;

public class ClockArm implements Cloneable{

    private int pointsTo;

    public ClockArm(int angle){
        this.pointsTo=angle;
    }

    public int getPointsTo(){
        return this.pointsTo;
    }
    public void setPointsTo(int pointsTo){
        this.pointsTo=pointsTo;
    }

    @Override
    public String toString() {
        return String.valueOf(pointsTo);
    }

    public ClockArm clone() throws CloneNotSupportedException {
        return (ClockArm) super.clone();
    }
}
