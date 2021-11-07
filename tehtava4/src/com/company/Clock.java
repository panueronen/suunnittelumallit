package com.company;

import java.util.Observable;

public class Clock extends Observable {
    private static Clock singleton_instance = null;
    public int time = 0;

    private Clock(){}

    public static Clock getinstance(){
        if(singleton_instance == null) singleton_instance = new Clock();

        return singleton_instance;
    }
    public int getTime(){
        return time;
    }

    public void tick(){
        setChanged();
        time++;
        notifyObservers();
    }
    public void setTime(int time){
        setChanged();
        this.time = time;
        notifyObservers();
    }



}
