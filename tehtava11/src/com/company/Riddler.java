package com.company;

import java.util.Random;

public class Riddler {

    private final int numberOfPlayers;

    public Riddler(int players) {
        numberOfPlayers = players;

        for (int i = 0; i < numberOfPlayers; i++) {
            new Player(Riddler.joinGame(), i + 1).start();
        }

    }


    public static Memento joinGame() {
        Random rn = new Random();
        return new Memento(rn.nextInt(10) + 1);
    }

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
