package com.company;

import java.util.ArrayList;
import java.util.Collections;

public class DeckOfCards {
    private ArrayList<Card> deck;

    //constructs a standard deck of cards
    public DeckOfCards(){
        deck = new ArrayList<Card>();
        shuffle();
    }

    public void reshuffle(){
        Collections.shuffle(deck);
    }

    public void shuffle(){
        deck.clear();
        for (Suit suit : Suit.values()) {
            for (Rank rank : Rank.values()) {
                Card c = new Card(suit, rank);
                deck.add(c);
            }
        }
        reshuffle();
    }

    public Card dealcard(){
        if(deck.size()<1){
            shuffle();
        }
        Card card = deck.get(0);
        deck.remove(0);
        return card;
    }


}
