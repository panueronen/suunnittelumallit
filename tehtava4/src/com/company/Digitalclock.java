package com.company;

import java.awt.image.ImageObserver;
import java.util.Observable;
import java.util.Observer;

public class Digitalclock implements Observer {
    private Clock clock = Clock.getinstance();

    public Digitalclock(){
    }

    @Override
    public void update(Observable o, Object time) {
        System.out.println("time is " + Clock.getinstance().getTime());
    }
}
