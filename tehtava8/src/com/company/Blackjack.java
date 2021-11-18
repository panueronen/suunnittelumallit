package com.company;

import java.lang.reflect.Array;
import java.util.ArrayList;
import java.util.Scanner;

public class Blackjack extends Game{
    private boolean end = false;
    private int playerscount;
    DeckOfCards deck;
    private ArrayList<Card> hand;
    private ArrayList<ArrayList<Card>> hands;
    Scanner scanner = new Scanner(System.in);

    @Override
    protected void initializeGame(int playerscount) {
        deck = new DeckOfCards();
        this.playerscount = playerscount;
        //make hands
        hands = new ArrayList<>();
        for(int i = 0; i<this.playerscount; i++){
            hands.add(hand = new ArrayList<>());
            hands.get(i).add(deck.dealcard());
            hands.get(i).add(deck.dealcard());
        }
    }

    @Override
    protected void makePlay(int player) {
        System.out.println("Player " + player + " Your hand total is " + handTotal(player) + " With " + hands.get(player));
        System.out.println("Hit (h) or Stay (s)");
        String choice = scanner.nextLine();
        while(choice.equals("h")){
            hands.get(player).add(deck.dealcard());
            System.out.println(handTotal(player));
            if(handTotal(player) > 21){
                System.out.println("BUST!");
                break;
            }
            System.out.println("Hit (h) or Stay (s)");
            choice = scanner.nextLine();
        }
            if(player == this.playerscount - 1){
                this.end = true;
            }
            System.out.println("Next player");
    }

    @Override
    protected boolean endOfGame() {
        return end;
    }

    @Override
    protected void printWinner() {
        ArrayList <Integer> winners = new ArrayList<Integer>();
        int winninghand = 0;
        for(int i = 0; i < this.playerscount; i++){
            if(handTotal(i) <22){
                if(handTotal(i)==winninghand){
                    winners.add(i);
                }else if(handTotal(i) > winninghand){
                    winners.clear();
                    winninghand = handTotal(i);
                    winners.add(i);
                }
            }
        }
        //Prints for single, multiple and no winners
        if(winners.size()<1){
            System.out.println("No winners this round");
        }else if(winners.size() == 1){
            System.out.println("The winner is player " + winners);
        }else{
            System.out.println("The winners are " + winners);
        }
    }

    private int handTotal(int player){
        int total =0;
        for(int i = 0; i <hands.get(player).size();i++){

            //Handles the ace exception so the player does not lose because ace would take him above 21
            if(total + hands.get(player).get(i).getNumericValue() > 21 && hands.get(player).get(i).getNumericValue() == 11){
                total = total + 1;
            }else{
                total = total + hands.get(player).get(i).getNumericValue();
            }
        }
        return total;
    }
}
