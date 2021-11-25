package com.company.memento;

import com.company.Player;

import java.util.Random;

public class Riddler {

    //Constructor for riddle that creates players and starts their game immediately
    public Riddler(int players) {

        for (int i = 0; i < players; i++) {
            new Player(Riddler.joinGame(), i + 1).start();
        }

    }

    //Gives the players their number in a memento, Players store this as an Object
    public static Memento joinGame() {
        Random rn = new Random();
        return new Memento(rn.nextInt(10) + 1);
    }

    //method that the player call to check if the number is correct
    public static boolean correctGuess(int guess, Object object, int player) {
        Memento memento = (Memento) object;
        if (guess == memento.getNumber()) {
            System.out.println("Oikein meni Pelaaja " + player);
            return true;
        } else {
            System.out.println("Väärin meni Pelaaja " + player);
            return false;
        }
    }


}
