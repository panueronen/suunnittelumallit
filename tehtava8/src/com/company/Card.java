package com.company;

public class Card {

    private final Rank rank;
    private final Suit suit;

    public Card(Suit suit, Rank rank) {
        this.suit = suit;
        this.rank = rank;
    }

    public int getNumericValue() {
        if (rank.ordinal() + 2 > 10 && rank.ordinal() + 2 < 14) {
            return 10;
        } else if (rank.ordinal() + 2 == 14) {
            return 11;
        }else{
            return rank.ordinal() + 2;
        }
    }

    @Override
    public String toString() {
        return rank + " of " + suit + "s";
    }
}
