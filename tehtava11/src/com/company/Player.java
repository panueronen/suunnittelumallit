package com.company;

import com.company.memento.Riddler;

import java.util.Random;

public class Player implements Runnable {
    private final int playernumber;
    private final Object memento;
    private Thread t;

    //Constructor used by the Riddler class
    public Player(Object memento, int playernumber) {
        Riddler.joinGame();
        this.memento = memento;
        this.playernumber = playernumber;
    }

    @Override
    public void run() {
        System.out.println("Running " + playernumber);
        Random rn = new Random();
        try { //random number generator that waits 50 ms after a failed guess the rerolls
            while (!Riddler.correctGuess(rn.nextInt(10 +1), this.memento , this.playernumber)) {
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
