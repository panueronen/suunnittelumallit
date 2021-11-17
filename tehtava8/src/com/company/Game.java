package com.company;

public abstract class Game {
    protected int playersCount;

    protected abstract void initializeGame(int playersCount);

    protected abstract void makePlay(int player);

    protected abstract boolean endOfGame();

    protected abstract void printWinner();

    public final void playOneGame(int playersCount) {
        this.playersCount = playersCount;
        initializeGame(playersCount);
        var currentPlayer = 0;
        while (!endOfGame()) {
            makePlay(currentPlayer);
            currentPlayer = (currentPlayer + 1) % playersCount;
        }
        printWinner();
    }
}
