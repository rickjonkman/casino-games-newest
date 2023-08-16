package org.rickjonkman.blackjack;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Stack;

public class LowDeck extends Deck {
    Stack<Card> lowDeckCards = new Stack<>();

    public LowDeck() {
        ArrayList<CardValue> lowValues = new ArrayList<>();

        int[] lowValueNumbers = {2, 3, 4, 5, 6, 7, 8, 9, 10};
        String[] lowValueNames = {"two", "three", "four", "five", "six", "seven", "eight", "nine", "ten"};

        CardSuit[] lowSuits = new CardSuit[]{
                new CardSuit("diamonds", '\u2666', "red"),
                new CardSuit("spades", '\u2660', "Black"),
                new CardSuit("hearts", '\u2665', "red"),
                new CardSuit("clubs", '\u2663', "black")
        };

        for (int i = 0; i < lowValueNumbers.length; i++) {
            lowValues.add(new CardValue(lowValueNames[i], lowValueNumbers[i]));
        }

        for (CardSuit suit : lowSuits) {
            for (CardValue value : lowValues) {
                Card card = new Card(suit, value);
                lowDeckCards.add(card);
            }
        }
    }

    @Override
    public void shuffle() {
        Collections.shuffle(lowDeckCards);
    }

    @Override
    public Card getNextCard() {
        return lowDeckCards.pop();
    }
}
