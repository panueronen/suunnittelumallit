package com.company;

public class Main {

    public static void main(String[] args) {
	// write your code here
        Card card = new Card(Suit.Spade,Rank.Ace);
        System.out.println(card.getNumericValue());
        new Blackjack().playOneGame(2);
    }
}
