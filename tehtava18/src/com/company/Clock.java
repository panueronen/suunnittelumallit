package com.company;

public class Clock implements Cloneable{

    ClockArm hour;
    ClockArm minute;

    public Clock(){
        this.hour = new ClockArm(0);
        this.minute = new ClockArm(0);
    }
    public void advance(){
        minute.setPointsTo(minute.getPointsTo()+1);
        if(minute.getPointsTo()==60){
            minute.setPointsTo(0);
            hour.setPointsTo(hour.getPointsTo()+1);
            if(hour.getPointsTo()==24){
                hour.setPointsTo(0);
            }
        }
    }
    public void setTime(int newhour, int newminute){
        if(newhour > 23 || newminute > 59){
            System.out.println("Why are you like this");
        }else{
            hour.setPointsTo(newhour);
            minute.setPointsTo(newminute);
        }
    }
    public String getTime(){
        return this.hour +":"+ this.minute;
    }
    @Override
    public Clock clone() throws CloneNotSupportedException {
        try {
            Clock clone = (Clock) super.clone();
            clone.hour = hour.clone();
            clone.minute = minute.clone();
            return clone;
        } catch (CloneNotSupportedException e) {
            throw new CloneNotSupportedException();
        }
    }
}
