package com.company;

import java.util.Random;

public class Player implements Runnable {
    private int playernumber;
    private Object memento;
    private Thread t;

    public Player(Object memento, int playernumber) {
        Riddler.joinGame();
        this.memento = memento;
        this.playernumber = playernumber;
    }

    @Override
    public void run() {
        System.out.println("Running " + playernumber);
        Random rn = new Random();
        try {
            while (!Riddler.correctGuess(rn.nextInt(10 + 1), this.memento, this.playernumber)) {
                Thread.sleep(50);
            }
        } catch (InterruptedException e) {
            System.out.println("Thread " + playernumber + " interrupted.");
        }
        System.out.println("Player " + playernumber + " Quitting");
    }

    public void start() {
        System.out.println("Starting " + playernumber);
        if (t == null) {
            t = new Thread(this, String.valueOf(playernumber));
            t.start();
        }
    }
}
